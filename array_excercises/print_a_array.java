package array_excercises;

public class print_a_array {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        System.out.println("array in normal order ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        System.out.println("array in reverse order ");
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}
