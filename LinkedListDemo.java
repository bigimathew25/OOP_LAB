import java.util.*;
import java.io.*;
public class LinkedListDemo
{
    public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> color_list = new LinkedList<String>();
    // use add() method to add values in the linked list
    color_list.add("Purple");
    color_list.add("Red");
    color_list.add("Green");
    color_list.add("Lavender");
    color_list.add("Blue");
    
    // print the list
    System.out.println("The original linked list: " + color_list);
    
    // Removing all the elements from the linked list
    color_list.clear();

    System.out.println("The new linked list: " + color_list);
    }
}
