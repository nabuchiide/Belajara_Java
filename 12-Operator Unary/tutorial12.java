/**
 * tutorial12
 */
public class tutorial12 {

    public static void main(String[] args) {
        //operasi yang dilakukan hanya pada satu variabel
        int angka =1;
        System.out.printf("Unary '+', %d menjadi %d \n", angka, +angka);
        System.out.printf("Unary '-', %d menjadi %d \n", angka, -angka);

        //Unary menggunakan decrement dan increment
        int angka2=10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " +angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = "+ angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' Prefix menjadi = %d \n", ++a);

        int b=5;
        System.out.printf("nilai dengan '++' Posfix menjadi = %d \n", b++);
        System.out.printf("nilai dengan '++' Posfix menjadi = %d \n", b);

        //Unary Boolean dengan ! untuk negasi
        boolean ucup =  true;
        System.out.println("nilai Boolean : "+ ucup);
        System.out.println("nilai Boolean negasi : "+ !ucup);
    }
}