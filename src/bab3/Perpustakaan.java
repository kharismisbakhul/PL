package bab3;
public class Perpustakaan {
    public static void main(String[] args) {
        Buku [] buku = new Buku[2];
        buku[0].judul = "Pemrograman Lanjut";
        buku[0].kategori.kategori= "Teknologi";
        buku[0].penulis = new String[2];
        buku[0].penulis[0] = "Dwi";
        buku[0].penulis[1] = "Jony";
        
        buku[0] = new Buku("Pemrograman Lanjut", new Kategori("Teknologi", "aa"), "Dwi");
        
//        Buku b = new Buku();
    }
}