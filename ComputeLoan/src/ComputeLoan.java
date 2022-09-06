/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class ComputeLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Enter annual interest rate in percentage, e.g. , 7,25%
        System.out.print("Enter annual interest rate in percentage, e.g. , 7,25%: ");
        double annualInterestRate = input.nextDouble();
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        //Enter number of years
        System.out.print("Enter number of years as integer, e.g. , 5: ");
        int numberOfYears = input.nextInt();
        
        //Enter loan amount
        System.out.print("Enter loan amount, e.g , 12000.98: ");
        double loanAmount = input.nextDouble();
        
        //Calculate playment
        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1
                - 1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
        double totalPayment = numberOfYears * monthlyPayment * 12;
        
        //Display results
        
        System.out.println("The monthly payment is $"+
                (int)(monthlyPayment * 100/100.0));
        
        System.out.println("The total payment is $"+
                (int)(totalPayment * 100/100.0));
        
        
        
        
        
        
        
    }
    
}
