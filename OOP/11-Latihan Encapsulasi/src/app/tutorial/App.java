package app.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju Besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Isabella");
        Armor armor2 = new Armor("Gaun Pesta", 1, 30);
        Weapon weapon2 = new Weapon("belati", 9);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.show();
        player2.show();
        System.out.println("===========================");
        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
    }
}

class Player {
    private String name;
    private int level;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;

    private boolean isAlive = true;
    // ini adalah objek member
    private Armor armor;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void show() {
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Max Health\t: " + this.getHealth() + " / " + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower() + "\n");
        System.out.println("Status\t\t: " + this.isAlive + "\n");
    }

    public void attack(Player opponent) {
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println("--->>>>><<<<---");
        System.out.println(this.name + " Meneyerang " + opponent.getName() + " dengan damage\t\t: " + damage + "\n");
        // attack Opponent
        opponent.defence(damage);
    }

    public void defence(int damage) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // receive damage
        int deltaDamage;
        int defencePower = this.armor.getDefanceArmor();
        System.out.println(this.name + " Defance Power = " + defencePower);
        if (damage > defencePower) {
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        System.out.println("damage earned = " + deltaDamage);
        // adding totoal damage
        this.totalDamage += deltaDamage;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // check isAlive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }
        this.show();
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getDefencePower();
    }

    private void levelUp() {
        this.level++;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Armor {
    private String name;
    private int defencePower;
    private int addHealth;

    public Armor(String name, int defencePower, int addHealth) {
        this.name = name;
        this.defencePower = defencePower;
        this.addHealth = addHealth;
    }

    public int getDefencePower() {
        return this.defencePower * 10 + this.addHealth;
    }

    public int getDefanceArmor() {
        return this.defencePower * 2;
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}