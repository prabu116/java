package file_handling;

public class geeks {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        int total_sum=0;
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            total_sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(total_sum-sum);
    }
}
