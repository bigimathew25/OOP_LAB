import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(500);
        tset.add(300);
        tset.add(800);
        tset.add(100);
        tset.add(400);
        tset.add(700);
        tset.add(200);
        tset.add(600);
        
        System.out.println("TreeSet elements are: " + tset);

        /*
         * To get the a reverse order view of this TreeSet, use
         * the descendingSet method
         */
        Set<Integer> reverseSet = tset.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set elements are: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}
