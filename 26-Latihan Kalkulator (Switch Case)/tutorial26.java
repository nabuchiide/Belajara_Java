import java.util.*;

/**
 * tutorial26
 */
public class tutorial26 {

    public static void main(String[] args) {
        Scanner inputUser;
        float a, b, hasil;
        String operator;
        inputUser = new Scanner(System.in);
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch (operator) {
        case "+":
            // Penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
            break;
        case "-":
            // pengurhanga
            hasil = a - b;
            System.out.println("hasil = " + hasil);
            break;
        case "*":
            // Perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
            break;
        case "/":
            // pembagian
            switch ((int)b) {
            case 0:
                System.out.println("hasil merupakan nilai tak hingga");
                break;
            default:
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            }
            break;
        default:
            System.out.println("operator tidak ditemukan");
            break;
        }
    }
}