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
public class ex19 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in).useLocale(Locale.US);
         double x1, x2, x3, y1, y2, y3, s;
         
         System.out.print("Enter three points for a triangle: ");
         x1 = sc.nextDouble();
         y1 = sc.nextDouble();
         x2 = sc.nextDouble();
         y2 = sc.nextDouble();
         x3 = sc.nextDouble();
         y3 = sc.nextDouble();
         
         double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
         double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
         double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
         s = (side1 + side2 + side3) / 2;
         double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
         
         System.out.println("The area of the triangle is " + area);
                 
    }
}
