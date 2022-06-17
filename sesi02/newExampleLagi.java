package sesi_02;

public class newExampleLagi {
    public static void main(String args[]) {
        int x = 10;
        int y = 15;
        int hasil = 0;

        hasil = x & y;
        System.out.println("x & y = " + hasil);

        hasil = x | y;
        System.out.println("x | y = " + hasil);

        hasil = x ^ y;
        System.out.println("x ^ y = " + hasil);

        hasil = ~x;
        System.out.println("~x = " + hasil);

        hasil = x << 2;
        System.out.println("x << y = " + hasil);

        hasil = x >> y;
        System.out.println("x >> y = " + hasil);

        hasil = x >>> y;
        System.out.println("x >>> y = " + hasil);

    }

}
