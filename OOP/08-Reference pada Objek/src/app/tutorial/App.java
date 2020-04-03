package app.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        Buku dataBuku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        dataBuku1.display();
        // Menampilkan Address
        String addressDataBuku1 = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressDataBuku1);

        // assigment Objek
        // Buku buku2 = dataBuku1;
        Buku buku2 = new Buku("Killing Commandantore", "Haruki Murakami");//ini yang bener vroh
        buku2.display();

        String addressDataBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressDataBuku2);

        // Krena dataBuku1 dan buku2 berada pada address atau referensi yang sama
        dataBuku1.judul = "Membunuh Komdantur";
        dataBuku1.display();
        buku2.display();

        fungsiBuku(buku2);
    }

    public static void fungsiBuku(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Adress dalam Fungsi => \t"+addressDataBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);

    }
}