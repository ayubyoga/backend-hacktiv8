package sesi02;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {

    }

    // variabel dan scanner
    String lampu;
    Scanner scan = new Scanner(System.in);

    // input
    System.out.print("Inputkan nama warna: ");lampu=scan.nextLine();

    switch(lampu){
            case merah:
                System.out.println("Lampu merah, berhenti!");
                break;
            case kuning:
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case merah:
                System.out.println("Lampu hijau, Silahkan jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
    }
}
