/**
 * tutorial16
 */
public class tutorial16 {

    public static void main(String[] args) {
        //Operator Bitwise
        Byte a = 3;
        Byte b,c;
        String a_bits, b_bits, c_bits;
        
        //Operator SHIFT LEFT
        System.out.println("==========SHIFT LEFT (<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a << 3);
        // System.out.println(b);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);

         //Operator SHIFT RIGHT
         System.out.println("==========SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a >> 2);
        // System.out.println(b);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);

         //Operator BITWISE OR
        System.out.println("\n==========BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        // System.out.println(b);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte)(a|b);
        // System.out.println(c);
        System.out.println("____________________________________________________OR");
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);

        //Operator BITWISE AND
        System.out.println("\n==========BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        // System.out.println(b);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte)(a&b);
        // System.out.println(c);
        System.out.println("____________________________________________________AND");
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);

        //Operator BITWISE XOR 
        System.out.println("\n==========BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        // System.out.println(b);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);
        c = (byte)(a^b);
        // System.out.println(c);
        System.out.println("____________________________________________________XOR");
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);

        //Operator NEGASI  
        System.out.println("\n==========BITWISE NOT (~)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)~a;
        System.out.println("____________________________________________________NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits, b);
    }
}