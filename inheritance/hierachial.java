class animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("cat meow  ");

    }
}

public class hierachial {
    public static void main(String[] args)
    {
        System.out.println("hello world");
         cat c = new cat();
         dog d = new dog();

         d.eat();
         d.bark();
         c.eat();
         c.meow();
    }
}
