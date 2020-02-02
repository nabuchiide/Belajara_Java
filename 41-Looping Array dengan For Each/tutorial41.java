import java.util.Arrays;
/**
 * tutorial41
 */
public class tutorial41 {

    public static void main(String[] args) {
        
        int [] Angka = {11,12,13,14,15,16,17,18,19,20};

        //looping Standar
        System.out.println("looping Standar");
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke-"+i+"adalah =" +Angka[i]);
        }
        //looping menggunakan properti array
        System.out.println("looping dengan properti length");
        for (int i = 0; i < Angka.length; i++) {
            System.out.println("index ke-"+i+"adalah =" +Angka[i]);
        }
        //looping khusus untuk Array collection <-array
        System.out.println("looping for Each");
        for (int nilai : Angka) {
            System.out.println("angka pada looping ini ="+nilai); 
        }
    }
}