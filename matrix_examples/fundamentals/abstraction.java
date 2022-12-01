package fundamentals;
abstract class Test{
   abstract void calculate(int a,int b);
}
class Addition extends Test{
    void calculate(int a,int b){
        System.out.println(a+b);

    }
}
class Subtraction extends Test{
    void calculate(int a,int b){
        System.out.println(a-b);
    }
}
public class abstraction {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction b=new Subtraction();
        a.calculate(10,12);
        b.calculate(20,10);
    }
}
