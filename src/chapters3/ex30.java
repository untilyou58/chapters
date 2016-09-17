/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = sc.nextInt();
        
        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        
        System.out.println("Current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) + ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
    }
}
