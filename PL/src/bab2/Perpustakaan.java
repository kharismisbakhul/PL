package bab2;

public class Perpustakaan {

    public static void main(String[] args) {
        Buku[] buku = new Buku[2];
        buku[0] = new Buku("Pemrograman Lanjut", "Teknologi", "Dwi", "Sebuah buku tentang pemrograman");
        buku[1] = new Buku("Pemrograman ", "Teknologi", "Dwi", "Sebuah buku tentang pemrograman");
        System.out.println("---------------");
        String arr[] = buku[0].sinopsis.split(" ");
        System.out.println("Jumlah kata sinopsis buku "+ buku[0].judul +" = "+arr.length);
        System.out.println("---------------");
        System.out.println(cekKesamaan(buku[0], buku[1]));
        System.out.println("---------------");
        System.out.println(duplicate(buku[0]).judul);
        System.out.println(duplicate(buku[0]).kategori.kategori);
        System.out.println(duplicate(buku[0]).penulis);
        System.out.println(duplicate(buku[0]).sinopsis);
    }

    static double cekKesamaan(Buku buku, Buku buku1) {
        double temp = 0;
        if (buku.judul.equalsIgnoreCase(buku1.judul)) {
            temp++;
        }
        if (buku.kategori.kategori.equals(buku1.kategori.kategori)) {
            temp++;
        }
        if (buku.penulis.equalsIgnoreCase(buku1.penulis)) {
            temp++;
        }
        if (buku.sinopsis.equalsIgnoreCase(buku1.sinopsis)) {
            temp++;
        }
        return temp / 4 * 100;
    }
    static Buku duplicate(Buku buku){
        Buku duplicate = buku;
        return duplicate;
    }
}
