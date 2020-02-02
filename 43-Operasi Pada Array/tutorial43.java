import java.util.*;

/**
 * tutorial43
 */
public class tutorial43 {

    public static void main(final String[] args) {
        final int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        // Merubah Array menjadi String
        System.out.println("\nMerubah Array Mejadi String\n====================");
        printArray(arrayAngka1, 1);
        final int[] arrayAngka2 = new int[5];
        //======================================================================================
        //Mengcopy array
        System.out.println("\nMengCopy Array\n====================");
        System.out.println("nilai arrayAngka1 dan nilai arrayAngka2");
        printArray(arrayAngka1, 1);
        printArray(arrayAngka2, 2);
        System.out.println("---------\nmenggunakan metode Loop\n----------");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i]=arrayAngka1[i];
        }
        printArray(arrayAngka1, 1);
        printArray(arrayAngka2, 2);

        System.out.println("---------\nmenggunakan metode copyOf\n----------");
        final int [] arrayAngka3 = Arrays.copyOf(arrayAngka1, arrayAngka1.length); //copyof(nilai array yang akan dicopy, panjangn nila nya{di sini gak mesti array.length, bisa berupa angka})
        printArray(arrayAngka1, 1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3, 3);
        System.out.println(arrayAngka3);

        System.out.println("---------\nmenggunakan metode copyOfRange\n----------");
        final int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, 5);
        printArray(arrayAngka1, 1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4, 4);
        System.out.println(arrayAngka4);

        //======================================================================================
        //Memasukan nilai array
        System.out.println("---------\nFill Array\n----------");
        final int[]arrayAngka5=new int[100];
        printArray(arrayAngka5, 5);
        Arrays.fill(arrayAngka5, 1);
        printArray(arrayAngka5, 5);

         //======================================================================================
        //Memasukan nilai array
        System.out.println("---------\nKomparasi Array (menggunakan Arras.equals)\n----------");
        final int[] arrayAngka6 = {0,1,2,3,4,5};
        final int[] arrayAngka7 = {0,1,2,3,4,5};
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7)+"\n");
        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("nilai kedua array sama");
        } else {
            System.out.println("nilai kedua array beda");
        }
        System.out.println("\nngecek nilai array yang lebih besar\n");
        // System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        System.out.println("\nngecek index terbesar\n");
        // System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        //======================================================================================
        //sort array
        System.out.println("---------\nSort Array\n----------");
        final int[] arrayAngka8 = {0,1,2,3,4,5,7,9,8,6,9,8,7,8,6,8,9};
        printArray(arrayAngka8, 8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8, 8);
        //Seach Array
        System.out.println("---------\nSeach Array\n----------");
        int nil = 9;
        int posisi = Arrays.binarySearch(arrayAngka8, nil);
        System.out.println("angka "+nil+ " ada di index "+posisi);
    }

    private static void printArray(final int[] dataArray, final int i) {
        // Merubah Array menjadi String => menggunakan method Arrays.toString(...)
        System.out.println("array Angka" + i + " = " + Arrays.toString(dataArray));
    }
}