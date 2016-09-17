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
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double discriminant = Math.pow(b, 2) - 4.0 * a * c;
        
        if(discriminant > 0.0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if(discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
   }      
}
