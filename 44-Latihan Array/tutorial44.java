import java.util.Arrays;

/**
 * tutorial44
 */
public class tutorial44 {

    public static void main(String[] args) {

        int[] arrayAngka1 = { 7, 6, 8, 9, 7, 8, 6, 5, 4, 6, 7, 8, 9, 0, 8 };
        int[] arrayAngka2 = { 0, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 7 };
        // Penjumlahan antara dua buah array

        int[] arrayHasil = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Angka1");
        printArray(arrayAngka2, "Angka2");
        printArray(arrayHasil, "Hasil ");

        // Menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Angka1");
        printArray(arrayAngka2, "Angka2");
        printArray(arrayHasil2, "Hasil ");

        printArray(arrayAngka1, "Angka1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "Reverse");

        printArray(arrayAngka2, "Angka2");
        reverse(arrayAngka2);
        printArray(arrayAngka2, "Reverse2");
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

    private static void reverse(int[] dataArray) {
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static void reverse2(int[] dataArray) {
        Arrays.sort(dataArray);
        int buffer;
        for (int i = 0; i < dataArray.length / 2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
        }
    }
}