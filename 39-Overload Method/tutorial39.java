/**
 * tutorial39
 */
public class tutorial39 {
    // Overload merupakan pemakaian nama fungsi dengan pola yang berbeda
    public static void main(String[] args) {
        printAngka(10);
        printAngka(10.5f);
        printAngka(16.7d);
        printAngka(tambah(10, 5));
        printAngka(tambah(10.6f, 5));
        printAngka(tambah(10, 5.8f));
        printAngka(tambah(10.7f, 5.9f));

    }

    private static void printAngka(int angkaInteger) {
        System.out.println("angka ini adalah angka integer dengan nilai =" + angkaInteger);
    }

    private static void printAngka(Float angkaFloat) {
        System.out.println("angka ini adalah angka integer dengan nilai =" + angkaFloat);
    }

    private static void printAngka(double angkaDouble) {
        System.out.println("angka ini adalah angka integer dengan nilai =" + angkaDouble);
    }

    private static int tambah(int angka, int angka2) {
        return angka + angka2;
    }

    private static float tambah(int angka, float angka2) {
        return angka + angka2;
    }

    private static float tambah(float angka, int angka2) {
        return angka + angka2;
    }

    private static float tambah(float angka, float angka2) {
        return angka + angka2;
    }
}