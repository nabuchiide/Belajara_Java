import java.util.Scanner;
/**
 * tutorial17
 */
public class tutorial17 {
    public static void main(String[] args) {
	    Scanner userinput = new Scanner(System.in);
	    // int input = userinput.nextInt();
	    // System.out.println("input = "+input);
	
	    // int input2 = userinput.nextInt();
	    // System.out.println("input = "+input2);
	    //Membuat Perhitungan LUAS
	    // luas = panjang * lebar
	    
	    int panjang, lebar, luas, tinggi, Volume;
	    System.out.println("Mengitung Luas");
	    System.out.print("Panjang = ");
	    panjang = userinput.nextInt();
	    System.out.print("Panjang = ");
	    lebar = userinput.nextInt();
	
	    luas = panjang*lebar;
	    System.out.println(luas);
	
	    System.out.println("Menghitung Volume");
	    tinggi = userinput.nextInt();
	    Volume = luas * tinggi;
	    System.out.println("Volume = " +Volume);
	}
}