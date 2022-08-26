/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class CramerSRule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, x, y, e, d, b, f, c;
        a = 3.4; b = 50.2; e = 44.5;
        c =2.1; d = 0.55; f = 5.9;
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.println("x = " + x + " and y = "+ y);
    }
    
}
