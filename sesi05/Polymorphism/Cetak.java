package sesi05.Polymorphism;

public class Cetak {

    static double maxNumber(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int maxNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        //
        Manusia cowok = new Cowok();
        Manusia cewek = new Cewek();

        cowok.nyanyiLagu();
        cewek.nyanyiLagu();

        // overloading

        System.out.println(maxNumber(10, 20)); // method int
        System.out.println(maxNumber(5.97, 10.21)); // method double
    }

}