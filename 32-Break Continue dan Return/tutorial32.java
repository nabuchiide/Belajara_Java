/**
 * tutorial32
 */
public class tutorial32 {

    public static void main(String[] args) {
        // break, continue, return
        int a = 0;

        while (true) {
            a++;
            if (a == 10) {
                //keyword untuk mengeluarkan dari loop
                break;
            } else if (a == 5) {
                //keyword untuk memaksa memulai aksi
                continue;
            } else if (a == 7) {
                return;
            }
            System.out.println("Loop ke - "+a);
        }
        System.out.println("Akhir dari loop");
    }
}