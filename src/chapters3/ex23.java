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
public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a point with two coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
        
        System.out.println("Point (" + x + ", " + y + ") is " +
                ((withinRectangle) ? "in " : " out ") + "the rectangle");
    }
}
