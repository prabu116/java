package array_excercises;

public class print_odd_even_position {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i=1;i<a.length;i+=2){
            System.out.println("the array odd position is "+i+" and the value is "+a[i]);
        }
        for(int i=0;i<a.length;i+=2){
            System.out.println("the array even position is "+i+" and the value is "+a[i]);
        }

    }
}
