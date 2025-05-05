package dataStructure;

public class NodeBinaryTree {
    int data;            
    // data: nilai node
    NodeBinaryTree left, right;
    // left/right: pointer ke anaknya

    NodeBinaryTree(int data) {
        this.data = data;
        // set nilai data node
        this.left = this.right = null;
        // inisialisasi anak ke null
    }
}