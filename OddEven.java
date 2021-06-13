import java.io.*;
class OddEven
{
    public static void main(String args[ ])throws IOException
    {
        int num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        num = Integer.parseInt(reader.readLine());
        if(num%2==0)
            System.out.println("The number is even ");
        else
            System.out.println("The number is odd ");
    }
}