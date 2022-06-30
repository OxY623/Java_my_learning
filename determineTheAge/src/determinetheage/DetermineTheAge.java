/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinetheage;

/**
 *
 * @author 37533
 */
public class DetermineTheAge {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int user=20;
        switch(user){
            case 21 -> System.out.println("You are 21");
            case 19 -> System.out.println("You are 19");
            case 20 -> System.out.println("You are 20");
            default -> System.out.println("You are not 20,19 or 21.");
        }
    }
    
}
