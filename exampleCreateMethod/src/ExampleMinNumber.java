/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class ExampleMinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=11;
        int b=3;
        int c = minFunction(a,b);
        System.out.println("Min. Value = "+c);
    }
    public static int minFunction(int n, int n1){
      int min;
      if (n<n1){
      min = n;} 
      else min = n1;
      return min;
    }
    
}
