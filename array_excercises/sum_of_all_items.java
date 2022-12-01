package array_excercises;

public class sum_of_all_items {
    public static void main(String[] args) {
        int[] arr={21,11,34,23,67};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        System.out.println("sum of all the element in this array is "+count);

    }
}
