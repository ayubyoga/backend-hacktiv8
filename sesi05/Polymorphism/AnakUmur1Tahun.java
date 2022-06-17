package sesi05.Polymorphism;

//package Polymorphism;

public class AnakUmur1Tahun extends Induk implements InterfaceAnakUmur1Tahun {

    @Override
    public void anakSiapa() {
        //
        System.out.println("Nama anaknya adalah : " + namaAnak);
    }

    @Override
    public void hobiAnak() {
        //
        System.out.println("Hobi anaknya adalah : " + hobiAnak);
    }

}
