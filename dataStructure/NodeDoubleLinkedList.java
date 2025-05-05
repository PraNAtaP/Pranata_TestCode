package dataStructure;

public class NodeDoubleLinkedList {
    int data;
    NodeDoubleLinkedList prev, next;
    // data: nilai node
    // prev: pointer ke node sebelumnya
    // next: pointer ke node berikutnya

    NodeDoubleLinkedList(int data) {
        this.data = data;
        // Set nilai data node

        this.prev = this.next = null;
        // Inisialisasi prev dan next ke null
    }
}
