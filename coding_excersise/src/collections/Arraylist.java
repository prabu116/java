package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class student{
    int rollno,marks;
    String name;
    student(int rollno, String name){
        this.rollno=rollno;
        this.name = name;
       // this.marks=marks;

    }
    public int getroll(){
        return rollno;
    }
    public String getName(){
        return name;
    }
}
public class Arraylist<S> {
    public static void main(String[] args) {

        ArrayList <student> stu = new ArrayList<>();
        stu.add(new student(103,"prabu"));
        stu.add(new student(102,"lavan"));
        stu.add(new student(110,"indhu"));
        stu.add(new student(109,"mani"));

//        for(student t1:stu){
//            System.out.println(t1.name+" "+t1.rollno);
//        }

//        Collections.sort(stu, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//
//                return o1.getroll()-o2.getroll();
//            }
//
//        });
        Collections.sort(stu,(o1,o2)->o1.getName().compareTo(o2.getName()));
        for(student s:stu){
            System.out.println(s.name+""+s.getroll());
        }




    }
}

