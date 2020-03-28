package com.tutorial;

//Class tanpa contructor 

/**
 * InnerApp
 */
class InnerApp {
    String dataString;
    int dataInteger;
}

// class dengan Construktor
/**
 * InnerApp_1
 */
class InnerApp_1 {
    String Nama;
    String NIM;
    String Jurusan;
    int Umur;

    InnerApp_1(String InputNama, String InputNIM, String InputJurusan) {
        Nama = InputNama;
        NIM = InputNIM;
        Jurusan = InputJurusan;
        System.out.println(InputNama);
        System.out.println(InputNIM);
        System.out.println(InputJurusan);
    }

    InnerApp_1(String Nama, String NIM, String Jurusan, int Umur) {
        System.out.println(Nama);
        System.out.println(NIM);
        System.out.println(Jurusan);
        System.out.println(Umur);
    }
}

class luasPersegi {
    int panjang;
    int lebar;
    int tinggi;
    int alas;
    int luas;

    luasPersegi(int panjang, int lebar) {
        luas = panjang * lebar;
        System.out.println(
                "LUAS DARI Bangun Datar\nDengan:\nLebar = " + lebar + "\nPanjanga = " + panjang + "\nadalah " + luas);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        InnerApp objectPolos = new InnerApp();
        objectPolos.dataString = "polos";
        objectPolos.dataInteger = 0;

        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);
        System.out.println("============================================================================");

        InnerApp_1 mahasiswa = new InnerApp_1("Ucup", "140553147", "Teknik Perteknikan", 22);
        System.out.println("============================================================================");
        InnerApp_1 mahasiswa1 = new InnerApp_1("Rahmat", "1405553148", "Teknik Kulrikulum");

        System.out.println("============================================================================");
        luasPersegi Kotak1 = new luasPersegi(4, 4);
    }
}