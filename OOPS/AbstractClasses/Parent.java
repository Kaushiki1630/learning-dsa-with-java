package OOPS.AbstractClasses;

public abstract class Parent {

    int a;

    final int VALUE;

    public Parent(int a){
        VALUE = 218012802;
        this.a= a;
    }

    //CANNOT CREATE ABSTRACT CONSTRUCTORS
    // abstract Parent(){
        
    // }

    static void message(){
        System.out.println("Hellllooo!");
    }

    abstract void display();

    abstract void show();


}
