/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demolearninglessons;

/**
 *
 * @author 37533
 */
public class DemoLearningLessons {
public static void main(String args[]) {
     int a = 60;	/* 60 = 0011 1100 */  
     int b = 13;	/* 13 = 0000 1101 */
     int c = 0;

     c = a & b;       /* 12 = 0000 1100 */ 
     System.out.println("a & b = " + c );

     c = a | b;       /* 61 = 0011 1101 */
     System.out.println("a | b = " + c );

     c = a ^ b;       /* 49 = 0011 0001 */
     System.out.println("a ^ b = " + c );

     c = ~a;          /*-61 = 1100 0011 */
     System.out.println("~a = " + c );

     c = a << 2;     /* 240 = 1111 0000 */
     System.out.println("a << 2 = " + c );

     c = a >> 2;     /* 215 = 1111 */
     System.out.println("a >> 2  = " + c );

     c = a >>> 2;     /* 215 = 0000 1111 */
     System.out.println("a >>> 2 = " + c );
  }
}
