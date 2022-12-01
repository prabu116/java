package string;

public class removing_spl_character {
    public static void main(String[] args) {
        String str="pr$^&ab@!u";
        String rep=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(rep);
    }
}
