package dataStructure;
// Ini buat nandain file ini masuk ke dalam package "dataStructure".

public class SequentialSearch {
// Bikin class baru namanya "SequentialSearch".

    public int[] sequentialSearch(int[] arr, int target) {
    // Bikin method "sequentialSearch" yang nerima array dan target yang mau dicari.

        int iterations = 0;
        // Variabel ini buat ngitung berapa kali kita iterasi (loop).

        for (int i = 0; i < arr.length; i++) {
        // Loop dari indeks 0 sampai akhir array.

            iterations++;
            // Setiap loop jalan, tambah satu ke iterations.

            if (arr[i] == target) {
            // Cek kalau elemen di indeks ke-i sama dengan target.

                return new int[] { i, iterations };
                // Kalau ketemu, langsung balikin array berisi indeks ketemu dan jumlah iterasi.
            }
        }

        return new int[] { -1, iterations };
        // Kalau sampai akhir loop nggak ketemu, balikin -1 sama jumlah iterasi.
    }
}
