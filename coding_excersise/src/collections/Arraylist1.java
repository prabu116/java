package collections;
import java.util.*;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Character> cars = new ArrayList<Character>(); // Create an ArrayList object
        cars.add('a');
        cars.add('b');
        cars.add('c');
        cars.add('d');
        cars.add('e');
        cars.clear();
//        cars.add("f");
//        cars.add("g");
//        cars.add("h");
        System.out.println(cars);

        for(int i=cars.size()-1;i>=0;i--){
            System.out.print(cars.get(i));
        }




    }
}
