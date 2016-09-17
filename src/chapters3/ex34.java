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
public class ex34 {
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create Scanner

		// Prompt the user to enter the three points for p0, p1, and p2
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Calculate point in on line segment
		boolean online =  
			!(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
			((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
			(x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));


		// Display result
		System.out.print("(" + x2 + ", " + y2 + ") is ");
		if (!online)
			System.out.print("not ");
		System.out.println("on the line segment from (" + x0 + ", " + y0 + 
			") to (" + x1 + ", " + y1 + ")");
	}
}
