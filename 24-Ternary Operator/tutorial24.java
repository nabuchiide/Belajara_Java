import java.util.Scanner;

/**
 * tutorial24
 */
public class tutorial24 {

    public static void main(String[] args) {

        // ternary Operator
        // variabel x = ekspresi ? statement_true : statement_fasle

        int input, x;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        input = inputUser.nextInt();
        // variabel x = ekspresi ? statement_true : statement_fasle

        x = (input == 10) ? (input + input) : input / 2; // Ternary Operator

        // if (input == 10) {
        // x = input + input;
        // } else {
        // x = input / 2;
        // }

        System.out.println("nilainya adalah : " + x);
    }
}