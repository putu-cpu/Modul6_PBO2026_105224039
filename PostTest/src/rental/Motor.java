package rental;

//Subclass Motor
    public class Motor extends Kendaraan {
        int KapasitasMesin; 

        public Motor (String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
            super (nomorPolisi, merk, tahunProduksi, hargaSewaDasar); 
            this.KapasitasMesin = kapasitasMesin; 
        }

        public void displayInfo () {
            super.displayInfo (); 
            System.out.println("Kapasitas Mesin : " + KapasitasMesin + " CC" );
        }

        public double hitungHargaSewa (int hari) {
            double total = super.hitungHargaSewa (hari); 

            if (KapasitasMesin >= 250) {
                total += 25000 * hari; 
            }
            return total; 
        }
    }
