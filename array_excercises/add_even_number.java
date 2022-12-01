package array_excercises;

public class add_even_number {
    public static void main(String[] args) {
        int[] arr={21,11,34,23,67};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even number ");
            }
            else
                System.out.println(arr[i]+" is odd number ");
        }
    }
}
