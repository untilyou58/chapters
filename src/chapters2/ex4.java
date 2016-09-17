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
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = pounds * 0.454;
        
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
