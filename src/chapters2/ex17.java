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
public class ex17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        System.out.print("Enter the wind speed miles per hour: ");
        double speed = sc.nextDouble();
        
        double windCold = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16) + 0.4275 * fahrenheit * Math.pow(speed, 0.16);
        
        System.out.println("The wind chill index is " + windCold);
    }
}
