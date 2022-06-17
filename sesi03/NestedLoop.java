package sesi03;

public class NestedLoop {
    public static void main(String[] args) {

        // creating variable
        int x, y;

        // repeat x and y times
        for (x = 0; x <= 5; x++) {
            for (y = 0; y <= 3; y++) {
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }

    }
}
