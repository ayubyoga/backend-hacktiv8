package sesi03;

public class PerulanganForEach {
    public static void main(String[] args) {

        // creating array
        int angka[] = { 3, 1, 42, 24, 12 };

        // menggunakan perulangan for each untuk menampilkan angka
        for (int x : angka) {
            System.out.println(x + " ");
        }
    }
}
