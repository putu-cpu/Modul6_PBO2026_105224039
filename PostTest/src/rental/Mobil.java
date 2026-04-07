package rental;

 //subclass Mobil 
       public class Mobil extends Kendaraan {
        int kapasitasPenumpang; 

        public Mobil (String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
            super (nomorPolisi, merk, tahunProduksi , hargaSewaDasar); 
            this.kapasitasPenumpang = kapasitasPenumpang; 
        }

        public void displayInfo () {
            super.displayInfo(); 
            System.out.println("Kapasitas :" + kapasitasPenumpang + "orang");
        }

        public double hitungHargaSewa (int hari) {
            double total = super.hitungHargaSewa (hari); 

            total += 50000 * hari; 

            if (kapasitasPenumpang > 5) {
                total += 50000; 
            }

            return total; 
        }

    }