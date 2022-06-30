/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Arrays;
public class ArraysTest {
  public static void main(String[] args) {
    int[] aryNums;
    aryNums = new int [5];
    aryNums[0] = 20;
    aryNums[1] = 34;
    aryNums[2] = 16;
    aryNums[3] = 28;
    aryNums[4] = 83;
    Arrays.sort(aryNums);
    int i;
    for (i=0; i < aryNums.length; i++) {
    System.out.println("num:" + aryNums[i]);
}
}
}