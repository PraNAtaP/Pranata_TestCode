package dataStructure;
// Menyatakan bahwa class ini berada dalam package dataStructure

public class BinaryTree {
    NodeBinaryTree root;
    // pointer ke akar pohon (root)

    public BinaryTree() {
        root = null;
        // konstruktor: inisialisasi pohon kosong
    }

    public void insert(int value) {
        root = insertRec(root, value);
        // panggil helper rekursif untuk menambah node
    }

    public NodeBinaryTree insertRec(NodeBinaryTree node, int value) {
        if (node == null) {
            return new NodeBinaryTree(value);
            // basis: jika mencapai leaf, buat node baru
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
            // tambah di subtree kiri bila nilai lebih kecil
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
            // tambah di subtree kanan bila nilai lebih besar
        }
        return node;
        // kembalikan node saat ini
    }

    public boolean search(int value) {
        return searchRec(root, value);
        // panggil helper rekursif untuk mencari
    }

    public boolean searchRec(NodeBinaryTree node, int value) {
        if (node == null) return false;
        // basis: jika mencapai ujung, nilai tidak ditemukan
        if (value == node.data) return true;
        // jika ketemu node dengan data yang sama
        if (value < node.data) return searchRec(node.left, value);
        // cari di subtree kiri bila nilai lebih kecil
        return searchRec(node.right, value);
        // atau cari di subtree kanan
    }

    public void delete(int value) {
        root = deleteRec(root, value);
        // panggil helper untuk menghapus node
    }

    public NodeBinaryTree deleteRec(NodeBinaryTree node, int value) {
        if (node == null) return null;
        // basis: jika tree kosong atau sampai leaf
        if (value < node.data) {
            node.left = deleteRec(node.left, value);
            // hapus di subtree kiri
        } else if (value > node.data) {
            node.right = deleteRec(node.right, value);
            // hapus di subtree kanan
        } else {
            // ditemukan node yang akan dihapus
            if (node.left == null) return node.right;
            // jika hanya punya subtree kanan atau tidak punya
            if (node.right == null) return node.left;
            // jika punya dua subtree
            node.data = minValue(node.right);
            // cari pengganti (smallest di subtree kanan)
            node.right = deleteRec(node.right, node.data);
            // hapus node pengganti di subtree kanan
        }
        return node;
        // kembalikan node setelah penghapusan
    }

    public int minValue(NodeBinaryTree node) {
        int minv = node.data;
        while (node.left != null) {
            node = node.left;
            minv = node.data;
        }
        return minv;
        // cari nilai terkecil di subtree
    }

    public boolean isEmpty() {
        return root == null;
        // true jika pohon kosong
    }
}
