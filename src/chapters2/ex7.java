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
public class ex7 {
    public static void main(String[] args) {
        
        double minutesInYear = 365 * 24 * 60;
        long years; 
        int days;
        double  minutes;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        minutes = sc.nextDouble();
        
        years =(long)(minutes / minutesInYear);
        days = (int)(minutes /60 / 24) % 365;
        
        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days");
    }
}
