package OOPS.AbstractClasses;

public class Child extends Parent{

    public Child(int a) {
        super(a);
    }

    @Override
    void display() {
        System.out.println("Hello, I am the First Child.");
    }

    @Override
    void show() {
        System.out.println("hahahaha");
    }

    
}
