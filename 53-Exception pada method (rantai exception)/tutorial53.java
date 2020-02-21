import java.util.Scanner;

/**
 * tutorial53
 */
public class tutorial53 {

    public static void main(String[] args) {
        int[] arrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke- : ");
        int indexInput = userInput.nextInt();
        
        //exception biasa
        try {
            System.out.printf("data dari array ke-%d adalah %d", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e);
        }
        System.out.println("\n\nakhir dari Program");
    }

    private static int ambilDatadariArray(int[]array, int index) {
        try {
            System.out.printf("data dari array ke-%d adalah %d", index, arrayData[indexInput]);
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e);
        }
        System.out.println("\n\nakhir dari Program");
    }

    }
}