package dataStructure;
// Menyatakan bahwa file ini berada di dalam package bernama "dataStructure".

public class BubbleSort {
// Mendefinisikan sebuah class bernama "BubbleSort".

    public int[] bubbleSort(int[] arr, int n) {
    // Membuat method "bubbleSort" yang menerima array integer "arr" dan integer "n" sebagai jumlah iterasi maksimal.

        int[] result = arr.clone();
        // Membuat salinan dari array "arr" supaya array aslinya tidak berubah.

        int len = result.length;
        // Menyimpan panjang array ke dalam variabel "len".

        if (n <= 0) {
            return result;
        }
        // Jika nilai "n" kurang dari atau sama dengan 0, langsung kembalikan array hasil salinan tanpa sorting.

        for (int i = 0; i < n && i < len - 1; i++) {
        // Perulangan luar, berjalan dari indeks ke-0 hingga maksimal "n" kali atau sampai elemen kedua terakhir.

            boolean swapped = false;
            // Membuat variabel "swapped" untuk mengecek apakah terjadi pertukaran elemen.

            for (int j = 0; j < len - i - 1; j++) {
            // Perulangan dalam: membandingkan elemen satu per satu sampai batas elemen yang belum terurut.

                if (result[j] > result[j + 1]) {
                // Jika elemen sekarang lebih besar dari elemen setelahnya...

                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    // Tukar posisi kedua elemen tersebut.

                    swapped = true;
                    // Tandai bahwa ada pertukaran pada iterasi ini.
                }
            }

            if (!swapped) break;
            // Jika tidak ada pertukaran dalam satu putaran, artinya array sudah terurut, langsung keluar dari loop.
        }

        return result;
        // Mengembalikan array yang sudah disorting (atau hasil dari iterasi maksimal yang diminta).
    }
}
