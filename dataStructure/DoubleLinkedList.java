package dataStructure;
// Menyatakan bahwa class ini berada dalam package dataStructure

public class DoubleLinkedList {
    NodeDoubleLinkedList head, tail;
    // head: pointer ke node pertama
    // tail: pointer ke node terakhir

    public DoubleLinkedList() {
        head = tail = null;
        // Konstruktor: inisialisasi head dan tail ke null (list kosong)
    }

    public void addFirst(int data) {
        NodeDoubleLinkedList newNode = new NodeDoubleLinkedList(data);
        // Buat node baru dengan nilai data

        if (head == null) {
            head = tail = newNode;
            // Jika list kosong, head dan tail sama-sama menunjuk node baru
        } else {
            newNode.next = head;
            // Set next dari node baru ke node lama pertama

            head.prev = newNode;
            // Set prev dari node lama pertama ke node baru

            head = newNode;
            // Update head menjadi node baru
        }
    }

    public void addLast(int data) {
        NodeDoubleLinkedList newNode = new NodeDoubleLinkedList(data);
        // Buat node baru dengan nilai data

        if (tail == null) {
            head = tail = newNode;
            // Jika list kosong, head dan tail sama-sama menunjuk node baru
        } else {
            tail.next = newNode;
            // Set next dari node lama terakhir ke node baru

            newNode.prev = tail;
            // Set prev dari node baru ke node lama terakhir

            tail = newNode;
            // Update tail menjadi node baru
        }
    }

    public void removeFirst() {
        if (head == null) return;
        // Jika list kosong, tidak melakukan apa-apa

        if (head == tail) {
            head = tail = null;
            // Jika hanya satu node, clear list
        } else {
            head = head.next;
            // Update head ke node berikutnya

            head.prev = null;
            // Hapus referensi prev di head baru
        }
    }

    public void removeLast() {
        if (tail == null) return;
        // Jika list kosong, tidak melakukan apa-apa

        if (head == tail) {
            head = tail = null;
            // Jika hanya satu node, clear list
        } else {
            tail = tail.prev;
            // Update tail ke node sebelumnya

            tail.next = null;
            // Hapus referensi next di tail baru
        }
    }

    public int peekFirst() {
        if (head == null) return 0;
        // Jika list kosong, return 0 sesuai test

        return head.data;
        // Kembalikan data dari node pertama
    }

    public boolean isEmpty() {
        return head == null;
        // Mengembalikan true jika list kosong
    }
}
