//package Latihan;

public class Segitiga extends Utama {

    float alas;
    float tinggi;
    float sisi;

    // Hitung Luas
    float luas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga  = " + luas);
        return luas;
    }

    // Hitung Keliling
    float keliling() {
        float keliling = 3 * sisi;
        System.out.println("Keliling Segitiga  = " + keliling);
        return keliling;
    }

}
