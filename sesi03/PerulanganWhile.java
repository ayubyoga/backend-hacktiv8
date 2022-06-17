package sesi_03;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {

        // creating variable and scanner
        boolean Running = true;
        int counter = 0;
        String Jawab;
        Scanner Scan = new Scanner(System.in);

        while (Running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]>");

            Jawab = Scan.nextLine();

            // answer checking
            if (Jawab.equalsIgnoreCase("ya")) {
                Running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
        Scan.close();
    }
}
