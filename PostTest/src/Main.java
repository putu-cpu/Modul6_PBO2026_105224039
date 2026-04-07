import rental.*;

public class Main {
    public static void main(String[] args) {

        // buat objek
        Kendaraan mobil1 = new Mobil("B1234AA", "Avanza", 2010, 300000, 7);
        Kendaraan mobil2 = new Mobil("B5678BB", "Brio", 2020, 350000, 5);
        Kendaraan motor1 = new Motor("B9999CC", "Ninja", 2021, 200000, 250);
        Kendaraan motor2 = new Motor("B8888DD", "Beat", 2018, 100000, 110);

        // Mobil 1
        System.out.println("=== Mobil 1 ===");
        mobil1.displayInfo();
        System.out.println("Total Sewa 5 Hari: " + mobil1.hitungHargaSewa(5));

        System.out.println();

        // Mobil 2
        System.out.println("=== Mobil 2 ===");
        mobil2.displayInfo();
        System.out.println("Total Sewa 5 Hari: " + mobil2.hitungHargaSewa(5));

        System.out.println();

        // Motor 1
        System.out.println("=== Motor 1 ===");
        motor1.displayInfo();
        System.out.println("Total Sewa 5 Hari: " + motor1.hitungHargaSewa(5));

        System.out.println();

        // Motor 2
        System.out.println("=== Motor 2 ===");
        motor2.displayInfo();
        System.out.println("Total Sewa 5 Hari: " + motor2.hitungHargaSewa(5));
    }
}