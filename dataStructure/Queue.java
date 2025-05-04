package dataStructure;
// Menyatakan bahwa file ini adalah bagian dari package bernama dataStructure

public class Queue {
    private int[] arr; 
    // Array untuk menyimpan elemen queue

    private int front, rear, capacity, count; 
    // front: indeks elemen pertama
    // rear: indeks elemen terakhir
    // capacity: kapasitas maksimum queue
    // count: jumlah elemen saat ini di queue

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    // Konstruktor: inisialisasi array, kapasitas, dan variabel kontrol queue

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        // Cek apakah queue sudah penuh, kalau penuh keluar dari program

        rear = (rear + 1) % capacity;
        // Naikkan rear secara melingkar (circular queue)

        arr[rear] = item;
        // Tambahkan item ke posisi rear

        count++;
        // Tambah jumlah elemen (increment)
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        // Cek apakah queue kosong, kalau ksong keluar dari program

        int x = arr[front];
        // Simpan item paling depan (yang akan dikeluarkan)

        front = (front + 1) % capacity;
        // Geser front ke elemen berikutnya secara melingkar

        count--;
        // Kurangi jumlah elemen

        return x;
        // Return elemen yang dikeluarkan
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        // Cek apakah queue kosong, kalau iya keluar dari program

        return arr[front];
        // Return elemen paling depan tanpa menghapusnya
    }

    public int size() {
        return count;
        // Return jumlah elemen dalam queue
    }

    public boolean isEmpty() {
        return (size() == 0);
        // Return true kalau queue kosong
    }

    public boolean isFull() {
        return (size() == capacity);
        // Return true kalau queue penuh
    }
}
