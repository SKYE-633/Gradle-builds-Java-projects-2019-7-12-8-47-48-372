package test;

import java.util.LinkedList;
import static org.mockito.Mockito.*;

public class Test {
    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }

    private LinkedList mock(Class<LinkedList> linkedListClass) {
    }
}
