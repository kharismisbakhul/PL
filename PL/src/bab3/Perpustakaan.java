package bab3;
public class Perpustakaan {
    public static void main(String[] args) {
        Buku[] buku = new Buku[2];
        buku[0] = new Buku("Pemrograman Lanjut", "Teknologi", "Ali", "Sebuah buku tentang pemrograman");
        buku[1] = new Buku("Pemrograman Lanjut", "Teknologi", "Ali", "Sebuah buku tentang pemrograman");
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
        System.out.println("---------------");
        System.out.println(bacaFile(buku[0]));
        System.out.println("---------------");
        String [] atribut = new String[4];
        atribut[0] = "Pemrograman Web";
        atribut[1] = "Teknologi";
        atribut[2] = "Deny";
        atribut[3] = "Sebuah buku tentang pemrograman";
        simpanFile(atribut);
        System.out.println("---------------");
        buku[0].penjualanPerBulan = 10;
        System.out.println("Royalti 10% : "+buku[0].hitungRoyalti(50000));
        System.out.println("Royalti : "+buku[0].hitungRoyalti(50000, 0.5));
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
    static String bacaFile(Buku buku){
        String namaFile = buku.judul+";"+buku.penulis+";"+buku.kategori.kategori+";"+buku.sinopsis;
        return namaFile;
    }
    static Buku simpanFile(String [] atribut){
        Buku bukubaru = new Buku(atribut[0], atribut[1], atribut[2], atribut[3]);
        System.out.println("Buku tersimpan");
        return bukubaru;
    }
}
