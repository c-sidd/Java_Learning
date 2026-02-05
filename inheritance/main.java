class inheritance {
    String name;
    int age;

    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

class student extends inheritance{
    int rollno;
    void displaystudent(){
        System.out.println("rollno: "+rollno);
    }

}
public class main{
    public static void main (String[] args)
    {
System.out.println("hello world");
   student s = new student();
   s.name="bhaskar";
   s.age = 20;
   s.rollno = 362;
   s.display();
   s.displaystudent();
    }
}