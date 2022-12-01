package file_handling;

public class str_freq {
    public static void main(String[] args) {
        String str = "prabuprabu";
        char[] ch = str.toCharArray();
        int pos=0;
        for(int i=0;i<ch.length;i++){
            int count=0;

            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;

                }
            }
            if(count==0){
                pos++;
            }
            if(pos==2){
                System.out.println("the second non repeating character is "+ch[i]);
            }
        }
    }
}
