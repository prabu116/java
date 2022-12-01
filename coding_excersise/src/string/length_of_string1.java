package string;

public class length_of_string1 {
    public static void main(String[] args) {
        int count=0;
        String str="prabu";
        for(char c:str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
