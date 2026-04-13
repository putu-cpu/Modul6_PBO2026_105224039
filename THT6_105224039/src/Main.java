import perusahaan.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList untuk polymorphism
        ArrayList<Karyawan> daftar = new ArrayList<>();

        // 5 objek sesuai soal
        daftar.add(new Karyawan("K1", "Haruka", 2020, 5000000, 2.0));
        daftar.add(new Developer("D1", "Monic", 2018, 7000000, 4.0, "Senior", 20));
        daftar.add(new Developer("D2", "Neila", 2024, 6000000, 2.8, "Mid", 15));
        daftar.add(new Manajer("M1", "Sabet", 2015, 10000000, 4.8, "IT", 10));
        daftar.add(new Manajer("M2", "Zakia", 2025, 9000000, 3.5, "HR", 3));

        double totalAnggaran = 0;
        double totalRating = 0;

        Karyawan tertinggi = null;
        double gajiTertinggi = 0;

        // Loop
        for (Karyawan k : daftar) {
            k.displayInfo();

            double gaji = k.hitungGajiTotal();
            System.out.println("Total Gaji Bulan Ini: Rp " + gaji);
            System.out.println("----------------------------------");

            // Total anggaran
            totalAnggaran += gaji;

            // Cari gaji tertinggi
            if (gaji > gajiTertinggi) {
                gajiTertinggi = gaji;
                tertinggi = k;
            }

            // Total rating
            totalRating += k.getRatingKinerja();
        }

        // Output akhir
        System.out.println("Total Anggaran Gaji: Rp " + totalAnggaran);

        System.out.println("Highest Earner: " + tertinggi.getNama());

        double rataRating = totalRating / daftar.size();
        System.out.println("Rata-rata Rating: " + rataRating);
    }
}
