//package Polymorphism;

public class Cetak {
    static double maxNumber(double a, double b) {

        // method dan parameter berbeda
        // tipe data double

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int maxNumber(int a, int b) {

        // method dan parameter berbeda
        // tipe data integer

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(10, 20));
        System.out.print(4);

        // hasil dari nila argumennya, akan sesuai dengan tipe parameternya
        // 20 integer
        // 7.5 double

    }
}
