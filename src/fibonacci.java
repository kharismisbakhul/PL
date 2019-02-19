
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kharis
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        int counter = in.nextInt();
        long hasil = 0;
        if (a >= -100 && a <= 100 && b >= -100 && b <= 100 && counter >= 0 && counter <= 1000) {
//            System.out.print(a+" "+b+" ");
            for (int i = 0; i < counter-1; i++) {
                hasil = a+b;
                a = b;
                b = (long) hasil;
//                System.out.print(hasil+" ");
            }
            System.out.println(hasil);
        }
    }
}
