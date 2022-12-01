package array_excercises;

import java.util.ArrayList;
import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr={21,11,34,11,23,67,23};
        //size is fixed in array so we use the arraylist for the storage of duplicate element
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        set.forEach((ele)-> System.out.println(ele));
        System.out.println(set);

    }
}
