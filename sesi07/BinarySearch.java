package sesi07;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c, first, last, middle, n, search;
        int[] array = new int[10];

        System.out.print("Enter number of element : ");
        n = in.nextInt();

        for (c = 0; c < n; c++) {
            System.out.print("Enter integer " + (c + 1) + " : ");
            array[c] = in.nextInt();
        }

        System.out.print("Enter value to find : ");
        search = in.nextInt();
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1));
                break;
            } else {
                last = middle - 1;
                middle = (first + last) / 2;
            }

            if (first > last) {
                System.out.println(search + " is not present in the list.\n");
            }

        }

        in.close();
    }
}
