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
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter investment amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter annual interest rate in percentage : ");
        double monthlyInterestRate = sc.nextDouble();
        monthlyInterestRate /= 1200;
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
        
        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
