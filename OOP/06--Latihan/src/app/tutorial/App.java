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

    void equipAromor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("=================================");
        System.out.println("Name : "+this.name);
        System.out.println("Healt : "+this.healt+" HP");
        this.weapon.display();
        this.armor.display();
        System.out.println("=================================");
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
            //Player 1
        player1.equipWeapon(pedang);
        player1.equipAromor(bajuBesi);
        player1.display();
            //Player 2
        player2.equipAromor(kaos);
        player2.equipWeapon(ketapel);
        player2.display();
    }
}