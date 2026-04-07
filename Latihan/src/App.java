public class App {
    public static void main(String[] args) throws Exception {
        Market mr = new Market("pahit", "Haruka", 0.0);
        mr.tampil();
    }
}

class Market {
    private String jenis;
    private String nama;
    private double harga;

    Market(String jenis, String nama, double harga) {
        this.jenis = jenis;
        this.nama = nama;
        this.harga = harga;
    }

    void tampil() {
        System.out.println("Jenis: " + jenis + ", Nama: " + nama + ", Harga: " + harga);
    }
}
