import java.util.Scanner;

/**
 * tutorial53
 */
public class tutorial53 {

    public static void main(String[] args) {
        int[] arrayData = { 0, 1, 2, 3 };

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke- : ");
        int indexInput = userInput.nextInt();

        // exception biasa
        System.out.println("\n===================Exception Biasa===================\n");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        System.out.println("\n===================Exception dalam Fungsi===================\n");
        int data = ambilDatadariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d", indexInput, data);

        // Exception trow by method
        System.out.println("\n===================Exception throw by method===================\n");
        int data2 = 0;
        try {
            data2 = ambilDatadariArray_2(arrayData, indexInput);

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d", indexInput, data2);
        System.out.println("\n\nakhir dari Program");
    }

    private static int ambilDatadariArray_2(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDatadariArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return hasil;
    }

}