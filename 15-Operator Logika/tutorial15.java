/**
 * tutorial15
 */
public class tutorial15 {

    public static void main(String[] args) {
        // Operator Logika --> Operasi yang bisa dilakukan pada operasi data Boolean
        //AND, OR, XOR, Negasi
        boolean a,b,c;

        //OR / Atau (||)
        System.out.println("\n========== OR (||)");
        a =false;
        b = false;
        c = (a||b);
        System.out.println(a+" || "+b+" = "+c);
        a =false;
        b = true;
        c = (a||b);
        System.out.println(a+" || "+b+" = "+c);
        a =true;
        b = false;
        c = (a||b);
        System.out.println(a+" || "+b+" = "+c);
        a =true;
        b = true;
        c = (a||b);
        System.out.println(a+" || "+b+" = "+c);

         //AND / dan (&&)
         System.out.println("\n========== AND (&&)");
         a =false;
         b = false;
         c = (a&&b);
         System.out.println(a+" && "+b+" = "+c);
         a =false;
         b = true;
         c = (a&&b);
         System.out.println(a+" && "+b+" = "+c);
         a =true;
         b = false;
         c = (a&&b);
         System.out.println(a+" && "+b+" = "+c);
         a =true;
         b = true;
         c = (a&&b);
         System.out.println(a+" && "+b+" = "+c);

         //XOR / Exlusive OR (^)
         System.out.println("\n========== XOR (^)");
         a =false;
         b = false;
         c = (a^b);
         System.out.println(a+" ^ "+b+" = "+c);
         a =false;
         b = true;
         c = (a^b);
         System.out.println(a+" ^ "+b+" = "+c);
         a =true;
         b = false;  
         c = (a^b);
         System.out.println(a+" ^ "+b+" = "+c);
         a =true;
         b = true;
         c = (a^b);
         System.out.println(a+" ^ "+b+" = "+c);

         //NOT /Negasi (!)
         System.out.println("\n========== NEGASI (1)");
         a =false;
         c = !a;
         System.out.println(a+" --> (!) = "+c);
         a =true;
         c = !a;
         System.out.println(a+" --> (!) = "+c);
    }
}