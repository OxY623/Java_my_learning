/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */import java.util.Scanner;
/**
 *
 * @author 37533
 */
public class DisplayTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for second: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;
        int  remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " +
                minutes + " minutes and " + remainingSeconds +
                " seconds.");
    }
    
}
