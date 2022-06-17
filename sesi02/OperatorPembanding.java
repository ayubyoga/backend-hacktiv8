package sesi_02;

public class OperatorPembanding {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println("A > B ? " + hasil);

        // apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println("A < B ? " + hasil);

        // apakah A lebih besar samadengan dari B?
        hasil = nilaiA >= nilaiB;
        System.out.println("A >= B ? " + hasil);

        // apakah A lebih kecil samadengan dari B?
        hasil = nilaiA <= nilaiB;
        System.out.println("A <= B ? " + hasil);

        // apakah A sama dengan dari B?
        hasil = nilaiA == nilaiB;
        System.out.println("A = B ? " + hasil);

        // apakah A tidak sama dengan dari B?
        hasil = nilaiA != nilaiB;
        System.out.println("A != B ? " + hasil);
    }
}
