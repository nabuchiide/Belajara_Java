import java.util.*;
import java.lang.*;
/**
 * tutorial49
 */
public class tutorial49 {

    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";
     
        //Mengambil Komponen String 
        System.out.println(kalimat.charAt(5));

        //Substring
        String kata = kalimat.substring(10,15); //Memori Heep
        System.out.println(kata);

        //Concatenation (concat)
        String kalimat2 = kata+ " Bakwan ";
        System.out.println(kalimat2);

        kata = kata + "Cireng"; // Efeknya disimpan di string pool
        System.out.println(kata);

        //Concat dengan non String 
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; //Casting integer ke String, karena print hanya untuk String
        System.out.println(kalimat3);

        // lowerCase dan UpperCase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        //Equality (Persamaan)
        String kataInput = "test"; // ini ada di StringPool
        String kataTest = "test"; // ini Juga ada di StringPool

        System.out.println("Persamaan Pada Lokasi StringPool");
        if (kataInput == kataTest) {
            System.out.println("Sama");
        }else{
            System.out.println("Tidak sama");
        }


        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMengambil Input dari User : ");
        kataInput = userInput.next(); // Tidak di StringPool
        System.out.println("ini adalah input user "+ kataInput);
        
        if (kataInput.equals(kataTest)) {
            System.out.println("Sama");
        }else{
            System.out.println("Tidak sama");
        }

        // Comparasi
        System.out.println("===============================Komparasi");
        String motor1 = "royal enfield himalaya";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
    }
}