package array_excercises;

import java.util.Arrays;

public class delete_a_element {
    public static void main(String[] args) {
        int size=6;
        int[] arr={2,4,3,5,7,8};
        int position=2;
        int[] newArr = new int[size-1];
        for(int i=0;i<size-1;i++){
            if(i<position-1){
                newArr[i]=arr[i];
            }
            else
                newArr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
