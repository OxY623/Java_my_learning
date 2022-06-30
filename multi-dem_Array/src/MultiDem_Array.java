/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class MultiDem_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] aryNums = new int[6][5];
        int i =0; 
        int j=0;
        for (;i < aryNums.length;i++){
         aryNums[i]=i-1;
          for(;j<aryNums[i].length;j++){
           aryNums[i][j]=j+1;
            
          }
        }
        System.out.println(aryNums[3][2]);
        
        
        
    }
    
}
