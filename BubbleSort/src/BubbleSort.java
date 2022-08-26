/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 37533
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

// Validate command line arguments count.
if (args.length != 1)
{
System.err.println("usage: java BubbleSort integers");
return;
}
// Read integers from first command-line argument. Return if integers
// could not be read.
int[] ints = readIntegers(args[0]);
if (ints == null)
return;
// Output the integer array's length and number of inversions statistics to
// standard output device.
System.out.println("N = " + ints.length);
int inversions = 0;
for (int i = 0; i < ints.length - 1; i++)
for (int j = i + 1; j < ints.length; j++)
if (ints[i] > ints[j])
inversions++;
System.out.println("I = " + inversions);
// Output the unsorted integer values to standard output, sort the array,
// and output the sorted values to standard output.
dump(ints);
sort(ints);
dump(ints);
}
static void dump(int[] a)
{
for (int i = 0; i < a.length; i++)
System.out.print(a[i] + " ");
System.out.print('\n');
}
static int[] readIntegers(String s)
{
String[] tokens = s.split(",");
int[] integers = new int[tokens.length];
for (int i = 0; i < tokens.length; i++)
integers[i] = Integer.parseInt(tokens[i]);
return integers;
}
static void sort(int[] x)
{
for (int pass = 0; pass < x.length - 1; pass++)
for (int i = x.length - 1; i > pass; i--)
if (x[i] < x[pass])
{
int temp = x[i];
x[i] = x[pass];
x[pass] = temp;
}
}
    }
    

