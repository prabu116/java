package fundamentals;

public class reverse_a_number {
    public static void main(String[] args) {
        int num=12345;
//        1.using algorithm
//        int rev=0;
//        while(num!=0){
//            rev = rev*10 + num%10;
//            num=num/10;
//
//
//        }
//        System.out.println(rev);
        //2.using StringBuffer

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println(Integer.valueOf(String.valueOf(rev)));

        //3.using StringBuilder
        StringBuilder sb= new StringBuilder(String.valueOf(num));
        sb.reverse();
        System.out.println(sb);
    }
}
