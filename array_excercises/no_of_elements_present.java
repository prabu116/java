package array_excercises;

public class no_of_elements_present {
    public static void main(String[] args) {
        int[] arr={21,11,34,23,67};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("no of elements present in the array is "+count);
    }
}
