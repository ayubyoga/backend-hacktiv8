package sesi03;

//import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        // Scanner bilangan = new Scanner(System.in);
        int ganjil, jumlah = 0;

        // System.out.print("Masukkan Nilai Awal : ");
        // awal = bilangan.nextInt();
        // System.out.print("Masukkan Nilai Akhir : ");
        // akhir = bilangan.nextInt();
        // System.out.print("Deret Bilangan Ganjil = ");

        for (ganjil = 0; ganjil <= 19; ganjil++) {
            if (ganjil % 2 == 1) {
                jumlah = jumlah + ganjil;
                System.out.print(ganjil + " ");

            }
        }
        // System.out.println();
        // System.out.println("Jumlah Deret Bilangan Ganjil Adalah = " + jumlah + " ");

        // bilangan.close();
    }

}
