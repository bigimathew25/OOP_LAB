package Arithmetic;
import java.util.*;
import java.io.*;

public class Division implements TestInterface
{
    int num1,num2;
    public  void calculate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println ("Enter second number: ");
        num2 = sc.nextInt();
        int divide=num1/num2;
        System.out.println ("Division result of two numbers is "+divide +"");
    }
}
