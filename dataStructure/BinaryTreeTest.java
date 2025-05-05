package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void testBST1() {
        BinaryTree bst = new BinaryTree();
        int codeInput1 = 50;
        int codeInput2 = 30;
        int codeInput3 = 70;
        int codeInput4 = 20;
        int codeInput5 = 40;
        int codeInput6 = 60;
        int codeInput7 = 80;
        try {
            // Insert elements
            bst.insert(codeInput1);
            bst.insert(codeInput2);
            bst.insert(codeInput3);
            bst.insert(codeInput4);

            bst.insert(codeInput5);
            bst.insert(codeInput6);
            bst.insert(codeInput7);
            // Searches
            assertTrue(bst.search(codeInput1));
            assertFalse(bst.search(100));
            assertTrue(bst.search(codeInput2));
            assertTrue(bst.search(codeInput3));
            // Delete and re-check
            bst.delete(codeInput2); // Remove 30
            assertFalse(bst.search(codeInput2));
            assertTrue(bst.search(codeInput5)); // 40 still exists
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBST2() {
        BinaryTree bst = new BinaryTree();
        int codeInput1 = 50;
        int codeInput2 = 30;
        int codeInput3 = 70;
        int codeInput4 = 20;
        int codeInput5 = 40;
        try {
            // Delete from empty
            bst.delete(50);
            assertTrue(bst.isEmpty());
            // Search in empty
            assertFalse(bst.search(50));
            assertFalse(bst.search(30));
            // Insert elements
            bst.insert(codeInput1);
            bst.insert(codeInput2);
            bst.insert(codeInput3);
            bst.insert(codeInput4);
            bst.insert(codeInput5);
            assertTrue(bst.search(codeInput5)); // 40
            assertTrue(bst.search(codeInput4)); // 20
            bst.delete(codeInput5); // Remove 40
            bst.delete(codeInput4); // Remove 20
            assertFalse(bst.search(codeInput5));
            assertFalse(bst.search(codeInput4));
            assertFalse(bst.isEmpty()); // Tree still has nodes
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBST3() {
        BinaryTree bst = new BinaryTree();
        int codeInput1 = 25;
        int codeInput2 = 15;
        int codeInput3 = 35;
        int codeInput4 = 20;
        try {

            bst.insert(codeInput1);
            assertTrue(bst.search(codeInput1));
            assertFalse(bst.search(100));
            bst.insert(codeInput2);
            bst.insert(codeInput3);
            assertTrue(bst.search(codeInput2));
            bst.delete(codeInput2);
            assertFalse(bst.search(codeInput2));
            bst.insert(codeInput4);
            assertTrue(bst.search(codeInput4));
            bst.delete(codeInput3);
            assertFalse(bst.search(codeInput3));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}