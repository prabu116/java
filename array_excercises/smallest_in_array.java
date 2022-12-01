package array_excercises;

public class smallest_in_array {
    public static void main(String[] args) {
        int[] arr={21,11,34,23,67};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("the minimum number is "+min);
    }
}
