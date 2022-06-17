package sesi05.Assesment2_AyubYogaPratama_JVSB001ONL016;

import java.util.Scanner;

public class LatihanFive {
    public static void main(String args[]) {

        try (
                // Inisialisasi
                // ((saya masih belum terlalu paham tentang syntax "try" di atas))
                // (( namun direkomendasikan otomatis, sebelumnya tidak bisa run menjadi bisa))
                Scanner Scan = new Scanner(System.in)) {

            // Deklarasi Variable
            int jenisBarang = 0, i = 0;
            double totalBayar = 0;

            // Deklarasi Array
            int[] kodeBarang = new int[5];
            int[] qtyBarang = new int[5];
            int[] hargaBarang = new int[5];
            double[] subTotal = new double[5];
            double[] diskonBarang = new double[5];
            String[] barang = new String[5];

            // Input dari User
            System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
            System.out.print(" Masukkan Jumlah Jenis Barang yang Akan Dibeli: ");
            jenisBarang = Scan.nextInt();

            System.out.println(" ");
            // Masukkan Input ke dalam Array

            for (i = 0; i < jenisBarang; i++) {

                // Input kode barang
                System.out.print("Masukkan Kode Barang Ke-" + (i + 1) + " : ");
                kodeBarang[i] = Scan.nextInt();

                // Input qty barang
                System.out.print("Masukkan qty Ke-" + (i + 1) + " : ");
                qtyBarang[i] = Scan.nextInt();

                // Menentukan barang berdasarkan kode barang
                switch (kodeBarang[i]) {

                    // Barang 1
                    case 1:
                        barang[i] = "Mouse Bluetooth 5.0   ";
                        hargaBarang[i] = 149999;
                        diskonBarang[i] = 0.1;
                        break;

                    // Barang 2
                    case 2:
                        barang[i] = "Headphone Eksternal   ";
                        hargaBarang[i] = 246000;
                        diskonBarang[i] = 0.05;
                        break;

                    // Barang3
                    case 3:
                        barang[i] = "Powerbank 10.000 mAh  ";
                        hargaBarang[i] = 136000;
                        diskonBarang[i] = 0;
                        break;

                    // Barang 4
                    case 4:
                        barang[i] = "Tripod Kamera         ";
                        hargaBarang[i] = 267999;
                        diskonBarang[i] = 0.2;
                        break;

                    // Barang5
                    case 5:
                        barang[i] = "SmartWatch Xiaomi     ";
                        hargaBarang[i] = 899000;
                        diskonBarang[i] = 0.1;
                        break;

                    default:
                        System.out.println("Kode Barang Salah! Silahkan Ulang");
                }

            }
            // menampilkan hasil
            System.out.println("No Nama Barang                Harga          QTY   Diskon   Sub-Total");
            for (i = 0; i < jenisBarang; i++) {
                // hitung total bayar
                subTotal[i] = ((qtyBarang[i]) * ((hargaBarang[i]) - (hargaBarang[i] * diskonBarang[i])));
                totalBayar += subTotal[i];

                // hasil
                System.out.println((i + 1) + "    " + barang[i] + "  Rp. " + hargaBarang[i] + ",00    " + qtyBarang[i]
                        + "     " + (int) (diskonBarang[i] * 100) + "%     Rp. " + subTotal[i]);
            }
            System.out.println("  ");

            // total bayar
            System.out.println("Total Bayar : Rp. " + totalBayar);

            Scan.close();
        }
    }

}
