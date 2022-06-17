package sesi05.Latihan;

public class Utama {
    public static void main(String[] args) {

        // Creating 2D Object
        // BangunDatar bangunDatar = new BangunDatar();

        // Objek Persegi dan mengisi nilai prop
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // Objek Lingkaran dan mengisi nilai prop
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // objek Segitiga
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        mSegitiga.sisi = 6;

        // memanggil method luas dan keliling
        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();

    }
}