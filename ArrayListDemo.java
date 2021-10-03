import java.util.*;
import java.io.*;
class ArrayListDemo
{
    public static void main(String args[]){
        //create an ArrayList
        ArrayList<String> fruit_List=new ArrayList<String>();
        //add elements to the ArrayList using add method
        fruit_List.add("Mango");
        fruit_List.add("Apple");
        fruit_List.add("Orange");
        fruit_List.add("Grapes");
        //print the list
        System.out.println("Initial Array List: " + fruit_List);
        //add an element at index 1 using add method overload
        fruit_List.add(1, "Pineapple");
        //print the list
        System.out.println("\nArray List after adding the element 'Pineapple' at index 1:" + fruit_List);
        //define a second list
        ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("Cherry", "Watermelon","Lemon","pomegranate"));
        //use addAll method to add the list to ArrayList at index 4
        fruit_List.addAll(4,fruit);
        //print the list
        System.out.println("\nArray List after adding all list at index 4:" + fruit_List);
        fruit_List.remove(2);
        
        System.out.println("\nArray List after removing element at index 2:" + fruit_List);
        //remove the element "Kolkata"
        fruit_List.remove("Grapes");
        System.out.println("\nArray List after removing element 'Grapes':" + fruit_List);
        fruit_List.removeAll(fruit);
        
        System.out.println("\nArray List after call to removeAll from array 'fruit':" + fruit_List);
        //print the size of ArrayList
        System.out.println("Array List Size: "+fruit_List.size());
        fruit_List.add("Grapes");
        fruit_List.add("Mango");
        fruit_List.add("Pomegranate");
        fruit_List.add("Mango");
        System.out.println("\nArray List after adding some elements:" + fruit_List);
        
        fruit_List.trimToSize();
        //print the size of ArrayList
        System.out.println("Array List Size after trimToSize() operation: "+fruit_List.size());
        //call indexOf() and lastIndexOf() methods to check the indices of specified elements
        System.out.println("indexOf(Mango) : " + fruit_List.indexOf("Mango"));
        System.out.println("lastIndexOf(Mango) : " + fruit_List.lastIndexOf("Mango"));
        fruit_List.clear();
        System.out.println("Array List after clearing all elements: "+fruit_List);
    }
}
