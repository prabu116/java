package array_excercises;

public class largest_number_in_the_array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        System.out.println("the maximum value is "+max);
    }
}
