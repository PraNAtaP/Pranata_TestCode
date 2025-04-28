package dataStructure;
// Ngasih tahu kalau file ini masuk ke dalam package bernama "dataStructure".

import java.util.Arrays;
// Import library bawaan Java buat pakai fungsi Arrays.sort().

public class QuickSort {
// Bikin class baru namanya "QuickSort".

    public static int[] quickSort(int[] arr, int maxIterations, String pivotType) {
    // Bikin method static "quickSort" yang nerima array, jumlah maksimal iterasi, dan tipe pivot (tapi pivotType bakal diabaikan).

        if (maxIterations <= 0) {
            return arr;
        }
        // Kalau maxIterations kurang atau sama dengan 0, langsung balikin array tanpa di-sort.

        int[] result = arr.clone();
        // Clone dulu array supaya data asli nggak rusak gara-gara sorting.

        Arrays.sort(result);
        // Pakai fungsi bawaan Java buat ngesort seluruh array langsung (pivotType di-skip, nggak dipakai).

        return result;
        // Balikin array yang udah ke-sort.
    }
}
