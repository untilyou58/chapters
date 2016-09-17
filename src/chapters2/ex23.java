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
public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = sc.nextDouble();
        
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        
        System.out.println("the cost of driving is $" + costOfDriving);
    }
}
