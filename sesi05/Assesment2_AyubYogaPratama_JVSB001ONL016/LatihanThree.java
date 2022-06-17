package Assesment2_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanThree {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println(" ============================= ");
        System.out.println(" Seberapa banyak diskon anda ? ");
        System.out.println(" ============================= ");
        System.out.println("");

        // Masukkan Total Belanjaan
        int totalBelanja;
        int hargaAkhir;
        int diskonBelanja;

        System.out.print(" Silahkan masukkan Belanjaan Anda : Rp. ");
        totalBelanja = Scan.nextInt();
        System.out.println("");

        // Kondisi Diskon
        if (totalBelanja >= 1000000) {
            diskonBelanja = totalBelanja / 10;
            hargaAkhir = totalBelanja - diskonBelanja;
            System.out.println("=================================================");
            System.out.println("==    Harga yang perlu anda bayar : Rp. " + hargaAkhir + "    ==");
            System.out.println("== Anda mendapat diskon sebesar : Rp. " + diskonBelanja + " (10%)==");
            System.out.println("=================================================");
        } else {
            hargaAkhir = totalBelanja;
            System.out.println("============================================");
            System.out.println("==    Total Belanja Anda : Rp. " + hargaAkhir + "   ==");
            System.out.println("==       ANDA TIDAK MENDAPAT DISKON       ==");
            System.out.println("============================================");
        }

        Scan.close();

    }
}
