package app.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Marni", 0, 100);
        player1.show();
        System.out.println("\n-------------PERUBAHAN-------------\n");

        // default
        player1.name = "Surti";
        player1.show();

        // public
        player1.exp = 100;
        player1.show();

        // private => Tidak bisa diakses
        // player1.healt = 200;//(tidak bisa diakases oleh class diluar class nya)

        // method
        player1.show();

        // public
        player1.ubahNama("Jono");
        player1.show();

        //private
        //player1.tambahExp(); // karena tambahExp() merupakan method private maka hanya bisa diakses oleh class nya saja, apa bila diakses bukan oleh class nya maka akan error

    }
}

class Player {
    String name; // default => Bisa dibaca dan ditulis dari luar class nya
    public int exp;// public => Bisa diabca dan tulis dari luar class nya
    private int healt; // hanya bisa dibaca dan ditulis didalam class saja

    Player(String name, int exp, int healt) {
        this.name = name;
        this.exp = exp;
        this.healt = healt;
    }

    // default modifier access
    void show() {
        System.out.println("=======================================");
        System.out.println("Name\t :\t" + this.name);
        System.out.println("exp\t :\t" + this.exp);
        System.out.println("Healt\t :\t" + this.healt);
        System.out.println("=======================================\n\n");
        tambahExp();
    }

    // public
    public void ubahNama(String namaBaru) {
        this.name = namaBaru;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}