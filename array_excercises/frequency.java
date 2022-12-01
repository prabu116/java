package array_excercises;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {12,11,34,12,67,67};
        int[] freq=new int[arr.length];

        int count;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=-1;
                }

            }
            if(freq[i]!=-1){
                freq[i]=count;
            }

        }
        System.out.println("the frequency array is look like"+Arrays.toString(freq));
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=-1){
                System.out.println("the element "+arr[i]+" is "+freq[i]+" times occurs");
            }
        }

    }
}
