//package Latihan;

public class Persegi extends Utama {

    float sisi;

    // Hitung Luas
    float luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi  = " + luas);
        return luas;
    }

    // Hitung Keliling
    float keliling() {
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi  = " + keliling);
        return keliling;
    }

}
