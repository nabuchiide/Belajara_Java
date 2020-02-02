/**
 * tutorial11
 */
public class tutorial11 {

    public static void main(String[] args) {
        // program konversi data
        int nilaiInt = 450; //32-bit
        System.out.println("Nilai int = "+nilaiInt);

        //memperluas rentang ke tipe data yang lebih besar
        long nilailong = nilaiInt;
        System.out.println("Nilai Long = "+nilailong);

        //memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte)nilaiInt;
        System.out.println("nilai Byte = "+nilaiByte);
        System.out.println("nilai MAX Byte = "+Byte.MAX_VALUE);
        System.out.println("nilai MAX Byte = "+Byte.MIN_VALUE);

        //Casting pembagian
        float a = 10;
        int b = 4;
        float c = a/b;
        System.out.printf("%f / %d = %f \n", a,b,c);

        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f", x , y, z);
    }
}