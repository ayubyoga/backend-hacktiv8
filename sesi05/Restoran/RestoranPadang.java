package sesi05.Restoran;

public class RestoranPadang {

    // variable
    private String menu;
    private double harga;
    private boolean spesial;

    // Setter Public dengan Parameter
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    // Getter Public
    public String getMenu() {
        return menu;
    }

    public double getHarga() {
        return harga;
    }

    public boolean getSpesial() {
        return spesial;
    }
}
