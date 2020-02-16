import java.util.*;
/**
 * tutorial48
 */
public class tutorial48 {

    public static void main(String[] args) {
        //membuat String
        String kataString = "hallo";
        char[] kataChar = {'h','a','l','l','o'};

        //Menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //Mengakses Komponen String
        System.out.println("ini adalah komponen pertama dari Char [] = "+kataChar[0]);
        System.out.println("Komponen pertama dari String = "+ kataString.charAt(0));
        
        //Merubah komponen dari Sring 
        // itu tidak bisa .... kenapa?, karena String di java itu imutable 
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        //kita bisa merubah komponen secara tidak langsung
        PrintAddress("kataString", kataString);

        kataString = "c" + kataString.substring(1, 5);
        System.out.println(kataString);

        PrintAddress("kataString", kataString);

        //memori dari String [String Pool]
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        PrintAddress("str_1", str_1);
        PrintAddress("str_2", str_2);
        PrintAddress("str_3", str_3);

        String str_4 = str_3.substring(0,4);
        PrintAddress("str_4", str_4);

        String str_5 = "callo";
        PrintAddress("str_5", str_5);

        kataString = "callo";
        PrintAddress("kataString", kataString);
        /**
         * 1. String di java itu imutable
         * 2. String yang berada di stringPool itu akan reusable, memorynya lebih efisien
         * 3. membuat String dengan method baru , makan dua akan di simpan di memori lain bukan di String pool
         * 
         */
        //liat lebih dalam
        String a =new String("hallo");
        PrintAddress("a", a);
    }

    private static void PrintAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t || address = " + Integer.toHexString(address));
    }
}