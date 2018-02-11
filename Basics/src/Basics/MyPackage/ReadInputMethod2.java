package Basics.MyPackage;

import java.util.Scanner;
// Second method to read input from terminal :using Scanner
public class ReadInputMethod2
{
    public static void main(String[] args)
    {
        int[] myArr = new int[7];
        int counter;
        System.out.println("Enter maximum of 7 integers: ");
        Scanner inScan = new Scanner(System.in);
        for(counter =0; counter < 7;counter++)
        {
            myArr[counter]= inScan.nextInt();
            System.out.println(myArr[counter]);
        }

    }


}
