package perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    // Konstruktor
    public Manajer(String id, String nama, int tahunMasuk, double gajiPokok,
                   double rating, String divisi, int jumlahAnggotaTim) {
        super(id, nama, tahunMasuk, gajiPokok, rating);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal() {
        double total = super.hitungGajiTotal();

        // Tunjangan manajerial
        double tunjangan = jumlahAnggotaTim * 300000;
        total += tunjangan;

        // Bonus ekstra jika rating > 4.5
        if (getRatingKinerja() > 4.5) {
            total += total * 0.15;
        }

        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah Tim: " + jumlahAnggotaTim);
    }
}