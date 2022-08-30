/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenheit : ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        
        System.out.println("Fahrenheit "+ fahrenheit +
                " is " + celsius + " in Celsius");
    }
    
}
