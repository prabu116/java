package array_excercises;

public class duplicate2 {
    public static void main(String[] args) {
        int[] arr={21,11,34,11,23,67,23};
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){ //logic applied here to check the all elements one by one if the duplicate one is existed then print the array value
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }

        }
    }
}
