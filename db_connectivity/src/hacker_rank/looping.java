package hacker_rank;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                    //Complete the code
                else if(x>=Short.MIN_VALUE && x<=Short.MIN_VALUE){
                    System.out.println("* short\n* int\n* long");
                }
                else if(x>=Integer.MIN_VALUE && x<=Integer.MIN_VALUE){
                    System.out.println("* int\n* long");
                }
                else if(x>=Long.MIN_VALUE && x<=Integer.MIN_VALUE){
                    System.out.println("* long");
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
