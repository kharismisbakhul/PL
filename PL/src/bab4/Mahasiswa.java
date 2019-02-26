/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author Kharis
 */
public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }    
}

class main{
    public static void main(String[] args) {
        Mahasiswa a = new Mahasiswa("Usman","18616");
        a.setNama("Ali");
//        a.setNim("18515");
        System.out.println(a.getNama());
        System.out.println(a.getNim());
    }
}