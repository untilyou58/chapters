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
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int coin = (int)(Math.random() * 2);
        
        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = sc.nextInt();
        
        System.out.println(((guess == coin) ? "correct" : "Incorrect") + " guess.");
    }
}
