// static method
class Test2 {
    static void display() {
        // System.out.println("hello world");
        //A static method belongs to the class, not to any object.
//So it can be called without creating an object.
    }

    int add(int a, int b){
        return a+b;

    }
    void display(int a, int b ,int c){
        System.out.println(a+b+c);
    }
    int add (int a,int b, int c){
       display(a,b,c);
        return a+b+c;

    }
}

public class Main {
    public static void main(String[] args) {
        Test2 s1 = new Test2();//object create
        System.out.println(s1.add(3,4,5));
        System.out.println(s1.add(4,5));
        String we ="hello";
        String he ="hello";
        System.out.println(we==he);
    }
}
