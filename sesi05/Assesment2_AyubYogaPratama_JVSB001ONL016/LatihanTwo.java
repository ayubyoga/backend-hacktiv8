package Assesment2_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanTwo {

    public static void main(String[] args) {

        // Membuat Scanner dan Array
        Scanner Scan = new Scanner(System.in);
        String[][] kursi = new String[2][3];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.format("Siapa yang akan duduk di kelas (%d,%d) : ", i, j);
                kursi[i][j] = Scan.nextLine();
            }
        }

        // Hasil
        System.out.println("=============================================");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.format("| %s | \t", kursi[i][j]);
            }
            System.out.println("");
        }

        System.out.println("=============================================");
        Scan.close();
    }
}
