/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters3;

import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;
        
        if(b < a || c < a) {
            if(b < a) {
                temp = a;
                a = b;
                b = temp;
            }
            if(c < a) {
                temp = a;
                a = c;
                c = temp;
            }
        }
        if( c < b) {
            temp = b;
            b = c;
            c = temp;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
}
