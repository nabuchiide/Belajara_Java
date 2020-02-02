import java.util.*;

/**
 * tutorial36
 */
public class tutorial36 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();
        gambar(inputPanjang, inputLebar);

        System.out.println("Luas = "+ Luas(inputPanjang, inputLebar));
        System.out.println("Keliling = "+ Keliling(inputPanjang, inputLebar));

        tampilKelilingLuas(inputPanjang, inputLebar);
    }

    private static void gambar(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int Luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int Keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar)*2;
        return hasil;
    }
    private static void tampilKelilingLuas(int panjang, int lebar) {
        System.out.println("Luas GAB= "+ Luas(panjang, lebar));
        System.out.println("Keliling GAB= "+ Keliling(panjang, lebar));
    }
}