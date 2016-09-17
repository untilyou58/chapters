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
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int today = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = sc.nextInt();
        
        int futureDay = (today + daysElapsed) % 7;
        
        System.out.print("Today is ");
        switch(today)
        {
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");
        }
        System.out.print(" and the future day is ");
        switch(futureDay)
        {
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");
        }
    }
}
