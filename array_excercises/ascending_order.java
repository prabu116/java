package array_excercises;

public class ascending_order {
    public static void main(String[] args) {
        int[] arr={21,11,34,23,67};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("the ascending order is ");
        for(int a:arr){
            System.out.println(a);
        }
    }
}
