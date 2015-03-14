package dcll.amah.mysimplestack;

import junit.framework.TestCase;

import java.util.EmptyStackException;

public class SimpleStackTest extends TestCase {


    public void testCreateEmptyStack() { // Test case

        // Code under test
        SimpleStack stack = new Stack();

        // Assertions (oracle)
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    public void testIsEmpty() throws Exception {

    }

    public void testGetSize() throws Exception {

    }

    //@Test
    public void testPush() throws Exception {
        // Setup the "state of the world"
       /* SimpleStack stack = new Stack();
        Item item = new Item();

        // Code under test
        stack.push(item);

        // assertions (oracle)
        assertFalse("The stack must be not empty", !stack.isEmpty());
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());*/
    }

   // @Test
    public void testPeek() throws Exception {
      /*  // Setup the "state of the world"
        SimpleStack stack = new Stack();

        // Code under test
        stack.peek(); // should throws an EmptyStackException.*/

    }

    //@Test(expected = EmptyStackException.class)
    public void testPop() throws Exception {
       /* // Setup the "state of the world"
        SimpleStack stack = new Stack();

        // Code under test
        stack.pop(); // should throws an EmptyStackException.*/

    }
}