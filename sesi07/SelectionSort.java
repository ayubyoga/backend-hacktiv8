package sesi07;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        // objek scanner
        Scanner Scan = new Scanner(System.in);

        // input jumlah data
        System.out.print("Masukkan Jumlah Data : ");
        int jum_data = Scan.nextInt();

        // input nilai tiap data
        int[] data = new int[jum_data];
        System.out.println();

        for (int x = 0; x < jum_data; x++) {
            System.out.print("Input nilai data ke-" + (x + 1) + " : ");
            data[x] = Scan.nextInt();
        }

        // tampilkan data sebelum di sorting
        System.out.println();
        System.out.println("Data Sebelum disorting : ");

        for (int x = 0; x < jum_data; x++) {
            System.out.println(data[x] + " ");
        }

        // proses selection sort
        System.out.println("\n\nProses Selection Sort");

        for (int x = 0; x < jum_data - 1; x++) {

            System.out.println("Iterasi ke-" + (x + 1) + " : ");
            for (int y = 0; y < jum_data; y++) {
                System.out.print(data[y] + " ");
            }

            System.out.println("  Apakah Data " + data[x] + " sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";

            for (int y = x + 1; y < jum_data; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if (tukar == true) {
                // pertukaran data
                pesan = "  Data " + data[x] + " ditukar dengan Data " + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for (int y = 0; y < jum_data; y++) {
                System.out.print(data[y] + " ");
            }
            System.out.println(pesan + "\n");
        }

        // Tampilkan data setelah disorting
        System.out.print(" Data setelah di sorting : ");
        for (int x = 0; x < jum_data; x++) {
            System.out.print(data[x] + " ");
        }
        Scan.close();
    }

}
