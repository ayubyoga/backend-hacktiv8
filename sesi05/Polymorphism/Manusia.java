//package Polymorphism;

abstract class Manusia {

    // deklarasi class dan method tipe abstract
    protected abstract void nyanyiLagu();

}

class Pria extends Manusia {

    // menggunakan method dari class abstract Manusia
    @Override
    protected void nyanyiLagu() {
        System.out.println(" da du du di dam ");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

class Wanita extends Manusia {

    // menggunakan method dari class abstract Manusia
    @Override
    protected void nyanyiLagu() {
        System.out.println(" du ri dam dam ");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

public class Cetak {

    public static void main(String[] args) {

        // buat object referensi class manusia, dengan cons pria
        Manusia Pria = new Pria();

        // menampilkan output pada method yang ada di class pria
        Pria.nyanyiLagu();

        // buat object referensi class manusia, dengan cons wanita
        Manusia Wanita = new Wanita();

        // menampilkan output pada method yang ada di class wanita
        Wanita.nyanyiLagu();

    }
}