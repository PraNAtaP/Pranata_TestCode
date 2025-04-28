package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class SelectionSortTest {
    // Intermediate state testing
    @Test
    public void testSelectionSort1() {
        SelectionSort sSort = new SelectionSort();
        int[] codeInput1 = { 50, -23, 9, 33, -101, 89 };
        int codeInput2 = 4;
        int[] codeOutput = sSort.selectionSort(codeInput1, codeInput2);
        int[] expectedOutput = { -101, -23, 9, 33, 50, 89 };

        try {
            assertEquals("Test 1:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testSelectionSort2() {
        SelectionSort sSort = new SelectionSort();
        int[] codeInput1 = { 73, 3, -99, 47, 0, 890, -3, -56 };
        int codeInput2 = 47;
        int[] codeOutput = sSort.selectionSort(codeInput1, codeInput2);
        int[] expectedOutput = { -99, -56, -3, 0, 3, 47, 73, 890 };

        try {
            assertEquals("Test 2:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testSelectionSort3() {
        SelectionSort sSort = new SelectionSort();
        int[] codeInput1 = { 65, -3, 0, 120, 23, 8, 90, -7, -22, 10 };
        int codeInput2 = -50;
        int[] codeOutput = sSort.selectionSort(codeInput1, codeInput2);
        int[] expectedOutput = { 65, -3, 0, 120, 23, 8, 90, -7, -22, 10 };

        try {
            assertEquals("Test 3:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}