package OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Child ch = new Child(3);
        ch.display();

        Parent.message();

        Child2 ch2 = new Child2(4);
        ch2.display();

       // CANNOT CREATE OBJECT OF THE ABSTRACT CLASSES
      //  Parent p= new Parent(10);
      
      
    }
}
