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
public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter balance and interest rate(e.g., 3 for 3%): ");
        double balance = sc.nextDouble();
        double annualInterestRate = sc.nextDouble();
        
        double interest = balance * (annualInterestRate / 1200);
        
        System.out.println("The interest is " + interest);
    }
}
