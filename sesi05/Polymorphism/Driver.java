package sesi05.Polymorphism;

//package Polymorphism;

public class Driver {

    public static void main(String[] args) {
        AnakUmur1Tahun i = new AnakUmur1Tahun();
        i.anakSiapa();
        i.makan();

        Induk a1 = new AnakUmur1Tahun();
        a1.minum();

        InterfaceAnakUmur1Tahun a11 = new AnakUmur1Tahun();
        a11.hobiAnak();
    }
}