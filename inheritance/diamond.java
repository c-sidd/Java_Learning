
//The Diamond Problem occurs in multiple inheritance when a class inherits from two classes that 
// have a common parent, creating ambiguity about which method or variable to inherit.
interface A {
    void showA();
}

interface B {
    void showB();
 }


class C implements A, B {
    public void show() {
        System.out.println("Resolved Diamond Problem");
    }
}

