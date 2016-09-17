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
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("enter v0,v1 and t: ");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();
        
        double acceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is " + acceleration);
    }
}
