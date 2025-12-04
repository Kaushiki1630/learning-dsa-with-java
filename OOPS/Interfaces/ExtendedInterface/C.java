package OOPS.Interfaces.ExtendedInterface;

public class C implements A, B{

    @Override
    public void greet() {
        System.out.println("GREET");
    }

    @Override
    public void fun() {
        System.out.println("FUN");
    }
    
}
