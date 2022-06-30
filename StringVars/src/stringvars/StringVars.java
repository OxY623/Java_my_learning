/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringvars;

/**
 *
 * @author 37533
 */
import java.util.Scanner;

public class StringVars {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input = new Scanner(System.in);
        String first_name;
        System.out.print("Type your first name: ");
        first_name = user_input.next();
        String family_name;
        System.out.print("Type yout family name: ");
        family_name = user_input.next();
        String full_name = first_name +" "+ family_name;
        System.out.println("Your name is " + full_name);
    }
    
}
