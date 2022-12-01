package string;

public class length_of_string {
    public static void main(String[] args) {
        String str="prabu";
        System.out.println(getLength(str));

    }
    public static int getLength(String str){
        int i=0;
        try {
            while (true) {
                str.charAt(i);
                i++;

            }
        }
        catch (Exception e){
            return i;
        }



    }
}
