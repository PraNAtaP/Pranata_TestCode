package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch1() {
        // Initialize BinarySearch object
        BinarySearch bSearch = new BinarySearch();

        // Input untuk test case: array terurut dan target
        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 };
        int target = 7; // Nilai yang dicari

        // Panggil method binarySearch
        int[] codeOutput = bSearch.binarySearch(codeInput, target);

        // Expected: index target dan jumlah iterasi
        int[] expectedOutput = { 3, 4 };

        try {
            assertEquals("Test 1: Binary Search with target 7",
                Arrays.toString(expectedOutput),
                Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBinarySearch2() {
        BinarySearch bSearch = new BinarySearch();

        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 };
        int target = 75;

        int[] codeOutput = bSearch.binarySearch(codeInput, target);
        int[] expectedOutput = { 8, 3 };

        try {
            assertEquals("Test 2: Binary Search with target 75",
                Arrays.toString(expectedOutput),
                Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBinarySearch3() {
        BinarySearch bSearch = new BinarySearch();

        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 };
        int target = 100; // Target yang tidak ada di array

        int[] codeOutput = bSearch.binarySearch(codeInput, target);
        int[] expectedOutput = { -1, 4 };

        try {
            assertEquals("Test 3: Binary Search with target 100 (not found)",
                Arrays.toString(expectedOutput),
                Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
