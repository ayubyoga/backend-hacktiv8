package sesi05.Latihan;

public class Lingkaran extends Utama {

    float Phi = (float) 3.14;
    float r;

    // Hitung Luas
    float luas() {
        float luas = Phi * r * r;
        System.out.println("Luas Lingkaran  = " + luas);
        return luas;
    }

    // Hitung Keliling
    float keliling() {
        float keliling = 2 * Phi * r;
        System.out.println("Keliling Lingkaran  = " + keliling);
        return keliling;
    }

}
