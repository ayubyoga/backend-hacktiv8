import java.util.Scanner;

public class Buahan {
    public static void main(String[] args) {

        // creating array
        String[] Profesi = new String[5];

        // Scanner
        Scanner Scan = new Scanner(System.in);

        // Fill data
        for (int i = 0; i < Profesi.length; i++) {
            System.out.print("Buah ke- " + i + ": ");
            Profesi[i] = Scan.nextLine();
        }

        System.out.println("----------------------");

        // display array
        for (String b : Profesi) {
            System.out.println(b);
        }
        Scan.close();
    }
}
