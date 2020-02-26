import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * tutorial56
 */
public class tutorial56 {

    public static void main(String[] args) throws IOException {

        /**
         * Membuka File
         */
        // byte Stream -> FileInputStream : menggunakan character yang sudah ada local
        // Character Stream -> FileReader : menggunakan character Internasional
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("OutputByte.txt");
        FileWriter charFileOutput = new FileWriter("OutputChar.txt");

        /**
         * Membaca File
         */

        // byte file
        int buffer = byteFileInput.read();
        while (buffer != -1) {
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

         // char file
         int bufferChar = charFileInput.read();
         while (bufferChar != -1) {
             charFileOutput.write(bufferChar);
             bufferChar= charFileInput.read();
         }
 
        /**
         * Menutup File
         */
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
    }
}