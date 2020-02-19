import java.lang.StringBuilder;
/**
 * totorial50
 */
public class totorial50 {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        //append {Menambahkan sesuatu kedalam Strring Builder}
        System.out.println("=====================");
        builder.append(" semuanya");
        printData(builder);
        builder.append(" warga karawang");
        printData(builder);

        //insert {Menambahkan kata di tengah-tengah}
        builder.insert(19, " Kota");
        printData(builder);

        //delete {mengapus kata ditengah-tengah}
        builder.delete(19, 24);
        printData(builder);

        //merubah charcter pada index tertentu
        builder.setCharAt(14, 'z');
        printData(builder);
        builder.setCharAt(14, 'W');
        printData(builder);

        //replace {Mengganti kata dengan kata yang lain}
        builder.replace(20, 28, "Bandung");
        printData(builder);

        //String builder menjadi String
        //casting menjadi String
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("adress = "+ Integer.toHexString(addressString));

        //String ke String builder
        StringBuilder builder1 = new StringBuilder(kalimat);
        printData(builder1);
    }
    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = "+dataBuilder);
        System.out.println("panjang = "+dataBuilder.length());
        System.out.println("Kapasistas = "+dataBuilder.capacity());

        int adressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("adress = "+Integer.toString(adressBuilder));

    }
}