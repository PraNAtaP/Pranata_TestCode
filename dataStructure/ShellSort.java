package dataStructure;
// Masukin file ini ke dalam package "dataStructure".

public class ShellSort {
// Bikin class baru namanya "ShellSort".

    public int[] shellSort(int[] arr, int maxIterations) {
    // Bikin method "shellSort" yang nerima array dan batas maksimum iterasi.

        if (maxIterations <= 0) return arr;
        // Kalau batas iterasi kurang atau sama dengan 0, langsung balikin array apa adanya.

        int n = arr.length;
        // Simpan panjang array ke variabel n.

        int gap = n / 2;
        // Tentuin jarak (gap) awal, mulai dari setengah panjang array.

        int iterationCount = 0;
        // Buat ngitung berapa kali sudah iterasi.

        while (gap > 0 && iterationCount < maxIterations) {
        // Loop terus selama gap masih lebih dari 0 dan iterasi belum melebihi batas.

            for (int i = gap; i < n && iterationCount < maxIterations; i++) {
            // Mulai loop dari indeks 'gap' sampai akhir array, cek iterasi juga.

                int temp = arr[i];
                // Simpan elemen saat ini ke variabel sementara.

                int j = i;
                // Juga buat variabel j untuk gerak ke belakang.

                while (j >= gap && arr[j - gap] > temp && iterationCount < maxIterations) {
                // Selama j valid, dan elemen sebelum j lebih gede dari temp, dan iterasi belum maksimal.

                    arr[j] = arr[j - gap];
                    // Geser elemen ke kanan.

                    j -= gap;
                    // Mundur sejauh gap.

                    iterationCount++;
                    // Hitung 1 kali iterasi lagi.
                }

                if (j != i && iterationCount < maxIterations) {
                // Kalau posisi j berubah dan iterasi belum maksimal.

                    arr[j] = temp;
                    // Tempatin temp di posisi yang benar.

                    iterationCount++;
                    // Tambah iterasi lagi.
                }
            }

            gap /= 2;
            // Setelah satu putaran selesai, jaraknya diperkecil (dibagi 2).
        }

        return arr;
        // Akhirnya balikin array yang sudah di-sort sebagian atau sepenuhnya.
    }
}
