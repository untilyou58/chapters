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
public class ex11 {
    public static void main(String[] args) {
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds =13.0;
        double newImmigrantInSeconds = 45.0;
        
        double currentPopulation = 312032487.0;
        
        double secondsInYears = 60.0 * 60.0 * 24.0 * 365.0;
        
        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();
       
        currentPopulation += (numBirths +numImmigrants - numDeaths) * numberOfYears;
        
        
        System.out.println("The population in " + numberOfYears + " is " + (long)currentPopulation);
    }
}
