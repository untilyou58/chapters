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
public class ex12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter speed and acceleration: ");
        double speed = sc.nextDouble();
        double acceleration = sc.nextDouble();
        
        double lenght = Math.pow(speed, 2) / ( 2 * acceleration);
        
        System.out.println("The minium runway length for this airplane is " +lenght);
    }
}
