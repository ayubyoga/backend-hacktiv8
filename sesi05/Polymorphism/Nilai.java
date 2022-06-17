package sesi05.Polymorphism;

public class Nilai {
    int num1;
    int num2;

    Nilai(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void cetakNilai() {
        System.out.println("(" + num1 + "," + num2 + ")");
    }

    Nilai center(Nilai other) {
        return new Nilai((num1 + other.num1) / 2, (num2 + other.num2) / 2);
    }

    public static void main(String[] args) {
        Nilai tes = new Nilai(1, 2);
        tes.cetakNilai();
    }
}
