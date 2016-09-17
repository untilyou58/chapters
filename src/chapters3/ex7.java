/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        //Receive the amount
        System.out.print("Enter an amount in double, for ex 11.56: ");
        double amount = sc.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        //Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;
        
        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        
        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        
        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        
        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        //Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + 
                (numberOfDollars == 1 ? " dolar" : " dolars"));
        System.out.println(" " + numberOfQuarters + 
                (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes + 
                (numberOfDimes == 1 ? " dime" : " dimes"));
        System.out.println(" " + numberOfNickels + 
                (numberOfNickels == 1 ? " nickel" : " nickels"));
        System.out.println(" " + numberOfPennies + 
                (numberOfPennies == 1 ? " pennie" : " pennies"));
    }
}
