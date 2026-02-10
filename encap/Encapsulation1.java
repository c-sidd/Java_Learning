
public class Encapsulation1 {


/*
 Encapsulation means wrapping data (variables) and methods together
 into a single unit (class) and protecting data by restricting
 direct access.

 In simple words:
 Data Hiding + Controlled Access
*/



    // private variables → data hiding
    private int rollno;
    private int marks;
    private String name;

    // Setter methods → controlled access

    public void setRollNo(int rollno) {
        this.rollno = rollno; // this refers to current object
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods → read-only access

    public int getRollNo() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Encapsulation1 s = new Encapsulation1();

        s.setRollNo(10);
        s.setName("Sid");
        s.setMarks(50);

        // accessing data using getters
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}



