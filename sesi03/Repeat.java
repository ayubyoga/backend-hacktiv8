package sesi03;

//import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {

        // creating variable and scanner
        int Running = 0;
        int counter = 0;
        int Jawab = 10;
        int i;
        // Scanner Scan = new Scanner(System.in);

        System.out.println("Hasil Output: ");
        while (Running <= 10) {
            for (i = 0; i <= Jawab; i++) {
                System.out.println("Perulangan ke- " + i);
                // Jawab = Scan.nextInt();

                // answer checking
                if (Jawab > 10) {
                    Running = 10;
                }

                counter++;
            }
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
        // Scan.close();
    }
}
