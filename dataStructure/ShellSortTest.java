package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class ShellSortTest {
    // Intermediate state testing
    @Test
    public void testShellSort1() {
        ShellSort sSort = new ShellSort();
        int[] codeInput1 = { -9, -99, 2, 78, 45, -105, 78, -33 };
        int codeInput2 = 3;

        int[] codeOutput = sSort.shellSort(codeInput1, codeInput2); // Sorting result
        // Expected intermediate state
        int[] expectedOutput = { -9, -33, -99, 2, 45, 78, -105, 78 };

        try {
            assertEquals("Test 1:", Arrays.toString(codeOutput), Arrays.toString(expectedOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testShellSort2() {
        ShellSort sSort = new ShellSort();
        int[] codeInput1 = { 67, -45, 0, -22, 0, 123, -3, -2, -34, 89, 2 };
        int codeInput2 = 312;

        int[] codeOutput = sSort.shellSort(codeInput1, codeInput2); // Sorting result
        // Expected intermediate state
        int[] expectedOutput = { -45, -34, -22, -3, -2, 0, 0, 2, 67, 89, 123 };

        try {
            assertEquals("Test 2:", Arrays.toString(codeOutput), Arrays.toString(expectedOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testShellSort3() {
        ShellSort sSort = new ShellSort();
        int[] codeInput1 = { 8, -2, 89, -5, 47, 231, -9 };
        int codeInput2 = -1;

        int[] codeOutput = sSort.shellSort(codeInput1, codeInput2); // Sorting result
        int[] expectedOutput = { 8, -2, 89, -5, 47, 231, -9 }; // Expected intermediate state

        try {
            assertEquals("Test 3:", Arrays.toString(codeOutput), Arrays.toString(expectedOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}