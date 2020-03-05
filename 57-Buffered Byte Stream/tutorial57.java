import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

/**
 * tutorial57
 */
public class tutorial57 {

    public static void main(String[] args) throws IOException {

        long waktuStrart, waktuFinish;
        // Membaca dari File
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        //menghitung waktu pembacaan
        waktuStrart = System.nanoTime();
        System.out.println(byteInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = "+(waktuFinish - waktuStrart)+"\n=====================");
        byteInput.close();

        //Membaca dari memori
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferInput = new BufferedInputStream(byteInput2);

        bufferInput.mark(200);
        //menghitung waktu pembacaan
        waktuStrart = System.nanoTime();
        System.out.println(bufferInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = "+(waktuFinish - waktuStrart));

        //baca Ulang
        bufferInput.reset();
        byte[] data = bufferInput.read();
        String dataString = new String(data);
        System.out.println(dataString);
    }
}