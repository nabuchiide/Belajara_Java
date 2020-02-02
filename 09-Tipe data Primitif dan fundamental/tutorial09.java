/**
 * tutorial09
 */
public class tutorial09 {

    public static void main(String[] args) {
        // Tipe Data primitif
        // integer, byte, short, long, double, float, char, boolean

        // integer(satuan)
        int i = 10;
        System.out.println("===== INTEGER =====");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("Nilai MAX = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min = " + Integer.MIN_VALUE);
        System.out.println("Besar Nilai Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Nilai Integer = " + Integer.SIZE + " bit \n");

        // Byte(satuan)
        byte b = 10;
        System.out.println("===== Byte =====");
        System.out.println("nilai Byte b = " + (b));
        System.out.println("Nilai MAX = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min = " + Byte.MIN_VALUE);
        System.out.println("Besar Nilai byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Nilai byte = " + Byte.SIZE + " bit \n");

        // Short(satuan)
        short s = 10;
        System.out.println("===== SHORT =====");
        System.out.println("nilai Short s = " + s);
        System.out.println("Nilai MAX = " + Short.MAX_VALUE);
        System.out.println("Nilai Min = " + Short.MIN_VALUE);
        System.out.println("Besar Nilai Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Nilai Short = " + Short.SIZE + " bit \n");

        // Long(satuan)
        long l = 10L;
        System.out.println("===== Long =====");
        System.out.println("nilai Long l = " + l);
        System.out.println("Nilai MAX = " + Long.MAX_VALUE);
        System.out.println("Nilai Min = " + Long.MIN_VALUE);
        System.out.println("Besar Nilai Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Nilai Long = " + Long.SIZE + " bit \n");

        // Double
        Double d = -10.5d;
        System.out.println("===== Double =====");
        System.out.println("nilai Double d = " + d);
        System.out.println("Nilai MAX = " + Double.MAX_VALUE);
        System.out.println("Nilai Min = " + Double.MIN_VALUE);
        System.out.println("Besar Nilai Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Nilai Double = " + Double.SIZE + " bit \n");

        // Float
        Float f = -8.5f;
        System.out.println("===== Float =====");
        System.out.println("nilai Float d = " + f);
        System.out.println("Nilai MAX = " + Float.MAX_VALUE);
        System.out.println("Nilai Min = " + Float.MIN_VALUE);
        System.out.println("Besar Nilai Float = " + Double.BYTES + " bytes");
        System.out.println("Besar Nilai Float = " + Float.SIZE + " bit \n");

        // Character (satuan)
        Character c = 'A';
        System.out.println("===== Character =====");
        System.out.println("nilai Character l = " + c);
        System.out.println("Nilai MAX = " + Character.MAX_VALUE);
        System.out.println("Nilai Min = " + Character.MIN_VALUE);
        System.out.println("Besar Nilai Character = " + Character.BYTES + " bytes");
        System.out.println("Besar Nilai Character = " + Character.SIZE + " bit \n");

        //Bolean(nilai true, false)
        Boolean Bol = true;
        System.out.println("===== Boolean =====");
        System.out.println("nilai Boolean l = " + Bol);
        System.out.println("Nilai MAX = " + Boolean.TRUE);
        System.out.println("Nilai Min = " + Boolean.FALSE);
       
    }
}