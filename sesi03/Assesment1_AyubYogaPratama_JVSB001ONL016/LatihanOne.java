package sesi03.Assesment1_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanOne {
    public static void main(String[] args) {

        // Variable Declaration
        double Luas, Phi = 22 / 7;
        int R;
        Scanner Scan = new Scanner(System.in);

        // Input jari-jari lingkaran
        System.out.print("Masukan jari-jari lingkaran : ");
        R = Scan.nextInt();

        // Rumus luas lingkaran
        Luas = Phi * R * R;

        // Result
        System.out.println("Luas lingkaran dengan jari-jari " + R + " adalah " + Luas + " satuan luas");

        // end
        Scan.close();
    }
}
