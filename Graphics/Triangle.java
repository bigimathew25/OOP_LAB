package Graphics;
import java.util.*;
import java.io.*;

public class Triangle implements TestInterface
{
    int b,h;
    public	void area()
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println ("Enter the breadth of triangle: ");
	    b = sc.nextInt();
	    System.out.println ("Enter the height of triangle: ");
	    h = sc.nextInt();
	    System.out.println("The area of triangle is "+(b+h)/2+" sq units");
	}
}
