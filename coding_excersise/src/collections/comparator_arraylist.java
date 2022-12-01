package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student_details{
    private int rollno,marks;
    private String name;
    Student_details(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public String getname(){
        return this.name;
    }
    public int getMarks(){
        return this.marks;
    }
    public int getRollno(){
        return this.rollno;
    }
}

public class comparator_arraylist {
    public static void main(String[] args) {
        ArrayList<Student_details> list = new ArrayList<>();
        list.add(new Student_details("prabu",101,99));
        list.add(new Student_details("mugesh",102,94));
        list.add(new Student_details("prasanna",103,95));
        list.add(new Student_details("jeya",104,100));
        Collections.sort(list,(o1,o2)->(o2.getMarks()-o1.getMarks()));//t this one shows how to short a integer for ascending as well as decending


        Collections.sort(list,(o1,o2)->o1.getname().compareTo(o2.getname())); //this is shows how to compare to string(string in ascending order)
       // System.out.println(list);
        list.forEach((ele)-> System.out.println(ele.getname()+" "+ele.getMarks()+" "+ele.getRollno()));


    }
}
