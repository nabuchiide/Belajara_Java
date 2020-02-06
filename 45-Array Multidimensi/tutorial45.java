import java.util.*;

/**
 * tutorial45
 */
public class tutorial45 {

    public static void main(String[] args) {
        System.out.println("Belajar Array Multi Dimensi ");

        // cara membuat array 2 dimensi
        int[][] array_2D = { { 1, 2 }, { 3, 4 } };
        printArray2D(array_2D);
        //membuat array 2D dengan deklarasi
        System.out.println("===========================");
        int[][] arrayAngka = new int[5][6];
        printArray2D(arrayAngka);
        System.out.println("===========================");
        System.out.println("Looping Lengkap Secara Manual");
        nestedLoop(arrayAngka);
        LoopArray(arrayAngka);
        int[][] array_2D_2 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        LoopArray(array_2D_2);
        int[][] array_breaked={
            {2,1,3,4,5,6},
            {0,7,8,9,7,6,6,5},
            {9}
        };
        LoopArray(array_breaked);
    }

    private static void printArray2D(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i])); 
        }
    }
    private static void nestedLoop(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print("[");
           for (int j = 0; j < dataArray[i].length; j++) {
               System.out.print(dataArray[i][j]+",");
           }
           System.out.print("]\n");
        }
        System.out.println("===========================");
    }
    private static void LoopArray(int [][] dataArray) {
        for (int[] baris : dataArray) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
        System.out.println("===========================");
    }
}