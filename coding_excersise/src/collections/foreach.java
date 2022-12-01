package collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        for(int i=0;i<=10;i++){
            s.add("prabu");
        }
        System.out.println(s);
        s.forEach((a)->{
            System.out.println(a);
        });
        List<String> s2 = new ArrayList<>(s);
        System.out.println("this is next list"+s2);
    }
}
