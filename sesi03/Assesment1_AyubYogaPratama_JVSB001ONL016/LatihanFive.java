public class LatihanFive {
    public static void main(String[] args) {

        // Variables
        int Y1 = 4;
        int Y2 = 5;
        int X1;
        int X2;

        // Count X1
        X1 = (Y1 + Y2) * (Y1 + Y2);

        // Count X2
        X2 = (Y1 % 4) * Y2;

        // A. Output X1 - X2
        System.out.println("Nilai X1 adalah " + X1);
        System.out.println("Nilai X2 adalah " + X2);

        // B. Logic
        System.out.println("X1 >= X2 : " + (X1 >= X2));
        System.out.println("X1 <= X2 : " + (X1 <= X2));
        System.out.println("X1 % 4 == ++X2 % 5 : " + ((X1 % 4) == (++X2 % 5)));
    }
}
