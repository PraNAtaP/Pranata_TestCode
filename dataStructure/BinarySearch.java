package dataStructure;
// Menyatakan bahwa file ini ada di folder "dataStructure"

public class BinarySearch {
    public int[] binarySearch(int[] arr, int target) {
        int low = 0;
        // Batas bawah pencarian

        int high = arr.length - 1;
        // Batas atas pencarian

        int iterations = 0;
        // Penghitung berapa kali kita membandingkan

        while (low <= high) {
            iterations++;
            // Hitung satu iterasi setiap kali mencari mid

            int mid = low + (high - low) / 2;
            // Cari indeks tengah dengan aman tanpa overflow

            if (arr[mid] == target) {
                // Ketemu: kembalikan indeks dan jumlah iterasi
                return new int[] { mid, iterations };
            }

            if (arr[mid] < target) {
                low = mid + 1;
                // Jika nilai tengah kurang, geser batas bawah ke kanan
            } else {
                high = mid - 1;
                // Jika nilai tengah lebih, geser batas atas ke kiri
            }
        }

        // Tidak ketemu: kembalikan -1 dan total iterasi
        return new int[] { -1, iterations };
    }
}
