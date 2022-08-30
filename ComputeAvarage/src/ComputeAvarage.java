/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class ComputeAvarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double  average = (number + number2 + number3)/3;
        
        System.out.println("The avarage of "+
                number + number2 + number3+
                " is " + average);
                
    }
    
}
