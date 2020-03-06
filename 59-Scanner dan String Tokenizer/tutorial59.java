import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * tutorial59
 */
public class tutorial59 {

    public static void main(String[] args) throws IOException{
       FileReader fileInput = new FileReader("input.txt");
       BufferedReader bufferReader = new BufferedReader(fileInput);

       Scanner scanner = new Scanner(bufferReader);
       //ini untuk cek adakah kata selanjutnya atau tidak
       System.out.println(scanner.hasNext()); //true

       //untuk membaca kata, dengan delimeter/ pemisah 
       System.out.println(scanner.next());
       System.out.println(scanner.next());
       System.out.println(scanner.next());
       System.out.println(scanner.next());
       System.out.println(scanner.next());

       System.out.println(scanner.hasNext()); //false
       //System.out.println((char)bufferReader.read());
        System.out.println("=========================================");
        //Menggunakan delimeter
       FileReader fileInput2 = new FileReader("input2.txt");
       bufferReader = new BufferedReader(fileInput2);
       bufferReader.mark(200);

       scanner = new Scanner(bufferReader);
       scanner.useDelimiter(",");
       // membaca scanner
       while (scanner.hasNext()) {
        System.out.print(scanner.next()+" ");
       }

       //menggunakan String Tokenizer
       bufferReader.reset();
       String data =bufferReader.readLine();
       System.out.println(data);
       
       StringTokenizer stringToken = new StringTokenizer(data,",");

       while (stringToken.hasMoreTokens()) {
        System.out.print(stringToken.nextToken()+" ");
       }
       
    }
}