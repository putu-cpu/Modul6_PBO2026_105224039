package perusahaan;

//Superclass
public class Karyawan {
   
    //Encapsulation
    private String idKaryawan; 
    private String nama; 
    private int tahunMasuk; 
    private double gajiPokok; 
    private double ratingKinerja; 


    //Konstruktor
    public Karyawan (String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan; 
        this.nama = nama; 
        this.tahunMasuk = tahunMasuk; 
        this.gajiPokok = gajiPokok;

         // Validasi rating (harus 1.0 - 5.0)
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0; 
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method hitung gaji total
    public double hitungGajiTotal() {
        int tahunSekarang = 2026;

        // Hitung masa kerja
        int masaKerja = tahunSekarang - tahunMasuk;

        // Bonus loyalitas, 5% per tahun
        double bonus = masaKerja * 0.05 * gajiPokok;

        double total = gajiPokok + bonus;

        // Penalti jika rating < 2.5
        if (ratingKinerja < 2.5) {
            total = total * 0.9; // potong 10%
        }

        return total;
    }

    // Display info
    public void displayInfo() {
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
    
