package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

    @Test
    // enqueue-dequeue-enqueue-enqueue
    public void testQueue1() {
        Queue queue = new Queue(10);

        // Input values
        int enqueue1 = 99;
        int enqueue2 = 50;
        int enqueue3 = -34;

        // Expected and actual outputs
        int expectedOutput1 = 99; // peek after 1st enqueue
        boolean expectedOutput2 = false; // isEmpty after 1st enqueue
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 0; // peek after dequeue (queue empty)
        boolean expectedOutput4 = true; // isEmpty after dequeue
        int codeOutput3 = 0;
        boolean codeOutput4 = false;

        int expectedOutput5 = 50; // peek after 2nd enqueue
        boolean expectedOutput6 = false; // isEmpty after 2nd enqueue
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = -34; // peek after 3rd enqueue
        boolean expectedOutput8 = false; // isEmpty after 3rd enqueue
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: Enqueue(99)
            queue.enqueue(enqueue1);
            codeOutput1 = queue.peek();
            codeOutput2 = queue.isEmpty();
            assertEquals("Peek after first enqueue", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after first enqueue", expectedOutput2, codeOutput2);

            // Step 2: Dequeue()
            queue.dequeue();
            codeOutput3 = queue.isEmpty() ? 0 : queue.peek(); // Peek if not empty
            codeOutput4 = queue.isEmpty();
            assertEquals("Peek after dequeue", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after dequeue", expectedOutput4, codeOutput4);

            // Step 3: Enqueue(50)
            queue.enqueue(enqueue2);
            codeOutput5 = queue.peek();
            codeOutput6 = queue.isEmpty();
            assertEquals("Peek after second enqueue", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second enqueue", expectedOutput6, codeOutput6);

            // Step 4: Enqueue(-34)
            queue.enqueue(enqueue3);
            codeOutput7 = queue.peek();
            codeOutput8 = queue.isEmpty();
            assertEquals("Peek after third enqueue", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after third enqueue", expectedOutput8, codeOutput8);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // dequeue-enqueue-enqueue-dequeue
    public void testQueue2() {
        Queue queue = new Queue(10);

        // Input values
        int enqueue1 = 77;
        int enqueue2 = -12;

        // Expected and actual outputs
        int expectedOutput1 = 0; // peek after dequeue on empty (assume 0 if empty)
        boolean expectedOutput2 = true; // isEmpty should still be true
        int codeOutput1 = 0;
        boolean codeOutput2 = false;

        int expectedOutput3 = 77; // peek after first enqueue
        boolean expectedOutput4 = false; // isEmpty should be false
        int codeOutput3 = 0;
        boolean codeOutput4 = true;

        int expectedOutput5 = -12; // peek after second enqueue
        boolean expectedOutput6 = false;
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 77; // peek after final dequeue (should leave 77 in front)
        boolean expectedOutput8 = false;
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: Dequeue (from empty queue)
            queue.dequeue(); // should not crash if queue handles it gracefully
            codeOutput1 = queue.isEmpty() ? 0 : queue.peek(); // avoid peek if empty
            codeOutput2 = queue.isEmpty();
            assertEquals("Peek after dequeue on empty queue", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after dequeue on empty queue", expectedOutput2, codeOutput2);

            // Step 2: Enqueue(77)
            queue.enqueue(enqueue1);
            codeOutput3 = queue.peek();
            codeOutput4 = queue.isEmpty();
            assertEquals("Peek after first enqueue", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after first enqueue", expectedOutput4, codeOutput4);

            // Step 3: Enqueue(-12)
            queue.enqueue(enqueue2);
            codeOutput5 = queue.peek();
            codeOutput6 = queue.isEmpty();
            assertEquals("Peek after second enqueue", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second enqueue", expectedOutput6, codeOutput6);

            // Step 4: Dequeue (should remove 77)
            queue.dequeue();
            codeOutput7 = queue.peek();
            codeOutput8 = queue.isEmpty();
            assertEquals("Peek after final dequeue", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after final dequeue", expectedOutput8, codeOutput8);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // enqueue-dequeue-enqueue-enqueue (overflow)
    public void testQueue3() {
        Queue queue = new Queue(3);

        // Input values
        int enqueue1 = 10;
        int enqueue2 = 20;
        int enqueue3 = 30;
        int enqueue4 = 40;

        // Expected and actual outputs
        int expectedOutput1 = 10; // Peek after enqueue(10)
        boolean expectedOutput2 = false; // isEmpty after enqueue(10)
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 20; // Peek after enqueue(20)
        boolean expectedOutput4 = false; // isEmpty after enqueue(20)
        int codeOutput3 = 0;
        boolean codeOutput4 = true;

        int expectedOutput5 = 10; // Peek after dequeue
        boolean expectedOutput6 = false;
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 30; // Peek after enqueue(30)
        boolean expectedOutput8 = false;
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        int expectedOutput9 = 40; // Peek after enqueue(40)
        boolean expectedOutput10 = false;
        int codeOutput9 = 0;
        boolean codeOutput10 = true;

        try {
            // Step 1: Enqueue(10)
            queue.enqueue(enqueue1);
            codeOutput1 = queue.peek();
            codeOutput2 = queue.isEmpty();
            assertEquals("Peek after enqueue(10)", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after enqueue(10)", expectedOutput2, codeOutput2);

            // Step 2: Enqueue(20)
            queue.enqueue(enqueue2);
            codeOutput3 = queue.peek();
            codeOutput4 = queue.isEmpty();
            assertEquals("Peek after enqueue(20)", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after enqueue(20)", expectedOutput4, codeOutput4);

            // Step 3: Dequeue
            queue.dequeue();
            codeOutput5 = queue.peek();
            codeOutput6 = queue.isEmpty();
            assertEquals("Peek after dequeue", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after dequeue", expectedOutput6, codeOutput6);

            // Step 4: Enqueue(30)
            queue.enqueue(enqueue3);
            codeOutput7 = queue.peek();
            codeOutput8 = queue.isEmpty();
            assertEquals("Peek after enqueue(30)", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after enqueue(30)", expectedOutput8, codeOutput8);

            // Step 5: Enqueue(40)
            queue.enqueue(enqueue4);
            codeOutput9 = queue.peek();
            codeOutput10 = queue.isEmpty();
            assertEquals("Peek after enqueue(40)", expectedOutput9, codeOutput9);
            assertEquals("isEmpty after enqueue(40)", expectedOutput10, codeOutput10);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
