/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length !=2){
          System.err.println("usage: Java BinarySearch integets integer");
          return;
        }
        
        int[] ints=readIntegers(args[0]);
        if (ints==null)
            return;
        
        int srchint=Integer.parseInt(args[1]);
        System.out.println( srchint+(search(ints,srchint)?" found":" not found"));
        
        
        
        
    }
    private static int[] readIntegers(String s){
      String[] tokens = s.split(",");
      int[] integers = new int[tokens.length];
      for(int i=0;i<tokens.length;i++)
          integers[i]=Integer.parseInt(tokens[i]);
            return integers;
    }
    
    private static boolean search(int[] x,int srchint){
       int hiIndex=x.length-1,loIndex=0,midIndex;
       while(loIndex<=hiIndex){
         midIndex=(loIndex+hiIndex)/2;
         if(srchint>x[midIndex])
         {
           loIndex=midIndex+1;
         } else if(srchint<x[midIndex]){
           hiIndex=midIndex-1;
         } else
             return true;
       }
       return false;
    }
}
