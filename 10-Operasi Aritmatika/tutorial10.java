/**
 * tutorial10
 */
public class tutorial10 {

    public static void main(final String[] args) {
        // Operasi Aritmatika
        Integer var1, var2, hasil;
        var1 = 5;
        var2 = 6;
        // 1. Penjumlahan
        hasil = var1 + var2;
        System.out.println(var1 + " + " +var2+" = "+hasil);

        // 2. Pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1, var2, hasil);

        // 3. Pembagian
        hasil = var1 / var2;
        System.out.printf("%d : %d = %d \n", var1, var2, hasil);

        float varf1, varf2, hasilf;
        varf1 = 6;
        varf2 = 5;
        hasilf = varf1 / varf2;
        System.out.printf("%f : %f = %f \n", varf1, varf2, hasilf);
        // 4. Perkalian
        hasil = var1 * var2;
        System.out.printf("%d X %d = %d \n", var1, var2, hasil);

        // 5. Modulus
        hasil = var1 % var2;
        System.out.printf("%d Mod %d = %d \n", var1, var2, hasil);
    }
}