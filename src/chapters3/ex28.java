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
public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        //count x1(max/min) = x1 max +/- width / 2 and x2(max/ min)
        //then compare x1max x2max x1 min x2 min y1 max and so on
        //so easy to answer inside or outside and overlap
        System.out.print("Enter r1 center x - , y - coordinates, width and height: ");
        double r1x = sc.nextDouble();
        double r1y = sc.nextDouble();
        double r1Width = sc.nextDouble();
        double r1Height = sc.nextDouble();
        System.out.print("Enter r2 center x- , y- coordinates, width  and height: ");
        double r2x = sc.nextDouble();
        double r2y = sc.nextDouble();
        double r2Width = sc.nextDouble();
        double r2Height = sc.nextDouble();
        
        if((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) && 
            (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
             (r1Height / 2 + r2Height / 2 <= r1Height) &&
             (r1Width / 2 + r2Width / 2 <= r1Width))
            System.out.println("r2 is inside r1");
        else if((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height > r2y - r2Height))
            System.out.println("r2 overlaps r1");
        else 
            System.out.println("r2 does not overlap r1");
        
    }
}
