package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<Integer>();
        ll.add(19);
        ll.add(21);
        ll.add(25);
        ll.add(1);
        Object[] i = ll.toArray();

        System.out.println(Arrays.toString(i));
//        Iterator i = ll.descendingIterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        Collections.sort(ll);
//        System.out.println(ll);
//
//        //converting array to list
//        int[] a = {1,2,3,4,5};
//        LinkedList<Integer> n1=new LinkedList<Integer>();
//        for(int n2:a){
//            n1.add(n2);
//        }
//        System.out.println("sucessfully converted array to list");
//        System.out.println(n1);
    }
}
