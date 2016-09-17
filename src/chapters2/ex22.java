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
public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter an amount i double, for ex 11.56: ");
        double amount = sc.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        int numberOfPennies = remainingAmount;
        
        System.out.println("Your amount " + amount + " consists of \n" + numberOfOneDollars + " Dollars " + numberOfQuarters + " Quarters " + numberOfDimes + " Dimes " + numberOfNickels + " Nickels " + numberOfPennies + " Pennies");
    }
}
