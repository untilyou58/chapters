/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex2 {
    private static final double AVERAGE_EARTH_RADIUS = 6371.01;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter point 2 (latitude and longtitude) in degrees: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double radius = AVERAGE_EARTH_RADIUS;
        
        double distance = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two point is " + distance + " km");
    }
}
