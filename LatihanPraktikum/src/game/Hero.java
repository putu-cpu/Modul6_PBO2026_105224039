package game;

//no1
 class Hero {
    String nama; 
    double health; 
    double attackPower; 

    // konstruksi berparameter
    public Hero (String nama, double health, double attackPower) {
        this.nama = nama; 
        this.health = health; 
        this.attackPower = attackPower; 
    }

    public void tampilkanInfo () {
        System.out.println("Nama Hero     : " + nama);
        System.out.println("Health status : " + health); 
        System.out.println("Attack Power  : " + attackPower);
        
    }

    //no2
    public void berlatih () {
        attackPower +=10; 
        System.out.println(nama + "sedang berlatih. attack power tambah");
    }

        public void terimaSerangan (double damage) {
            health -= damage; 
            System.out.println(nama + "menerima damage sebesar " + damage);
        }
    
        public void display() {
            System.out.println("Nama Hero     : " + nama);
            System.out.println("Health status : " + health); 
            System.out.println("Attack Power  : " + attackPower);
        }
    }

    //no3
    //Subclass
    class Herostrength extends Hero {
        private String tipe = "Strength"; 
    
    //Konstruktor
    Herostrength (String nama, double health, double attackPower){
        super (nama, health, attackPower);   
    }
    //tambahan display 
    public void display() {
    super.display () ; 
    System.out.println("Tipe Hero : " + tipe);
    }

    //no4
    //override terima serangan
    public void terimaSerangan (double damage) {
        double damageDiterima = damage * 0.5; 
        health -= damageDiterima; 
        System.out.println(nama + "Damage diterima sebesar separuh (50%)" + damageDiterima);
    }

    } 




