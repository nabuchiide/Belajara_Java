import java.util.Arrays;

/**
 * tutorial44
 */
public class tutorial44 {

    public static void main(String[] args) {

        int[] arrayAngka1 = { 2, 4, 3, 5, 8, 7, 6, 5, 4, 4, 3, 5, 6, 7, 8 };
        int[] arrayAngka2 = { 0, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 7 };

        int[] arrayHasil = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Angka1");
        printArray(arrayAngka2, "Angka2");
        printArray(arrayHasil, "Hasil ");

    }

    private static void printArray(int[] dataArray, String pesan) {
        System.out.println("Array" + pesan + Arrays.toString(dataArray));
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
}