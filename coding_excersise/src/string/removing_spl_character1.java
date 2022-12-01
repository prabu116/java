package string;

public class removing_spl_character1 {
    public static void main(String[] args) {
        String str="pr#$%-b(;:u";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<=122){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
