package OOPS.Interfaces.ExtendedInterface;

public interface A {

    void fun();

    default void show(){
        System.out.println("This is a default method in A.");
    }
    
}