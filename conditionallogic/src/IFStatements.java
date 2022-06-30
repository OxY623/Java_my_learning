/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class IFStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean user2 = true;
        if (user2==true){
        System.out.println("It is true");}
        else System.out.println("It is false");
        
        
        int user = 15;
        if (user <= 21){
            if (user > 18 && user <21){
            System.out.println("You are 19,20 or 21");
                    }else
          System.out.println("User is 18 or younger");
        } else if(user > 21 && user < 50){
          System.out.println("User is between 19 and 49");
        } else System.out.println("User is older that 50");
        
    }
    
}
