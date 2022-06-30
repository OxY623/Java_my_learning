/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class ExampleOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        double c = 2.3;
        double d = 9.2;
        int result = minFunction(a,b);
        double result2 = minFunction(c,d);
        System.out.println("Min. Value = " + result);
        
        System.out.println("Min. Value = "+ result2);
    }
    
    public static int minFunction(int a, int b){
        int c;
        if (a<b){
            c=a;
     } else c=b;
        return c;
    }
    public static double minFunction(double a, double b){
        double c;
        if (a<b){
            c=a;
     } else c=b;
        return c;
    }
    
}
