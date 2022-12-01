package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(1);
//        System.out.println(n1);
//        Collections.reverse(n1);
//        System.out.println(n1);
//        Collections.sort(n1);
//        System.out.println(n1);
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<10;i++){
            ll.add(i);
        }
        System.out.println(ll);
        Iterator i = ll.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
