import java.io.FileInputStream;
import java.io.IOException;

/**
 * tutorial54
 */
public class tutorial54 {

    public static void main(String[] args) throws IOException{
        FileInputStream fileInput = new FileInputStream("input.txt");
        int panjang = fileInput.read();
        for (int i = 0; i < panjang; i++) {
            System.out.print((char)fileInput.read());
        }
    }
}