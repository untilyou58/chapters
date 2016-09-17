/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gra_rate = sc.nextDouble();
        double gra = subtotal * gra_rate * .01;
        double total = subtotal + gra;
        
        System.out.println("The gratuity is $" + gra + " and total is $" + total);
    }
}
