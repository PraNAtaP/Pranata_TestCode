package dataStructure;
 // Menyatakan bahwa class ini berada di package "dataStructure"

public class Stack {
 // Mendefinisikan class bernama Stack

    private int[] data;
     // Array internal untuk menyimpan elemen-elemen stack

    private int top;
     // Menyimpan jumlah elemen saat ini (indeks untuk push selanjutnya)

    private int capacity;
     // Kapasitas maksimum stack

    public Stack(int capacity) {
     // Konstruktor: membuat stack dengan kapasitas tertentu

        this.capacity = capacity;
         // Simpan nilai kapasitas yang diberikan

        this.data = new int[capacity];
         // Inisialisasi array data sesuai kapasitas

        this.top = 0;
         // Set top ke 0 menandakan stack masih kosong
    }

    public void push(int x) {
     // Menambahkan elemen x ke atas stack jika masih ada ruang

        if (!isFull()) {
         // Cek apakah stack belum penuh

            data[top++] = x;
             // Simpan x di posisi top, lalu increment top
        }
         // Jika sudah penuh, abaikan saja tanpa error
    }

    public void pop() {
     // Menghapus elemen teratas jika stack tidak kosong

        if (!isEmpty()) {
         // Cek apakah stack tidak kosong

            top--;
             // Decrement top untuk “menghapus” elemen teratas
        }
         // Jika kosong, abaikan saja
    }

    public int peek() {
     // Mengembalikan nilai elemen teratas tanpa menghapusnya

        return isEmpty()
         // Cek apakah stack kosong

            ? 0
             // Jika kosong, kembalikan 0 sebagai default

            : data[top - 1];
             // Jika tidak, kembalikan elemen pada indeks top-1
    }

    public boolean isEmpty() {
     // Mengecek apakah stack kosong

        return top == 0;
         // Stack kosong jika top sama dengan 0
    }

    public boolean isFull() {
     // Mengecek apakah stack sudah penuh

        return top >= capacity;
         // Stack penuh jika top mencapai kapasitas atau lebih
    }
}
