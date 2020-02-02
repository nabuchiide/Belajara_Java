import java.util.*;

/**
 * tutorial25
 */
public class tutorial25 {

    public static void main(String[] args) {
        // a operator b
        Scanner inputUser;
        float a, b, hasil;
        char operator;
        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input User : " + a + " " + operator + " " + b);
        if (operator == '+') {
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-') {
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            // perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            // pembagian
            if (b == 0) {
                System.out.println("Pembagian Nol Menghasilakan nilai tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            // Operator tidak ditemukan
            System.out.println("Operator tidak ditemukan! ");
        }
    }
}