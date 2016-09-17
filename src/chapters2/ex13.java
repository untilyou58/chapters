/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters2;

import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double Monthly_Interest_Rate = 0.00417;
        
        //prompt the user to enter a monthly saving amount
        System.out.print("Enter the monthly saving amuont: ");
        double savingAmount = sc.nextDouble();
        
        //compute first month account value
        double total = 100 * (1 + Monthly_Interest_Rate);
        //compute second month account value
        total = (100 + total) * (1 + Monthly_Interest_Rate);
        //so on third
        total = (100 + total) * (1 + Monthly_Interest_Rate);
        //fourth
        total = (100 + total) * (1 + Monthly_Interest_Rate);
        //fifth
        total = (100 + total) * (1 + Monthly_Interest_Rate);
        //sixth
        total = (100 + total) * (1 + Monthly_Interest_Rate);
        
        //display result
        System.out.println("After the sixth month , the account value is " + total);
    }
}
