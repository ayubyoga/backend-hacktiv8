package sesi07;

public class Binary {

    public static int binarySearch(int[] list, int key) {

        // deklarasi variable
        int bottom = 0;
        int top = list.length - 1;

        // logaritma
        while (top >= bottom) {
            int middle = (bottom + top) / 2;

            if (key < list[middle])
                top = middle - 1;
            else if (key == list[middle])
                return middle;
            else
                bottom = middle + 1;
        }
        return -1; // Tidak ditemukan dalam array
    }

    public static void main(String[] args) {

        // deklarasi array
        int myArray[] = { 5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81 };
        int key1 = 26;
        int key2 = 78;
        int key3 = 8;
        int key4 = 39;

        int i = Binary.binarySearch(myArray, key1);
        int j = Binary.binarySearch(myArray, key2);
        int k = Binary.binarySearch(myArray, key3);
        int l = Binary.binarySearch(myArray, key4);

        System.out.println("Key " + key1 + " index " + i);
        System.out.println("Key " + key2 + " index " + j);
        System.out.println("Key " + key3 + " index " + k);
        System.out.println("Key " + key4 + " index " + l);
    }
}
