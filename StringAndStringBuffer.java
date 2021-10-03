import java.io.*;
class StringAndStringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Computer");
        
        int l = sb.length();
        int ca = sb.capacity();
        System.out.println("Length of string Computer: " + l);
        System.out.println("Capacity of string Computer: " + ca);
        
        sb.append("\tEngineering");
        System.out.println("The string after appending: "+sb);
        
        sb.insert(8, "-");
        System.out.println("The string after inserting '-' at possition 8: "+sb);
        
        sb.reverse();
        System.out.println("The string after reversing: "+sb);
        
        sb.delete(0, 2);
        System.out.println("The string after deleting the characters from position 0 to 2: "+sb);
        
        sb.deleteCharAt(1);
        System.out.println("The string after deleting the character at position 1: "+sb);
        
        sb.replace(0,8,"Civil");
        System.out.println("The string after replacing the characters from 0th to 8th possition: "+sb);
        
        String s1="Welcome to java programming ";
        
        char ch[]={'h','e','l','l','o'};
        
        String s2=new String(ch);//converting char array to string
        String s3=new String("World");//creating Java string by new keyword
        
        System.out.println("string s2="+s2);
        System.out.println("string s3="+s3);
        System.out.println("string s1="+s1);
        
        char c=s1.charAt(6); /*returns the char value at the 2th index of string "welcome to java programming" */
        System.out.println("The character at 6th index position of string s1:  "+c);
        
        System.out.println("Length of string s1: "+s1.length());
        
        s1=s1.concat(" ... a simple language");
        System.out.println("The string after concatenation: "+s1);
        
        String s4="ELECTRICAL ENGINEERING";
        String s1lower=s4.toLowerCase();
        System.out.println("The lower case of string s4 is: "+s1lower);
        
        String s5="mechanical engineering";
        String s1upper=s5.toUpperCase();
        System.out.println("The upper case of string s5 is: "+s1upper);
        
        String s6="  world of   ";
        System.out.println("The string without trimming: ");
        System.out.println(s6+"programming");//without trim()
        
        System.out.println("The string with trimming: ");
        System.out.println(s6.trim()+"programming");//with trim()
        }
}
