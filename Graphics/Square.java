package Graphics;
import java.util.*;
import java.io.*;

public class Square implements TestInterface
{
    int s;
    public void area()
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println ("Enter the side of Square: ");
	    s = sc.nextInt();
	    System.out.println("The area of square is "+Math.pow(s, 2)+" sq units");
	}
}
