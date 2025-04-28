package dataStructure;
// Menyatakan bahwa file ini masuk dalam package bernama "dataStructure".

public class InsertionSort {
// Membuat class baru bernama "InsertionSort".

    public int[] insertionSort(int[] arr, int n) {
    // Membuat method "insertionSort" yang menerima array integer "arr" dan integer "n" sebagai batas iterasi.

        int[] result = arr.clone();
        // Membuat salinan array supaya data aslinya tidak berubah saat sorting.

        int len = result.length;
        // Menyimpan panjang array ke dalam variabel "len".

        if (n <= 0) return result;
        // Kalau "n" kurang dari atau sama dengan 0, langsung balikin array tanpa proses sorting.

        for (int i = 1; i < len && i <= n; i++) {
        // Loop dari elemen kedua (indeks 1) sampai akhir array atau maksimal sebanyak "n" iterasi.

            int key = result[i];
            // Simpan nilai elemen saat ini di variabel "key" buat dibandingkan nanti.

            int j = i - 1;
            // Inisialisasi indeks sebelum "i" buat proses pergeseran elemen.

            while (j >= 0 && result[j] > key) {
            // Selama masih ada elemen sebelumnya dan elemen itu lebih besar dari "key"...

                result[j + 1] = result[j];
                // Geser elemen yang lebih besar satu posisi ke kanan.

                j--;
                // Mundur ke elemen sebelah kiri.
            }

            result[j + 1] = key;
            // Setelah nemu posisi yang pas, simpan "key" di sana.
        }

        return result;
        // Balikin array yang udah diurutkan sebagian sesuai jumlah iterasi "n".
    }
}
