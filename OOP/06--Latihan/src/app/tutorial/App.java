package app.tutorial;

//player
class Player {
    String name;
    double healt;
    int level;
    // objek member
    Weapon weapon;
    Armor armor;

    Player(String name, double healt) {
        this.name = name;
        this.healt = healt;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipAromor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("=================================");
        System.out.println("Name : " + this.name);
        System.out.println("Healt : " + this.healt + " HP");
        this.weapon.display();
        this.armor.display();
        System.out.println("=================================");
    }

    void Attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + opponent.name + " With Power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower) {
        // mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }
        this.healt -=damage;
        System.out.println(this.name + " gets damage " + damage);
    }
}

// senjata
class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + "\n-Attack : " + this.attackPower);
    }
}

// armor
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + "\n-Defence : " + this.defencePower);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Membuat Objek Player
        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Otong", 50);
        // Membuat Objek Weapon
        Weapon pedang = new Weapon("Pedang", 15);
        Weapon ketapel = new Weapon("Ketapel", 1);
        // Membuat Objek Armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor kaos = new Armor("Kaos", 0);
        // equip Senjata dan Armor
        // Player 1
        player1.equipWeapon(pedang);
        player1.equipAromor(bajuBesi);
        player1.display();
        System.out.println();
        // Player 2
        player2.equipAromor(kaos);
        player2.equipWeapon(ketapel);
        player2.display();

        System.out.println("\nPertempuran");
        System.out.println("\n>>>>>>> Episode -1 <<<<<<<<");
        player1.Attack(player2);
        player1.display();
        player2.display();
        System.out.println("\n>>>>>>> Episode -2 <<<<<<<<");
        player2.Attack(player1);
        player1.display();
        player2.display();
    }
}