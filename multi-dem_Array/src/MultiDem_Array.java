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
        int[][] aryNumbers = new int[6][5];
aryNumbers[0][0] = 10;
aryNumbers[1][0] = 30;
aryNumbers[0][1] = 12;
aryNumbers[1][1] = 55;
aryNumbers[0][2] = 43;
aryNumbers[1][2] = 76;
aryNumbers[0][3] = 11;
aryNumbers[1][3] = 2;
aryNumbers[2][0] = 30;
aryNumbers[3][0] = 40;
aryNumbers[2][1] = 67;
aryNumbers[3][1] = 12;
aryNumbers[2][2] = 32;
aryNumbers[3][2] = 87;
aryNumbers[2][3] = 14;
aryNumbers[3][3] = 14;
aryNumbers[4][0] = 50;
aryNumbers[5][0] = 60;
aryNumbers[4][1] = 86;
aryNumbers[5][1] = 53;
aryNumbers[4][2] = 66;
aryNumbers[5][2] = 44;
aryNumbers[4][3] = 13;
aryNumbers[5][3] = 12;
int rows = 5;
int columns = 4;
int i, j;
for (i = 0; i < rows; i++) {
for ( j = 0; j < columns; j++) {
System.out.print(aryNumbers[i][j] + " ");
}
System.out.println("");
}
    }
        
        
        
    }
    

