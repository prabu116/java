package file_handling;

import java.util.Arrays;

public class range_missing {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println(i);
            }
        }
    }
}
