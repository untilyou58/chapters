/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters3;

import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = sc.nextInt();
        
        int d1 = isbn / 100000000;
        int remainingDigits = isbn % 100000000;
        int d2 = remainingDigits / 10000000;
        remainingDigits = remainingDigits % 10000000;
        int d3 = remainingDigits / 1000000;
        remainingDigits = remainingDigits % 1000000;
        int d4 = remainingDigits / 100000;
        remainingDigits = remainingDigits % 100000;
        int d5 = remainingDigits / 10000;
        remainingDigits = remainingDigits % 10000;
        int d6 = remainingDigits / 1000;
        remainingDigits = remainingDigits % 1000;
        int d7 = remainingDigits / 100;
        remainingDigits = remainingDigits % 100;
        int d8 = remainingDigits / 10;
        remainingDigits = remainingDigits % 10;
        int d9 = remainingDigits;
        
        //compute d10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 
                + d9 * 9 ) % 11;
        
        //Display the 10-digit ISBN
        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4
                + d5 + d6 + d7 + d8 + d9 + (d10 == 10 ? "X" : d10));
    }
}
