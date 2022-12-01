package array_excercises;

public class merge {
    public static void main(String[] args) {
        C obj = new C();
        obj.eat();
        obj.play();

    }



}
abstract class A{
    public void eat(){
        System.out.println("eating");
    }
    public abstract void play();
    public abstract void swim();
}
abstract class B extends A{
    public void play(){
        System.out.println("playing  ");

    }
}
class C extends B{
    public void swim(){
        System.out.println("swim");
    }
}