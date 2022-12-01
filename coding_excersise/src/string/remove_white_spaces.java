package string;

public class remove_white_spaces {
    public static void main(String[] args) {
        String str="pr    abu   ";
        System.out.println(str.length());
        String str1="";
        for(char ch:str.toCharArray()){
            if(ch !=' '){
                str1+=ch;
            }
        }
        System.out.println(str1);
        System.out.println(str1.length());
//        String str="Hello world I am here";
//
//        for (char c : str.toCharArray()) {
//            if (c != ' ')
//                System.out.print(c);
//        }
    }
}
