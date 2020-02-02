/**
 * tutorial35
 */
public class tutorial35 {

    public static void main(String[] args) {
        selamatPagi("abah");
        selamatPagi("emak");
        fungsiVod("ada apa dengan cinta");
        System.out.println(simpel());
    }
    //Fungsi tanpa kembalian
    //Fungsi Void harus ada kata static
    private static void selamatPagi(String nama) {
        System.out.println("Selamat Pagi "+nama);
    }

    private static void fungsiVod(String input) {
        System.out.println(input);;
    }
    /**
     * fungsi atau method dengan nilai kembalian
     * sehingga menggunakan return
     * mengembalikan nilai nya ke (10.0f <dalam kasus ini>)
     */
    private static float simpel() {
        return 10.0f;
    }
}