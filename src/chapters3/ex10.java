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
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = sc.nextInt();
        
        if (number1 + number2 == answer)
            System.out.println("you are correct!");
        else
            System.out.println("you are wrong " + number1 + " + " + number2 + " = " + (number1 + number2));
    }
}
