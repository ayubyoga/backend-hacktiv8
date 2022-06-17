package Assesment2_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanOne {

    public static void main(String[] args) {

        // Deklarasi variabel
        int average;
        int X, Y, Z;

        // Input Nilai
        Scanner Scan = new Scanner(System.in);

        System.out.print("Masukan Bilangan Pertama (X)  : ");
        X = Scan.nextInt();

        System.out.print("Masukan Bilangan Kedua (Y)  : ");
        Y = Scan.nextInt();

        System.out.print("Masukan Bilangan Ketiga (Z)  : ");
        Z = Scan.nextInt();

        // Perhitungan
        System.out.println("============================ ");
        System.out.println("          Hasil ");
        System.out.println("============================ ");

        // rata-rata
        average = (X + Y + Z) / 3;
        System.out.println("Rata-ratanya adalah : " + average);

        // Maksimal
        float Maxx = Math.max(Math.max(X, Y), Z);
        System.out.println(Maxx + " Adalah Nilai Maksimalnya. ");

        // Minimal
        float Minn = Math.min(Math.min(X, Y), Z);
        System.out.println(Minn + " Adalah Nilai Minimalnya. ");

        Scan.close();
    }
}