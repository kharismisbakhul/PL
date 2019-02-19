package bab3;

public class Buku {

    String judul;
    Kategori kategori;
    String[] penulis;

    Buku(String judul, Kategori kategori, String penulis) {
        int a;
        this.judul = judul;
        this.kategori = kategori;
//        this.kategori = new Kategori(kategori);
        this.penulis = new String[0];
        this.penulis[0] = penulis;
    }

    Buku() {
        System.out.println("Kosong");
    }

    void getNama(String judul, int a) {
//        String nama;
//        nama = "";
        judul = "";
    }

    void getNama(int a, String judul) {
//        nama = "";
    }
}
