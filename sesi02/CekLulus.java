package sesi02;

import java.util.Scanner;

public class CekLulus {
    public static void main(String[] args) {

        // variabel nilai dan scanner
        int nilai = 0;
        String nama;
        Scanner scan = new Scanner(System.in);

        // ambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // cek apakah lulus kah tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf, " + nama + ", anda gagal");
        }

        System.out.println("Terima Kasih///");

        scan.close();
    }
}
