public class App {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Deku", 100, 50);
        Herostrength hero2 = new Herostrength("Shouto", 100, 77);

        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        System.out.println();
        hero2.display();

        System.out.println("\n=== LATIHAN ===");
        hero1.berlatih();
        hero2.berlatih();

        System.out.println("\n=== TERKENA SERANGAN ===");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        System.out.println("\n=== STATUS AKHIR ===");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}

class Hero {
    String name;
    int health;
    int strength;

    Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    void display() {
        System.out.println("Nama: " + name);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
    }

    void berlatih() {
        strength += 5;
        System.out.println(name + " berlatih dan strength naik menjadi " + strength);
    }

    void terimaSerangan(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " terkena serangan dan health turun menjadi " + health);
    }
}

class Herostrength extends Hero {
    Herostrength(String name, int health, int strength) {
        super(name, health, strength);
    }
}