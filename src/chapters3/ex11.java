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
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the month as integer: ");
        int month = sc.nextInt();
        System.out.print("Enter the year as integer: ");
        int year = sc.nextInt();
        
        boolean leapyear = 
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1:System.out.println(
                    "January " + year + " had 31 days");break;
            case 2:System.out.println("February " + year + " had" +
                    ((leapyear) ? " 29 days" : " 28 days"));break;
            case 3:System.out.println(
                    "March " + year + " had 31 days");break;
            case 4:System.out.println(
                    "April " + year + " had 30 days");break;
            case 5:System.out.println(
                    "May " + year + " had 31 days");break;
            case 6:System.out.println(
                    "June " + year + " had 30 days");break;
            case 7:System.out.println(
                    "July " + year + " had 31 days");break;
            case 8:System.out.println(
                    "August " + year + " had 31 days");break;
            case 9:System.out.println(
                    "September " + year + " had 30 days");break;
            case 10:System.out.println(
                    "October " + year + " had 31 days");break;
            case 11:System.out.println(
                    "November " + year + " had 30 days");break;
            case 12:System.out.println(
                    "December " + year + " had 31 days");
        }
    }
}
