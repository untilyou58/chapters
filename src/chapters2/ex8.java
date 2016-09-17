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
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the time offset to GMT: ");
        long timeZoneChange = sc.nextInt();
        
        //obtain the total miliseconds since the midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        //Obtain the total second since the midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        //compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        //compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        
        //obtain the total hours
        long totalHours = totalMinutes / 60;
        
        //compute the current hour
        long currentHour = ((totalHours + timeZoneChange) % 24);
        
        //Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
