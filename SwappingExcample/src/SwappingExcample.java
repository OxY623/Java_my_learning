/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class SwappingExcample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 30;
        int b = 45;
        System.out.println("Before, a = "+a+" and b = "+ b);
        swapFunction(a,b);
        System.out.println("\n**Now, before and after swapping values will be same here**:");
        System.out.println("After swapping, a = "+a+" and b = "+b);
        
    }
    public static void swapFunction(int a,int b){
        System.out.println("Before swaping (Inside), a = "+a+" and b = "+ b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping (Inside), a = "+a+" and b = "+b);
        
    }
}
