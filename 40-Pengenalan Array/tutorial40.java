import java.util.Arrays;

/**
 * tutorial40
 */
public class tutorial40 {

    public static void main(String[] args) {
        // Assigment
        // tipedata [] nama = {Komponen-komponen}
        System.out.println("Assigment Array");
        // index = 0 1 2 3
        // | | | |
        int[] arrayInteger = { 1, 2, 3, 4 };

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi
        // tipedata[] nama = new int[jumlah Array];
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[6];

        arrayFloat[4] = 15.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        System.out.println(arrayFloat[5]);

        float hasil = arrayInteger[2] - arrayFloat[4];
        System.out.println(hasil);

        System.out.println(Arrays.toString(arrayInteger)); // method merubah Array ke String
        System.out.println(Arrays.toString(arrayFloat)); // method merubah Array ke String
    }
}