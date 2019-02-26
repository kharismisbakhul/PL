package bab1;
public class main {
    public static void main(String[] args) {
        Mobil a = new Mobil();
        Mobil b = new Mobil();
        a.merk = "Toyota";
        a.nomor_ban = 50;
        a.warna = "Pink";
        a.plat_nomor = "A 1 23";
        b.merk = "Lamborgini";
        b.nomor_ban = 55;
        b.warna = "Rose Gold";
        b.plat_nomor = "B 1 23";
        System.out.println(b.warna);
    }
}