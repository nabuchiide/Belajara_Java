import java.util.*;

/**
 * tutorial42
 */
public class tutorial42 {

    public static void main(String[] args) {
        int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        int[] arrayAngka2 = new int[5];

        System.out.println("Memori arrayAngka1 -> " + arrayAngka1);
        System.out.println("Memori arrayAngka2 -> " + arrayAngka2);

        arrayAngka2 = arrayAngka1;
        System.out.println("================setelah di samakan maka memori sama==========");
        System.out.println("Memori arrayAngka1 -> " + arrayAngka1);
        System.out.println("Memori arrayAngka2 -> " + arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka2));
        UbahArray(arrayAngka1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka2));
    }
    private static void UbahArray(int[] dataArray) {
        for (int i : dataArray) {
            System.out.println(i+2);
        }
        dataArray[0]= 125;
        for (int i : dataArray) {
            System.out.println(i);
        }
    }
}