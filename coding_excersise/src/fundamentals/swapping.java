package fundamentals;

public class swapping {
    public static void main(String[] args) {
        int a,temp,b;
        a=10;
        b=20;
//        System.out.println("before swapping a is"+a+"b is"+b);
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("after swapping swapping a is"+a+"b is"+b);
//
        System.out.println("before swapping a is"+a+"b is"+b);
//        a=a-b;
//        b=a+b;
//        a=a-b;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("after swapping swapping a is"+a+"b is"+b);
        System.out.println(1/10);


    }
}
