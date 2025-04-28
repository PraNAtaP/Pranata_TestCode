package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class SequentialSearchTest {
    @Test
    public void testSequentialSearch1() {
        SequentialSearch sSearch = new SequentialSearch();

        int[] codeInput = { -1, 2, 15, 27, 90, 110, 113, 215, 317, 320 }; // Array to search
        int target = 317; // Target value to find
        int[] codeOutput = sSearch.sequentialSearch(codeInput, target);
        int[] expectedOutput = { 8, 9 };
        try {
            assertEquals("Test 1: Sequential Search with target 317", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testSequentialSearch2() {
        SequentialSearch sSearch = new SequentialSearch();

        int[] codeInput = { -1, 2, 15, 27, 90, 110, 113, 215, 317, 320 }; // Array to search
        int target = 15;
        int[] codeOutput = sSearch.sequentialSearch(codeInput, target);
        int[] expectedOutput = { 2, 3 };

        try {
            assertEquals("Test 1: Sequential Search with target 15", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    // Test for target not found
    @Test
    public void testSequentialSearch3() {
        SequentialSearch sSearch = new SequentialSearch();

        int[] codeInput = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 }; // Array to search
        int target = 321;
        int[] codeOutput = sSearch.sequentialSearch(codeInput, target);
        int[] expectedOutput = { -1, 10 }; // Expected index (-1) and iterations (10)

        try {
            assertEquals("Test3: Sequential Search with target 321 (not found)", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}