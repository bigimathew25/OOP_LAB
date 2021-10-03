package Arithmetic;
import java.util.*;
import java.io.*;


public class Subtraction implements TestInterface
{
    int num1,num2;
    public  void calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println ("Enter second number: ");
        num2 = sc.nextInt();
        int difference=num1-num2;
        System.out.println ("Difference of two numbers is "+difference +"");
    }
}
