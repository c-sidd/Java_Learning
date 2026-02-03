class  student{
    int id;
    String name;



  
 
      student(){     //public 
           id =10;
           name ="abc";
      }

      // paramaterized constructor
      
      student(int i ,String n){     //public 
           id =i;
           name =n;
      }
        void display(){
            System.out.print(id +" "+name +"\n");
    }
   
    
}


public class constructor{
public static void main(String[] args)
{
        student s1 = new student(199,"ahdfh");
        s1.display();
        s1.display();
        student s2 = new student();
        s2.display();
}}

