import java.util.*;

/**
 * tutorial23
 */
public class tutorial23 {

    public static void main(String[] args) {
        // Switch Case
        String input;
        Scanner inputuser = new Scanner(System.in);
        input = inputuser.next();

        System.out.print("Panggila nama : ");
        System.out.println(input);

        // Ekspresi merupakan satuan (int, long, byte, short), String atau enum
        switch (input) {
        case "otong":
            System.out.println("saya hadir dan saya otong");
            break;
        case "ucup":
            System.out.println("saya hadir dan saya ucup");
            break;
        case "Mario":
            System.out.println("saya hadir dan saya Mario");
            break;
        default:
            System.out.println("input tidak hadir boss!");
            break;
        }
        System.out.println("Selesai Program");
    }
}