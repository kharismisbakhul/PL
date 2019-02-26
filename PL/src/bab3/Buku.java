package bab3;
public class Buku {
    String judul;
    Kategori kategori;
    String penulis;
    String sinopsis;
    int penjualanPerBulan;
    
    Buku(String judul, String kategori, String penulis, String sinopsis) {
        this.judul = judul;
        this.kategori = new Kategori(kategori);
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }
    double hitungRoyalti(double harga){
        double royalti = 0.1*harga*penjualanPerBulan;
        return royalti;
    }
    double hitungRoyalti(double harga, double persen){
        double royalti = persen*harga*penjualanPerBulan;
        return royalti;
    }
}
