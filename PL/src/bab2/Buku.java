package bab2;

public class Buku {

    String judul;
    Kategori kategori;
    String penulis;
    String sinopsis;

    Buku(String judul, String kategori, String penulis, String sinopsis) {
        this.judul = judul;
        this.kategori = new Kategori(kategori);
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }
}
