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
public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter three points for p0, p1 and p2: ");
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double position = (x1 - x0) * (y2- y0) - (x2 - x0) * (y1 - y0);
        
        System.out.print("(" + x2 + ", " + y2 + ") is on the ");
        if(position > 0)
            System.out.print("left side of the ");
        if(position < 0)
            System.out.print("right side of the ");
        System.out.println("line from (" + x0 + ", " + y0 +") to "
                + "(" + x1 + ", " + y1 + ")");
    }
}
