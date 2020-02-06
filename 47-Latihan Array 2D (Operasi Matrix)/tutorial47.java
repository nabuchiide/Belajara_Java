import java.util.Arrays;

/**
 * tutorial47
 */
public class tutorial47 {

    public static void main(String[] args) {
        int[][] matrix_a = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        printArray(matrix_a);

        int[][] matrix_b = { { 11, 12, 13 }, { 15, 16, 17 }, { 19, 11, 12 } };
        printArray(matrix_b);
        System.out.println("=========================== +");

        int[][] hasilTambah = tambahMatriks(matrix_a, matrix_b);
        printArray(hasilTambah);

        System.out.println("_________________________________________");


        // perkalian Matriks
        int[][] matrix_c = { { 1, 2,}, { 3, 4 } };
        printArray(matrix_c);

        int[][] matrix_d = { { 11, 12,}, { 13, 14 } };
        printArray(matrix_d);
        System.out.println("=========================== X");

        int [][] hasilKali = kaliMatriks(matrix_c, matrix_d);
        printArray(hasilKali);

    }

    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static int[][] tambahMatriks(int[][] matrix_1, int[][] matrix_2) {
        int baris_matriks = matrix_1.length;
        int kolom_matriks = matrix_1[0].length;

        int baris_matriks1 = matrix_2.length;
        int kolom_matriks1 = matrix_2[0].length;

        int[][] hasil = new int[baris_matriks][kolom_matriks];

        if (baris_matriks == baris_matriks1 && kolom_matriks == kolom_matriks1) {

            for (int i = 0; i < baris_matriks; i++) {
                for (int j = 0; j < kolom_matriks; j++) {
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("baris atau Kolom tidak sama");
        }
        return hasil;
    }
    private static int[][] kaliMatriks(int[][] matriks_1, int[][] matriks_2) {
        // jika a * b maka jumlah baris akan mengikuti matriks a, kolom akan mengikuti kolom b
        int baris_1 = matriks_1.length;
        int kolom_1 = matriks_1[0].length;

        int baris_2 = matriks_2.length;
        int kolom_2 = matriks_2[0].length;

        int [][] hasil = new int[baris_1][kolom_2];
        int buffer;
        for (int i = 0; i < baris_1; i++) {
            for (int j = 0; j < kolom_2; j++) {
                buffer = 0;
                for (int j2 = 0; j2 < kolom_1; j2++) {
                    buffer += matriks_1[i][j2] * matriks_2[j2][j];
                }
               hasil[i][j] = buffer;
            }
        }
        return hasil;
    }
}