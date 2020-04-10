package app.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show() {
        System.out.println("Player name = " + this.name);
    }

    // static method
    static void showNumberOfPlayer() {
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("All Mighty");
        Player player3 = new Player("Midnight");
        Player player4 = new Player("Mt Lady");

        Player.showNumberOfPlayer();
        System.out.println("Names = " + Player.getNames());
    }
}