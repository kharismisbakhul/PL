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
public class Hewan {
    String nama;
    String warna;
    Hewan h;
    int a;
    double b;
    char c;
    float f;
    
    public Hewan(String a, String b){
        nama = a;
        warna = b; 
    }
    public Hewan(){
        
    }
    
    public void Jalan(String a){
        System.out.println(nama+ " sedang jalan");
    }
    
    public void Jalan(String b, int a){
        System.out.println(nama+ " sedang jalan "+a+" meter");
    }
}
