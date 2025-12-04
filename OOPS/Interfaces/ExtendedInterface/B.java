package OOPS.Interfaces.ExtendedInterface;

public interface B {
    
    void greet();

    default void message(){
        System.out.println("This is a default method in B");
    }
}
