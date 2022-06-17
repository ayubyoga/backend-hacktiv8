package sesi_01;

import java.util.LinkedList;

public class ListBarang {
    public static void main(String[] args) {
        LinkedList<String> barang = new LinkedList<>();

        // Menambahkan Data pada Objek
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        // cek
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Penuh");
        }

        // cek keadaan barang
        if (barang.contains("Komputer")) {
            System.out.println("Barang Ditemukan");
        } else {
            System.out.println("Barang Tidak Ditemukan");
        }
    }
}
