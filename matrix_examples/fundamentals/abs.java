package fundamentals;
class member{
    void welcome(){
        System.out.println("hello members ");
    }
}
class teacher extends member{
    void welcome(){
        System.out.println("hello teacher  ");
    }
}
class student extends member{
    void welcome(){
        System.out.println("hello student  ");
    }
}

public class abs {
    public static void main(String[] args) {
        teacher t = new teacher();
        student s = new student();
        member[] m = new member[4];
        m[0]=new teacher();
        m[1]=new teacher();
        m[2]=new student();
        m[3]=new student();

        for(member m1 : m){
            m1.welcome();

        }


    }
}
