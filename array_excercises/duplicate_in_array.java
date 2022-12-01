package array_excercises;

public class duplicate_in_array {
    public static void main(String[] args) {
        char[] arr=new char[]{'a','c','d','a','e'};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}
