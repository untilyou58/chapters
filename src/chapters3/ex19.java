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
public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 3 edge lengths of a triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        
        boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        
        if(!isTriangle){
            System.out.println("Your input is not a valid triangle"); 
            System.exit(1);
        }
        
        double perimeter = side1 + side2 + side3;
        System.out.println("You entered a real triangle with the perimeter of " + perimeter + ".");
  }
}
