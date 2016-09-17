/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapters2;

import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author untilyou58
 */
public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Enter the size: ");
        double size = sc.nextDouble();
        
        double area = ((3 * Math.pow(3, 0.5)) * Math.pow(size, 2)) / 2 ;
        System.out.println("The area of hexagon is " + area);
    }
}
