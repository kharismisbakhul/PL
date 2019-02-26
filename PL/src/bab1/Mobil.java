package bab1;
public class Mobil {
    Kursi k = new Kursi();
    String warna;
    String plat_nomor;
    int nomor_ban;
    String merk;
    
    int [] x = new int[2];
    
    public void jalan(){
        System.out.println("Aku jalan");
    }
    public void rem(){
        System.out.println("Aku berhenti");
    }
}