package Variables;
public class Variables {
    // instance  variable (inside class outside method)
    int roll_no =419;
    char grade = 'A';
    String Name = "csdr";
    //static variable 
    static String college ="Abes";

    // locla varible is created in method
     int a =5;
    void showdetails(){
        int marks =100;
        System.out.println("Marks "+marks);

    }

    public static void main(String[] args)
    {
        Variables obj  = new Variables();
        System.out.println("Name "+ obj.Name);
        System.out.println(obj.a);
        obj.showdetails();
    }

}
