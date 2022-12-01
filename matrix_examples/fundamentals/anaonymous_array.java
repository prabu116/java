package fundamentals;

import java.util.Arrays;

public class anaonymous_array {
    public static void main(String[] args) {
        print(new int[]{10,20,30,40});
        int arr[]=get();
        System.out.println(Arrays.toString(arr));

    }
    public static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static int[] get(){
        return new int[]{10,20,30};
    }
}
