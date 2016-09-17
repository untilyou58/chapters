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
public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int computer = (int)(Math.random() * 3);
        
        System.out.print("Scissor (0), rock(1), paper (2): ");
        int user = sc.nextInt();
        
        System.out.print("The computer is ");
        switch (computer)
        {
            case 0: System.out.print("scissor.");break;
            case 1: System.out.print("rock.");break;
            case 2: System.out.print("paper.");
        }
        System.out.print(" You are ");
        switch(user)
        {
            case 0: System.out.print("scissor");break;
            case 1: System.out.print("rock ");break;
            case 2: System.out.print("paper ");break;
        }
        
        if(computer == user)
            System.out.println("too. It is a draw");
        else
        {
               boolean win = (user == 0 && computer == 2) ||
                       (user == 1 && computer == 0) ||
                       (user == 2 && computer == 1);
               if(win)
                   System.out.println(". You won");
               else
                   System.out.println(". You lose");
        }
    }
}
