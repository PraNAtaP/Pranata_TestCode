package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class InsertionSortTest {
    // Intermediate state testing
    @Test
    public void testInsertionSort1() {
        InsertionSort iSort = new InsertionSort();
        int[] codeInput1 = { -85, 44, 3, 77, -231 };
        int codeInput2 = 3;
        int[] codeOutput = iSort.insertionSort(codeInput1, codeInput2);
        int[] expectedOutput = { -85, 3, 44, 77, -231 };

        try {
            assertEquals("Test 1:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testInsertionSort2() {
        InsertionSort iSort = new InsertionSort();
        int[] codeInput1 = { 66, -1, 0, 104, -22, 8, 155, -7 };
        int codeInput2 = 300;
        int[] codeOutput = iSort.insertionSort(codeInput1, codeInput2);
        int[] expectedOutput = { -22, -7, -1, 0, 8, 66, 104, 155 };

        try {
            assertEquals("Test 2:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testInsertionSort3() {
        InsertionSort iSort = new InsertionSort();
        int[] codeInput1 = { -7, 8, 99, -14, 89, 23, -123, 76, 33, -45 };
        int codeInput2 = -8;
        int[] codeOutput = iSort.insertionSort(codeInput1, codeInput2);
        int[] expectedOutput = { -7, 8, 99, -14, 89, 23, -123, 76, 33, -45 };

        try {
            assertEquals("Test 3:", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}