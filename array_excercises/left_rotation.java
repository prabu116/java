package array_excercises;

import java.util.Arrays;
import java.util.Scanner;

public class left_rotation {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        Scanner sn = new Scanner(System.in);
        System.out.println("how many position you want to rotate");
        int pos=sn.nextInt();
        int size=arr.length;
        int[] temp = new int[size];
        int k=0;
        for(int i=pos;i<size;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<pos;i++){
            temp[k]=arr[i];
            k++;

        }
        //copying elements from temp array to arr
        for(int i=0;i<size;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
