/**
 * tutorial28
 */
public class tutorial28 {

    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;
        do {
            a++;
            System.out.println("do While ke-"+a);
            if (a == 10) {
                 kondisi = false;
            }
        } while (kondisi);
        System.out.println("ini merupakan akhir dari perogram ");
    }
}