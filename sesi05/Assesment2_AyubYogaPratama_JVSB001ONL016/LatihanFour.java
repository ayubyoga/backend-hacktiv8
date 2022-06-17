package Assesment2_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanFour {
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Program Pengecekan Tahun Kabisat");
        System.out.println("================================");

        // Input Tahun untuk di Cek
        int tahun;
        Scanner Scan = new Scanner(System.in);

        System.out.print(" Masukkan Tahun : ");
        tahun = Scan.nextInt();

        // Logic Kabisat
        if (tahun % 400 == 0) {
            System.out.format("Tahun %d merupakan Tahun Kabisat", tahun);
        } else if (tahun % 100 == 0) {
            System.out.format("Tahun %d BUKAN merupakan Tahun Kabisat", tahun);
        } else if (tahun % 4 == 0) {
            System.out.format("Tahun %d merupakan Tahun Kabisat", tahun);
        } else {
            System.out.format("Tahun %d BUKAN merupakan Tahun Kabisat", tahun);
        }

        Scan.close();
    }
}
