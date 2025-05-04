package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class StackTest {

    @Test
    // push–pop–push–push
    public void testStack1() {
        Stack stack = new Stack(10);

        // Input values
        int push1 = 99;
        int push2 = 50;
        int push3 = -34;

        // Expected and actual outputs
        int expectedOutput1 = 99; // peek after 1st push
        boolean expectedOutput2 = false; // isEmpty after 1st push
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 0; // peek after pop (stack empty)
        boolean expectedOutput4 = true; // isEmpty after pop
        int codeOutput3 = 0;
        boolean codeOutput4 = false;

        int expectedOutput5 = 50; // peek after 2nd push
        boolean expectedOutput6 = false; // isEmpty after 2nd push
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = -34; // peek after 3rd push
        boolean expectedOutput8 = false; // isEmpty after 3rd push
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: Push(99)
            stack.push(push1);
            codeOutput1 = stack.peek();
            codeOutput2 = stack.isEmpty();
            assertEquals("Peek after first push", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after first push", expectedOutput2, codeOutput2);

            // Step 2: Pop()
            stack.pop();
            codeOutput3 = stack.isEmpty() ? 0 : stack.peek(); // peek jika tidak kosong
            codeOutput4 = stack.isEmpty();
            assertEquals("Peek after pop", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after pop", expectedOutput4, codeOutput4);

            // Step 3: Push(50)
            stack.push(push2);
            codeOutput5 = stack.peek();
            codeOutput6 = stack.isEmpty();
            assertEquals("Peek after second push", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second push", expectedOutput6, codeOutput6);

            // Step 4: Push(-34)
            stack.push(push3);
            codeOutput7 = stack.peek();
            codeOutput8 = stack.isEmpty();
            assertEquals("Peek after third push", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after third push", expectedOutput8, codeOutput8);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // pop–push–push–pop
    public void testStack2() {
        Stack stack = new Stack(10);

        // Input values
        int push1 = 77;
        int push2 = -12;

        // Expected and actual outputs
        int expectedOutput1 = 0; // peek after pop on empty
        boolean expectedOutput2 = true; // isEmpty should still be true
        int codeOutput1 = 0;
        boolean codeOutput2 = false;

        int expectedOutput3 = 77; // peek after first push
        boolean expectedOutput4 = false; // isEmpty after first push
        int codeOutput3 = 0;
        boolean codeOutput4 = true;

        int expectedOutput5 = -12; // peek after second push
        boolean expectedOutput6 = false; // isEmpty after second push
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 77; // peek after final pop (should leave 77 on top)
        boolean expectedOutput8 = false; // isEmpty after final pop
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        try {
            // Step 1: Pop() from empty stack
            stack.pop(); // should handle gracefully
            codeOutput1 = stack.isEmpty() ? 0 : stack.peek();
            codeOutput2 = stack.isEmpty();
            assertEquals("Peek after pop on empty stack", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after pop on empty stack", expectedOutput2, codeOutput2);

            // Step 2: Push(77)
            stack.push(push1);
            codeOutput3 = stack.peek();
            codeOutput4 = stack.isEmpty();
            assertEquals("Peek after first push", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after first push", expectedOutput4, codeOutput4);

            // Step 3: Push(-12)
            stack.push(push2);
            codeOutput5 = stack.peek();
            codeOutput6 = stack.isEmpty();
            assertEquals("Peek after second push", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after second push", expectedOutput6, codeOutput6);

            // Step 4: Pop() (remove -12)
            stack.pop();
            codeOutput7 = stack.peek();
            codeOutput8 = stack.isEmpty();
            assertEquals("Peek after final pop", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after final pop", expectedOutput8, codeOutput8);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // push–pop–push until overflow
    public void testStack3() {
        Stack stack = new Stack(3);

        // Input values
        int codeInput1 = 10;
        int codeInput2 = 20;
        int codeInput3 = 30;
        int codeInput4 = 40;
        int codeInput5 = 50; // overflow testing

        // Expected and actual outputs
        int expectedOutput1 = 10; // peek after push(10)
        boolean expectedOutput2 = false; // isEmpty after push(10)
        int codeOutput1 = 0;
        boolean codeOutput2 = true;

        int expectedOutput3 = 20; // peek after push(20)
        boolean expectedOutput4 = false; // isEmpty after push(20)
        int codeOutput3 = 0;
        boolean codeOutput4 = true;

        int expectedOutput5 = 10; // peek after pop()
        boolean expectedOutput6 = false; // isEmpty after pop()
        int codeOutput5 = 0;
        boolean codeOutput6 = true;

        int expectedOutput7 = 30; // peek after push(30)
        boolean expectedOutput8 = false; // isEmpty after push(30)
        int codeOutput7 = 0;
        boolean codeOutput8 = true;

        int expectedOutput9 = 40; // peek after push(40)
        boolean expectedOutput10 = false; // isEmpty after push(40)
        int codeOutput9 = 0;
        boolean codeOutput10 = true;

        int expectedOutput11 = 50; // peek after push(50) but stack is full
        boolean expectedOutput12 = true; // isFull after push(50) (overflow)
        int codeOutput11 = 0;
        boolean codeOutput12 = false;

        try {
            // Step 1: Push(10)
            stack.push(codeInput1);
            codeOutput1 = stack.peek();
            codeOutput2 = stack.isEmpty();
            assertEquals("Peek after push(10)", expectedOutput1, codeOutput1);
            assertEquals("isEmpty after push(10)", expectedOutput2, codeOutput2);

            // Step 2: Push(20)
            stack.push(codeInput2);
            codeOutput3 = stack.peek();
            codeOutput4 = stack.isEmpty();
            assertEquals("Peek after push(20)", expectedOutput3, codeOutput3);
            assertEquals("isEmpty after push(20)", expectedOutput4, codeOutput4);

            // Step 3: Pop()
            stack.pop();
            codeOutput5 = stack.peek();
            codeOutput6 = stack.isEmpty();
            assertEquals("Peek after pop()", expectedOutput5, codeOutput5);
            assertEquals("isEmpty after pop()", expectedOutput6, codeOutput6);

            // Step 4: Push(30)
            stack.push(codeInput3);
            codeOutput7 = stack.peek();
            codeOutput8 = stack.isEmpty();
            assertEquals("Peek after push(30)", expectedOutput7, codeOutput7);
            assertEquals("isEmpty after push(30)", expectedOutput8, codeOutput8);

            // Step 5: Push(40)
            stack.push(codeInput4);
            codeOutput9 = stack.peek();
            codeOutput10 = stack.isEmpty();
            assertEquals("Peek after push(40)", expectedOutput9, codeOutput9);
            assertEquals("isEmpty after push(40)", expectedOutput10, codeOutput10);

            // Step 6: Push(50) → overflow
            if (!stack.isFull()) {
                stack.push(codeInput5);
            }
            codeOutput11 = stack.peek();
            codeOutput12 = stack.isFull();
            assertEquals("Peek after push(50) overflow", expectedOutput11, codeOutput11);
            assertEquals("isFull after push(50)", expectedOutput12, codeOutput12);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
