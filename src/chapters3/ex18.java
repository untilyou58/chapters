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
public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the weight of the package: ");
        double weight = sc.nextDouble();
        
        if(weight > 50)
            System.out.println("The package cannot be shipped.");
        else
        {
            double costPerPound;
            if(weight > 0 && weight <= 1)
                costPerPound = 3.5;
            else if(weight <= 3)
                costPerPound = 5.5;
            else if(weight <= 10)
                costPerPound = 8.5;
            else
                costPerPound = 10.5;
            System.out.println("Shipping cost of package is $" + costPerPound * weight);
        }
    }
}
