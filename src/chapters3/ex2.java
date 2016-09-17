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
public class ex2 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        
        //getting input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int answer = sc.nextInt();
        
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +(number1 + number2 + number3 == answer));
    }
}
