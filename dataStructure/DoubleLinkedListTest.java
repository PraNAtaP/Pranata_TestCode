// DoubleLinkedListTest.java
package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class DoubleLinkedListTest {
    @Test
    // addFirst-removeFirst-addFirst-addFirst-removeFirst
    public void testDLL1() {
        DoubleLinkedList list = new DoubleLinkedList();
        // Input values
        int codeInput1 = -50;
        int codeInput2 = 200;
        int codeInput3 = 15;
        // Expected outputs
        int expectedOutput1 = -50; // peek after first insert
        boolean expectedOutput2 = false;
        int expectedOutput3 = 0; // peek after remove (empty)
        boolean expectedOutput4 = true;
        int expectedOutput5 = 200;
        boolean expectedOutput6 = false;
        int expectedOutput7 = 15;
        boolean expectedOutput8 = false;
        int expectedOutput9 = 200; // peek after removeFirst again
        boolean expectedOutput10 = false;
        try {
            list.addFirst(codeInput1);
            assertEquals(expectedOutput1, list.peekFirst());
            assertEquals(expectedOutput2, list.isEmpty());
            list.removeFirst();
            assertEquals(expectedOutput3, list.isEmpty() ? 0 : list.peekFirst());
            assertEquals(expectedOutput4, list.isEmpty());
            list.addFirst(codeInput2);
            assertEquals(expectedOutput5, list.peekFirst());
            assertEquals(expectedOutput6, list.isEmpty());
            list.addFirst(codeInput3);
            assertEquals(expectedOutput7, list.peekFirst());
            assertEquals(expectedOutput8, list.isEmpty());
            list.removeFirst();
            assertEquals(expectedOutput9, list.peekFirst());
            assertEquals(expectedOutput10, list.isEmpty());
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // addLast-removeLast-addFirst-addLast-removeLast
    public void testDLL2() {
        DoubleLinkedList list = new DoubleLinkedList();
        // Input values
        int codeInput1 = 120;
        int codeInput2 = -30;
        int codeInput3 = 75;
        // Expected outputs
        int expectedOutput1 = 120; // peek after addLast(120)
        boolean expectedOutput2 = false; // isEmpty after addLast(120)

        int expectedOutput3 = 0; // peek after removeLast (empty)
        boolean expectedOutput4 = true; // isEmpty after removeLast
        int expectedOutput5 = -30; // peek after addFirst(-30)
        boolean expectedOutput6 = false; // isEmpty after addFirst(-30)
        int expectedOutput7 = -30; // peek after addLast(75)
        int expectedOutput8 = -30; // peek after removeLast
        boolean expectedOutput9 = false; // isEmpty after removeLast
        try {
            // Step 1: addLast(120)
            list.addLast(codeInput1);
            assertEquals(expectedOutput1, list.peekFirst());
            assertEquals(expectedOutput2, list.isEmpty());
            // Step 2: removeLast()
            list.removeLast();
            assertEquals(expectedOutput3, list.isEmpty() ? 0 : list.peekFirst());
            assertEquals(expectedOutput4, list.isEmpty());
            // Step 3: addFirst(-30)
            list.addFirst(codeInput2);
            assertEquals(expectedOutput5, list.peekFirst());
            assertEquals(expectedOutput6, list.isEmpty());
            // Step 4: addLast(75)
            list.addLast(codeInput3);
            assertEquals(expectedOutput7, list.peekFirst());
            // Step 5: removeLast()
            list.removeLast();
            assertEquals(expectedOutput8, list.peekFirst());
            assertEquals(expectedOutput9, list.isEmpty());
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // removeFirst, addFirst, addLast, addFirst, removeFirst, removeLast,
    // removeFirst.
    public void testDLL3() {
        DoubleLinkedList list = new DoubleLinkedList();
        // Input values
        int codeInput1 = 0;
        int codeInput2 = 999;
        int codeInput3 = -100;
        // Expected outputs
        boolean expectedOutput1 = true; // isEmpty after removeFirst (should not crash)
        int expectedOutput2 = 0; // peek after addFirst(0)
        boolean expectedOutput3 = false; // isEmpty after addFirst(0)
        int expectedOutput4 = 0; // peek after addLast(999)
        boolean expectedOutput5 = false; // isEmpty after addLast(999)
        int expectedOutput6 = -100; // peek after addFirst(-100)
        boolean expectedOutput7 = false; // isEmpty after addFirst(-100)
        int expectedOutput8 = 0; // peek after removeFirst()
        boolean expectedOutput9 = false; // isEmpty after removeFirst()
        int expectedOutput10 = 0; // peek after removeLast()
        boolean expectedOutput11 = true; // isEmpty after removeLast()
        try {
            // Step 1: removeFirst() (should not crash)
            list.removeFirst();
            assertEquals(expectedOutput1, list.isEmpty());
            // Step 2: addFirst(0)

            list.addFirst(codeInput1);
            assertEquals(expectedOutput2, list.peekFirst());
            assertEquals(expectedOutput3, list.isEmpty());
            // Step 3: addLast(999)
            list.addLast(codeInput2);
            assertEquals(expectedOutput4, list.peekFirst());
            assertEquals(expectedOutput5, list.isEmpty());
            // Step 4: addFirst(-100)
            list.addFirst(codeInput3);
            assertEquals(expectedOutput6, list.peekFirst());
            assertEquals(expectedOutput7, list.isEmpty());
            // Step 5: removeFirst()
            list.removeFirst();
            assertEquals(expectedOutput8, list.peekFirst());
            assertEquals(expectedOutput9, list.isEmpty());
            // Step 6: removeLast()
            list.removeLast();
            assertEquals(expectedOutput10, list.peekFirst());
            assertEquals(expectedOutput11, list.isEmpty());
            // Step 7: removeFirst()
            list.removeFirst();
            assertEquals(expectedOutput11, list.isEmpty());
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
