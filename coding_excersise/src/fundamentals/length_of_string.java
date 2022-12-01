package fundamentals;

public class length_of_string {
    public static void main(String[] args) {
//        1.using for each
//        String a="prabu";
//        int count = 0;
//        for(char c:a.toCharArray()){
//            count++;
//
//        }
//        System.out.println(count);
//        2.using try and catch
        String s="prabu";
        int count=0;
        try{

            while(true){
                count++;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(count);
        }
    }
}
