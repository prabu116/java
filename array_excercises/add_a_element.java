package array_excercises;

//import java.util.Arrays;
import java.util.*;


public class add_a_element {
    public static void main(String[] args) {
        int size=6;
        int[] arr={1,2,3,4,5,6};
        int x=50;
        int position=2;
        int[] newArr=new int[size+1];
        for(int i=0;i<=size;i++){
            if(i<position-1){
                newArr[i]=arr[i];

            }
            else if(i==position-1){
                newArr[i]=x;
            }
            else{
                newArr[i]=arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
