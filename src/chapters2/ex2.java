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
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final double PI = 3.14159265359;
        
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        
        double area = radius * radius * PI;
        double volume = area * length;
        
        System.out.println("the area is " + area);
        System.out.println("The volume is " + volume);
    }
}
