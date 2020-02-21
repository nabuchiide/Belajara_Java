import java.io.FileInputStream;
import java.io.*;
import java.util.Scanner;

/**
 * tutorial52
 */
public class tutorial52 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        FileInputStream fileInput =null;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai Array ke - ");
        int index = userInput.nextInt();
        
        //Exception handling (try, catch, finaly)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (Exception exception_message) {
            //TODO: handle exception
            System.out.println(exception_message);
        }

        //runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        //Mengabungkan dua Exeception
        System.out.println("Menggabungkan dua buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.err.println("Index yang dimasukan tidak sesuai denan jumlah Array");
        }catch(IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        System.out.println("Menambahkan Finally");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.err.println("Index yang dimasukan tidak sesuai denan jumlah Array");
        }finally{
            System.out.println("finally");
        }
        System.out.println("akhir dari program");
    }
}