package dataStructure;
// Ini buat nandain file ini masuk ke dalam package "dataStructure".

public class SelectionSort {
// Bikin class baru namanya "SelectionSort".

    public int[] selectionSort(int[] arr, int n) {
    // Bikin method "selectionSort" yang inputnya array dan jumlah maksimal iterasi n.

        int[] result = arr.clone();
        // Clone array supaya array asli nggak berubah kalau kita olah.

        int len = result.length;
        // Simpan panjang array ke variabel len biar nggak bolak-balik nulis result.length.

        if (n <= 0) {
            return result;
        }
        // Kalau n kurang dari atau sama dengan 0, langsung balikin array tanpa sorting.

        for (int i = 0; i < n && i < len - 1; i++) {
        // Loop dari indeks 0 sampai n atau batas len - 1, mana yang lebih kecil.

            int minIndex = i;
            // Set minIndex awalnya ke i (anggap elemen ke-i itu yang paling kecil).

            for (int j = i + 1; j < len; j++) {
            // Loop lagi dari i+1 buat cari elemen yang lebih kecil.

                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
                // Kalau nemu elemen yang lebih kecil dari elemen di minIndex, update minIndex.

            }

            if (minIndex != i) {
                int temp = result[i];
                result[i] = result[minIndex];
                result[minIndex] = temp;
            }
            // Kalau minIndex berubah, tukar elemen i dengan elemen minIndex.
        }

        return result;
        // Setelah semua iterasi selesai, balikin array yang sudah diurutkan sebagian.
    }
}
