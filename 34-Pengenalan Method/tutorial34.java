/**
 * tutorial34
 */
public class tutorial34 {

    public static void main(String[] args) {
        //y = (x +2)x
        int y,x;
        x=5;
        y= hitung(x);
        System.out.println("X = "+x+" Y = "+y);

        x=20;
        y= hitung(x);
        System.out.println("X = "+x+" Y = "+y);

        x=40;
        y= hitung(x);
        System.out.println("X = "+x+" Y = "+y);
    }

    static int hitung(int input) {
        int hasil;
        // hasil = (input + 2) * input;
        hasil = input*input;
        return hasil;
    }
}