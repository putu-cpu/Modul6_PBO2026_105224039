package minimarket; 

class Produk {
    protected String namaProduk; 
    protected double harga; 

    public Produk(String namaProduk , double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void tampilkanDetail () {
        System.out.println("Nama produk : " + namaProduk);
        System.out.println("Harga : Rp "  + harga);
    }

}

class MakananRingan extends Produk {
    private String rasa; 

    public MakananRingan (String namaProduk, double harga, String rasa){
        super(namaProduk, harga);
        this.rasa = rasa; 
    }
    public void tampilkanDetail () {
        super.tampilkanDetail();
        System.out.println("Rasa : " + rasa);
    }
}



