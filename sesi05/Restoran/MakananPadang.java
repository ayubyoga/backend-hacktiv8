package sesi05.Restoran;

public class MakananPadang {
    public static void main(String[] args) {
        // Membuat instance/Objek dari class Restoran
        RestoranPadang data = new RestoranPadang();

        // membuat data pada variable
        data.setMenu("Ayam Pop Komplit Sayur Nangka plus Perkedel Kentang");
        data.setHarga(35000);
        data.setSpesial(true);

        // Memanggil
        System.out.println("Menu Makanan    : " + data.getMenu());
        System.out.println("Harga Makanan   : Rp. " + data.getHarga());
        System.out.println("Menu Spesial    : " + data.getSpesial());
    }
}
