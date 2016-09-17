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
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int number;
        
        System.out.print("Enter a number between 0 and 1000: ");
        number = sc.nextInt();
        int firstDigit = number % 10;
        int remainingNumber = number / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
