package Arithmetic;
import java.util.*;
import java.io.*;
interface TestInterface
{
    abstract  void calculate();
}

public class Addition implements TestInterface
{
    int num1,num2;
    public  void calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println ("Enter second number: ");
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println ("Sum of two numbers is "+sum +"");
    }
}
