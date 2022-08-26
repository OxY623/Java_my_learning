/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class AverageSpeedInKilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double u = 24.0*1.6;
        double t= 1 +(40/60)+ ((35/60)/60);
        double s = u/t;
        System.out.println("The average speed of a runner equals "+ Math.round(s) 
                + " kilometers per hour");
    }
    
}
