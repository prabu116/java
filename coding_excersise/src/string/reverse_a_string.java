package string;

public class reverse_a_string {
    public static void main(String[] args) {
        String str="prabu";
        String rev="";
        char[] ch = str.toCharArray();
        //char[] c1 = new char[ch.length];
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for(int i=ch.length-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);

    }
}
