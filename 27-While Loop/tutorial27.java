/**
 * tutorial27
 */
public class tutorial27 {

    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;
        System.out.println("awal Program");
        while (kondisi) {
            System.out.println("while loop ke- " + a);
            a++;
            if (a < 10) {
                kondisi = false;
            }
        }
        System.out.println("akhir Program");
    }
}