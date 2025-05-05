package dataStructure;
// Menyatakan bahwa class ini berada di package dataStructure

public class SingleLinkedList {
    // Mendefinisikan class SingleLinkedList

    NodeSingleLinkedList head;
    // Pointer ke node pertama (head) dalam linked list

    public SingleLinkedList() {
        head = null;
    }
    // inisialisasi head menjadi null (list kosong)

    public void addFirst(int data) {
        NodeSingleLinkedList newNode = new NodeSingleLinkedList(data);
        // Buat node baru dengan nilai data

        newNode.next = head;
        // Atur next node baru menunjuk ke head lama

        head = newNode;
        // Update head menjadi node baru
    }

    public void addLast(int data) {
        NodeSingleLinkedList newNode = new NodeSingleLinkedList(data);
        // Buat node baru dengan nilai data

        if (head == null) {
            head = newNode;
        }
        // Jika list kosong, head langsung jadi node baru

        else {
            NodeSingleLinkedList current = head;
            // Mulai iterasi dari head

            while (current.next != null) {
                current = current.next;
            }
            // Cari node paling belakang (next == null)

            current.next = newNode;
            // Sambungkan node terakhir ke node baru
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
        // Jika head tidak null, update head ke node berikutnya (buang yang lama)
    }

    public void removeLast() {
        if (head == null)
            return;
        // Jika list kosong, tidak ada yang dihapus

        if (head.next == null) {
            head = null;
            return;
        }
        // Jika hanya ada satu node, clear list

        NodeSingleLinkedList current = head;
        // Mulai dari head

        while (current.next.next != null) {
            current = current.next;
        }
        // Cari node sebelum terakhir (current.next.next == null)

        current.next = null;
        // Buang node terakhir dengan memutus referensi
    }

    public int peekFirst() {
        if (head == null)
            return 0;
        // Jika list kosong, return 0

        return head.data;
        // Kembalikan nilai data di head
    }

    public boolean isEmpty() {
        return head == null;
        // True jika head menunjuk null (list kosong)
    }
}
