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
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //prompt the user to enter a weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        
        //prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        
        //convert weight to kilograms
        weight = weight * KILOGRAMS_PER_POUND;
        
        //convert height to meters
        height = height * METERS_PER_INCH;
        
        //compute BMI
        double bodyMassIndex = weight / Math.pow(height, 2);
        
        //display result
        System.out.println("BMI is " + bodyMassIndex);
    }
}
