import java.util.Scanner;

/**
 * tutorial18
 */
public class tutorial18 {

    public static void main(String[] args) {
        // Kesimpulan perkalian atau pembagian akan dilakukan terlebih dahulu
        // jika dilakukan perkalian dan pembagian, maka akan dilakukan operasi dari kiri ke kanan
        int hasil = 10/2 - 2 * 5;
        System.out.println(hasil);
        hasil = 5*2-10;
        System.out.println(hasil);

        //menggunakan pengelompokan operasi degana ()
        hasil = 60/(2+10);
        System.out.println(hasil);

        Scanner userinput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("====Mengitung Persamaan Kuadrat====");
        int m,x,c, y;

        System.out.print("nilai X = ");
        x = userinput.nextInt();
        System.out.print("nilai gradien m = ");
        m = userinput.nextInt();
        System.out.print("bias c = ");
        c = userinput.nextInt();
        y = (m*x*x)+c;
        System.out.println("nilai Y = "+y);
    }
}