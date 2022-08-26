/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class PrintTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("a a^2 a^3");
        int i = 1;
        int a = 1;
        int square = 2;
        int cube = 3;
        

        while (i<5){
          if (a >= 4){
             System.out.println(a + "  " + 
                  Math.round(Math.pow(a,square)) + "  " + 
                  Math.round(Math.pow(a, cube)));
             return;
          }  
          System.out.println(a + "  " + 
                  Math.round(Math.pow(a,square)) + "   " + 
                  Math.round(Math.pow(a, cube)));
          
          i++;
          a++;
        }
    }
    
}
