/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class PopulationProjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double secondsBirth = 7.0;
        double secondsDearh = 13.0;
        double secondNewImmigrant = 45.0;
        
        double allPopulation = 312_032_486;
        
        double numBornForYear = CountsNumOfPeople(secondsBirth);
        double numDeadForYear = CountsNumOfPeople(secondsDearh);
        double numNewImmigrantForYear = CountsNumOfPeople(secondNewImmigrant);
        
        int i = 1;
         
        while (i <= 5){
           allPopulation += numBornForYear - numDeadForYear + numNewImmigrantForYear; 
           System.out.println("The population will be "+ 
                   Math.round(allPopulation) + " for "+ i +" years");
           i++;
        }
   
    }
     public static double CountsNumOfPeople( double x){
        //вычислем сколько за год
        double count = 60 * 60 * 24 * 365/x;
        return count;
    }     
    
    
    
}
