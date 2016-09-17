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
public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.print("Enter circle1's center x- , y- coordinates, and radius: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.print("Enter circle2's center x- , y- coordinates, and radius: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        
        if(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2- y1, 2), 0.5)
                <= Math.abs(r1 - r2))
            System.out.println("circle 2 is inside circle 1");
        else if(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)
                <= r1 + r2)
            System.out.println("circle 2 overlaps circle 1");
        else
            System.out.println("circle2 does not overlaps circle 1");
    }
}
