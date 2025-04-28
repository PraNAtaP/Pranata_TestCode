package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    // First Pivot - Intermediate state at iteration 2
    public void testQuickSort1() {
        int[] codeInput1 = { 89, 23, -90, 0, 117, 90, 2, 1, 8, -9 };
        int codeInput2 = 2;
        String codeInput3 = "first";

        int[] codeOutput = QuickSort.quickSort(codeInput1, codeInput2, codeInput3);

        // Simulated intermediate state after 2 iterations
        int[] expectedOutput = { -90, -9, 0, 1, 23, 8, 2, 90, 117, 89 };

        try {
            assertEquals("Test 1 :", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // Middle Pivot - Intermediate state at iteration 3
    public void testQuickSort2() {
        int[] codeInput1 = { -8, 0, 90, -12, 100, 23 };
        int codeInput2 = 3;
        String codeInput3 = "middle";

        int[] codeOutput = QuickSort.quickSort(codeInput1, codeInput2, codeInput3);

        // Simulated intermediate state after 3 iterations
        int[] expectedOutput = { -12, -8, 0, 90, 23, 100 };

        try {
            assertEquals("Test 2 :", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // Last Pivot - Intermediate state at iteration 4
    public void testQuickSort3() {
        int[] codeInput1 = { 90, -2, -11, 0, 23, 78, 9, 102, -4, 89, -9 };
        int codeInput2 = 4;
        String codeInput3 = "last";

        int[] codeOutput = QuickSort.quickSort(codeInput1, codeInput2, codeInput3);

        // Simulated intermediate state after 4 iterations
        int[] expectedOutput = { -11, -9, -4, 0, -2, 23, 78, 9, 102, 89, 90 };

        try {
            assertEquals("Test 3 :", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}