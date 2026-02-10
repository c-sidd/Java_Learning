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

class puppy extends dog {
    void lick(){
        System.out.println("dog licks ");

    }
}

public class multiplein {
    public static void main(String[] args)
    {
        System.out.println("hello world");
         puppy d = new puppy();
         d.eat();
         d.bark();
         d.lick();
    }
}
