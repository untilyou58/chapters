package chapters2;

import java.util.Scanner;

/**
 *
 * @author untilyou58
 */
public class ex1 {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
        System.out.print("Enter a degree in celsius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celcius + 32.0;
        System.out.println(celcius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
