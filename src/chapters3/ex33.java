/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter weight and prcie for package 1: ");
        double weight1 = sc.nextDouble();
        double price1 = sc.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = sc.nextDouble();
        double price2 = sc.nextDouble();
        
        if(price1 / weight1 < price2 / weight2)
            System.out.println("Package 1 has a better price.");
        else if(price1 / weight1 > price2 / weight2)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price.");
    }
}
