package com.tutorial;

// membuat class sebagai template

class Mahasiswa {
    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int Umur;
}

public class App {
    public static void main(String[] args) throws Exception {
         //membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.Nama = "ucup";
        mahasiswa1.NIM = "133305041";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.Umur = 17;
        mahasiswa1.Jurusan = "teknik perteknikan";

        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.Umur);
        System.out.println("=====================================");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.Nama = "Otong";
        mahasiswa2.NIM = "133305042";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.Umur = 32;
        mahasiswa2.Jurusan = "teknik perteknikan";

        System.out.println(mahasiswa2.Nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.Jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.Umur);
    }
}