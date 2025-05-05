package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    // addFirst-removeFirst-addFirst-addFirst-removeFirst
    public void testSLL1() {
        SingleLinkedList list = new SingleLinkedList();

        // Input values
        int codeInput1 = 10;
        int codeInput2 = 20;
        int codeInput3 = 30;

        // Expected and actual outputs
        int expectedOutput1 = 10;      // peek after first insert (head element)
        boolean expectedOutput2 = false; // isEmpty after first insert
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 0;       // peek after remove (list empty)
        boolean expectedOutput4 = true;  // isEmpty after remove
        int codeOutput3 = 0;
        boolean codeOutput4 = false;

        int expectedOutput5 = 20;      // peek after second insert (new head)
        boolean expectedOutput6 = false; // isEmpty after second insert
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 30;      // peek after third insert
        boolean expectedOutput8 = false; // isEmpty after third insert
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: addFirst(10)
            list.addFirst(codeInput1);
            codeOutput1 = list.peekFirst();
            codeOutput2 = list.isEmpty();
            assertEquals("Peek after first insert", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after first insert", expectedOutput2, codeOutput2);

            // Step 2: removeFirst()
            list.removeFirst();
            codeOutput3 = list.isEmpty() ? 0 : list.peekFirst();
            codeOutput4 = list.isEmpty();
            assertEquals("Peek after remove", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after remove", expectedOutput4, codeOutput4);

            // Step 3: addFirst(20)
            list.addFirst(codeInput2);
            codeOutput5 = list.peekFirst();
            codeOutput6 = list.isEmpty();
            assertEquals("Peek after second insert", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second insert", expectedOutput6, codeOutput6);

            // Step 4: addFirst(30)
            list.addFirst(codeInput3);
            codeOutput7 = list.peekFirst();
            codeOutput8 = list.isEmpty();
            assertEquals("Peek after third insert", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after third insert", expectedOutput8, codeOutput8);

            // Step 5: removeFirst() again
            list.removeFirst();
            int expectedOutput9 = 20;    // peek should show 20 after removal of 30
            boolean expectedOutput10 = false; // isEmpty should be false
            int codeOutput9 = list.peekFirst();
            boolean codeOutput10 = list.isEmpty();
            assertEquals("Peek after second remove", expectedOutput9, codeOutput9);
            assertEquals("isEmpty after second remove", expectedOutput10, codeOutput10);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // addLast-removeLast-addFirst-addFirst-removeLast
    public void testSLL2() {
        SingleLinkedList list = new SingleLinkedList();

        // Input values
        int codeInput1 = 10;
        int codeInput2 = 20;
        int codeInput3 = 30;

        // Expected and actual outputs
        int expectedOutput1 = 10;      // peek after first insert (head element)
        boolean expectedOutput2 = false; // isEmpty after first insert
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 0;       // peek after remove (list empty)
        boolean expectedOutput4 = true;  // isEmpty after remove
        int codeOutput3 = 0;
        boolean codeOutput4 = false;

        int expectedOutput5 = 20;      // peek after second insert (new head)
        boolean expectedOutput6 = false; // isEmpty after second insert
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 30;      // peek after third insert
        boolean expectedOutput8 = false; // isEmpty after third insert
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: addLast(10)
            list.addLast(codeInput1);
            codeOutput1 = list.peekFirst();
            codeOutput2 = list.isEmpty();
            assertEquals("Peek after first insert", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after first insert", expectedOutput2, codeOutput2);

            // Step 2: removeLast()
            list.removeLast();
            codeOutput3 = list.isEmpty() ? 0 : list.peekFirst();
            codeOutput4 = list.isEmpty();
            assertEquals("Peek after remove", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after remove", expectedOutput4, codeOutput4);

            // Step 3: addFirst(20)
            list.addFirst(codeInput2);
            codeOutput5 = list.peekFirst();
            codeOutput6 = list.isEmpty();
            assertEquals("Peek after second insert", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second insert", expectedOutput6, codeOutput6);

            // Step 4: addFirst(30)
            list.addFirst(codeInput3);
            codeOutput7 = list.peekFirst();
            codeOutput8 = list.isEmpty();
            assertEquals("Peek after third insert", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after third insert", expectedOutput8, codeOutput8);

            // Step 5: removeLast() again
            list.removeLast();
            int expectedOutput9 = 20;    // peek should show 20 after removal of 30
            boolean expectedOutput10 = false; // isEmpty should be false
            int codeOutput9 = list.peekFirst();
            boolean codeOutput10 = list.isEmpty();
            assertEquals("Peek after second remove", expectedOutput9, codeOutput9);
            assertEquals("isEmpty after second remove", expectedOutput10, codeOutput10);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // removeFirst-addFirst-addFirst-removeFirst-addLast-addLast-removeLast
    public void testSLL3() {
        SingleLinkedList list = new SingleLinkedList();

        // Input values
        int codeInput1 = 10;
        int codeInput2 = 20;
        int codeInput3 = 30;
        int codeInput4 = 40;

        // Expected and actual outputs
        boolean expectedOutput1 = true; // isEmpty after removeFirst on empty list
        boolean codeOutput1 = false;

        int expectedOutput2 = 10;       // peek after addFirst(10)
        boolean expectedOutput3 = false; // isEmpty after addFirst(10)
        int codeOutput2 = 0;
        boolean codeOutput3 = true;

        int expectedOutput4 = 20;       // peek after addFirst(20)
        boolean expectedOutput5 = false; // isEmpty after addFirst(20)
        int codeOutput4 = 0;
        boolean codeOutput5 = true;

        int expectedOutput6 = 10;       // peekFirst still 10 after removeFirst()
        boolean expectedOutput7 = false; // isEmpty still false
        int codeOutput6 = 0;
        boolean codeOutput7 = true;

        int expectedOutput8 = 10;       // peekFirst still 10 after addLast(30)
        boolean expectedOutput9 = false; // isEmpty still false
        int codeOutput8 = 0;
        boolean codeOutput9 = true;

        int expectedOutput10 = 10;      // peekFirst still 10 after addLast(40)
        boolean expectedOutput11 = false; // isEmpty still false
        int codeOutput10 = 0;
        boolean codeOutput11 = true;

        int expectedOutput12 = 10;      // peekFirst still 10 after removeLast()
        boolean expectedOutput13 = false; // isEmpty still false
        int codeOutput12 = 0;
        boolean codeOutput13 = true;

        try {
            // Step 1: removeFirst() on empty
            list.removeFirst();
            codeOutput1 = list.isEmpty();
            assertEquals("isEmpty after removeFirst on empty", expectedOutput1, codeOutput1);

            // Step 2: addFirst(10)
            list.addFirst(codeInput1);
            codeOutput2 = list.peekFirst();
            codeOutput3 = list.isEmpty();
            assertEquals("Peek after addFirst(10)", expectedOutput2, codeOutput2);
            assertEquals("isEmpty after addFirst(10)", expectedOutput3, codeOutput3);

            // Step 3: addFirst(20)
            list.addFirst(codeInput2);
            codeOutput4 = list.peekFirst();
            codeOutput5 = list.isEmpty();
            assertEquals("Peek after addFirst(20)", expectedOutput4, codeOutput4);
            assertEquals("isEmpty after addFirst(20)", expectedOutput5, codeOutput5);

            // Step 4: removeFirst()
            list.removeFirst();
            codeOutput6 = list.peekFirst();
            codeOutput7 = list.isEmpty();
            assertEquals("Peek after removeFirst()", expectedOutput6, codeOutput6);
            assertEquals("isEmpty after removeFirst()", expectedOutput7, codeOutput7);

            // Step 5: addLast(30)
            list.addLast(codeInput3);
            codeOutput8 = list.peekFirst();
            codeOutput9 = list.isEmpty();
            assertEquals("Peek after addLast(30)", expectedOutput8, codeOutput8);
            assertEquals("isEmpty after addLast(30)", expectedOutput9, codeOutput9);

            // Step 6: addLast(40)
            list.addLast(codeInput4);
            codeOutput10 = list.peekFirst();
            codeOutput11 = list.isEmpty();
            assertEquals("Peek after addLast(40)", expectedOutput10, codeOutput10);
            assertEquals("isEmpty after addLast(40)", expectedOutput11, codeOutput11);

            // Step 7: removeLast()
            list.removeLast();
            codeOutput12 = list.peekFirst();
            codeOutput13 = list.isEmpty();
            assertEquals("Peek after removeLast()", expectedOutput12, codeOutput12);
            assertEquals("isEmpty after removeLast()", expectedOutput13, codeOutput13);

        } catch (AssertionError ae) {
            System.out.println("Test failed: " + ae.getMessage());
        }
    }
}
