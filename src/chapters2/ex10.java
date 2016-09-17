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
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.print("Enter the inittial temperature : ");
        double initTemp = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = sc.nextDouble();
        
        double energyNeeded = kilograms * (finalTemp - initTemp) * 4184;
        System.out.println("The energy needed is " + energyNeeded);
    }
}
