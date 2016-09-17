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
public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int option = sc.nextInt();
        
        double amount;
        switch(option)
        {
            case 0: System.out.print("Enter the dollar amuont: ");
                        amount = sc.nextDouble();
                        System.out.println("$" + amount + " is " + (amount * rate) + " yuan");break;
            case 1: System.out.print("Enter the RMB amount: ");
                        amount = sc.nextDouble();
                        System.out.println(amount + " yuan is $" + ((int)((amount * 100) / rate) / 100.0));break;
            default: System.out.println("Incorrect input");
        }
    }
}
