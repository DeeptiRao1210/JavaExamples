package Basics.MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysExample {

    public static void main(String[] args)
    {
       // Creating an array object variable
        int[] myArray = new int[6];
        int i;


        //First method to read from command line using Buffered Reader in java.io
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                 System.out.println("Enter maximum of 6 integers separated by a space:");
                 String inputStr = rdr.readLine();

                //Splitting the string into multiple strings on separator:" "
                 String[] inputNumbers = inputStr.split(" ");

                 //Since myArray has maximum capacity of holding 6 integers
                if (inputNumbers.length <= 6)
                for(i=0;i<inputNumbers.length;++i)
                {
                   //parseInt converts an integer read as a string from the terminal back to an integer
                    myArray[i] = Integer.parseInt(inputNumbers[i]);
                    System.out.println(myArray[i]);
                }
                else
                    System.out.println("The array bounds are exceeded.");

            }
            catch(IOException err)
            {
                System.out.println(err.getMessage());
            }


            Func1(myArray);


    }
    public static void Func1(int[] b)
    {
        int i;
        for(i=0; i< b.length;++i)
        {
            b[i] = b[i]*5;
            System.out.println(b[i]);
        }


    }

}
