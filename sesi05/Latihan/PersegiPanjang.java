package sesi05.Latihan;

public class PersegiPanjang extends Utama {

    float panjang;
    float lebar;

    // Hitung Luas
    float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }

    // Hitung Keliling
    float keliling() {
        float keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
        return keliling;
    }

}
