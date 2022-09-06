/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
 
        double tax = purchaseAmount * 0.06;
        double valTax = (tax * 100) / 100.0;
        System.out.println("Sales tax is $"+ Math.ceil(valTax));
        
    }
    
}
