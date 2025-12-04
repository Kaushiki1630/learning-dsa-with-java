package OOPS.Generics;

//import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
    operation add = (a, b) -> a+b;
    operation multiply = (a, b) -> a*b;
    operation sub = (a, b) -> a-b;

    System.out.println(add.operatants(3, 3));
    System.out.println(multiply.operatants(4, 3));
    System.out.println(sub.operatants(9, 3));
}
}

interface operation{
    int operatants(int a, int b);
}
