package Basics.MyPackage;

public class PassByValue {

    public static void main(String[] args)
    {
        //Demonstration of concept : Java is pass by value
        int v1, v2;
        v1= 60;
        v2 = 5;

        int result = Func1(v1,v2);
        System.out.println(" The variable v1 contains value:" + v1);
        System.out.println(" The variable v2 contains value:" + v2);
        System.out.println(" The variable result contains value:" + result);
    }

    public static int Func1(int a, int b)
    {
        a = a*b + b;
        return a;

    }
}
