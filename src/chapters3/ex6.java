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
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double FEET_PER_INCH = 0.0833333;
        
        //compute BMI
        weight *= KILOGRAMS_PER_POUND;
        double height = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
        double bmi = weight / (Math.pow(height, 2));
        
        //Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
               System.out.println("Underweight");
        else if (bmi < 25)
               System.out.println("Normal");
        else if (bmi < 30)
               System.out.println("Overweight");
        else
               System.out.println("Obese");
    }
}
