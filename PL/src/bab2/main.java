/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2;

/**
 *
 * @author Kharis
 */
public class main {
    public static void main(String[] args) {
        Hewan a = new Hewan("asa", "Kuning");
        Hewan b = new Hewan();
        Hewan c;
        c = new Hewan();
        System.out.println(a.nama);
        System.out.println(a.warna);
        a.Jalan("a");
        a.Jalan("a", 10);
//        a.Jalan();
//        b.Jalan();
//        a.Jalan(10);
    }
}
