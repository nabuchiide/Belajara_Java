import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * tutorial55
 */
public class tutorial55 {

    public static void main(String[] args) throws IOException{
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        // System.out.println("Ini File Input bernilai = "+fileInput);
        // fileInput = new FileInputStream("input.txt");
        // System.out.println("Ini File Input bernilai = "+fileInput);
        // fileInput.close();
        // fileInput = new FileInputStream("input2.txt");
        // System.out.println("Ini File Input bernilai = "+fileInput);
        /**
         * ini untuk membaca File
         */
        fileInput = new FileInputStream("input.txt");
        int data = fileInput.read();
        while (data !=-1) {
            System.out.print((char)data);
            data = fileInput.read();
        }
        /**
         * Menutup File
         */
        fileInput.close();

        /**
         * salah satu contoh yang lain
         */

         try {
             //Membuka File
              fileInput = new FileInputStream("input.txt");
              fileOutput = new FileOutputStream("output2.txt");

             //Membaca File
             int buffer = fileInput.read();
             //menulis File
             fileOutput.write(buffer);
             /**
              * Menulis file ke dalam dokumen
              */
             while (buffer !=-1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
         } finally{
             //TODO: handle exception
             if (fileInput != null) {
                 fileInput.close();
             }
             if (fileOutput != null){
                 fileOutput.close();
             }
         }

         //try with resourcess
         try (
             FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")
                ) {
             //Membaca file
             int data2 = in.read();
             while (data2 !=-1) {
                out.write((char)data2);
                data2 = in.read();
            }
         } 

    }
}