package app.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "1332144730");
        test();
        // Method
        mahasiswa1.show();
        mahasiswa1.setNama("Lontong");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNPM());

        String data = mahasiswa1.sayHai("Selamat Pagi");
        System.out.println(data);

        Dosen dsn1 = new Dosen("Otong");
        System.out.println(dsn1.nama);
    }

    static void test() {
        System.out.println("Ini adalah method test dalam kelas main");
    }
}

class Mahasiswa {
    // Data member
    String nama = "nama Asli";
    String NPM;

    // constructor
    Mahasiswa(String nama, String NPM) {
        this.nama = nama;
        this.NPM = NPM;
        System.out.println(nama + ", " + NPM);
    }

    // method tanpa return
    void show() {
        System.out.println("==================");
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM  : " + this.NPM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama) {
        System.out.println("==================");
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama() {
        System.out.println("==================");
        return this.nama;
    }

    String getNPM() {
        System.out.println("==================");
        return this.NPM;
    }

    // method dengan return dan parameter
    String sayHai(String Pesan) {
        System.out.println("==================");
        return Pesan + " Juga, nama saya adalah " + this.nama;
    }

}

class Dosen{
    String nama;

    Dosen(String nama){
        this.nama = nama;
    }
}