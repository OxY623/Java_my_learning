/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class ComputerAreaWithConsoleInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * Math.PI;
        
        System.out.println("The area  for the circle of radius "+
                radius + " is " + area);
    }
    
}
