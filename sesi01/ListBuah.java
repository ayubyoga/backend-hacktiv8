package sesi01;

import java.util.LinkedList;

public class ListBuah {
    public static void main(String[] args) {
        // membuat instance
        LinkedList<String> buah = new LinkedList<>();

        // menambahkan data
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        // tambahan
        buah.addFirst("Paling Atas");
        buah.addLast("Paling Bawah");

        buah.set(2, "Diubah");
        buah.set(5, "Diubah");

        // hapus
        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);

        // cetak
        System.out.println("Nama Buah: " + buah);

        // hitung
        System.out.println("Jumlah Buah: " + buah.size());

    }
}
