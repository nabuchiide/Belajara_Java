/**
 * tutorial33
 */
public class tutorial33 {

    public static void main(String[] args) {
        //looping bersarang
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
                if ((i + j) == (n - 1)) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

         int n1 = 9;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(" * ");
                if (i==j) {
                    break;
                } else if ((i + j) == (n1 - 1)) {
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}