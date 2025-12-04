package OOPS.Properties.Inheritance;

public class ChildBox extends Box {
    double weight;
    
    public ChildBox(){
        this.weight=-1;
    }

    public ChildBox(ChildBox other){
        super(other);
       this.weight = other.weight;
    }

    public ChildBox(double side, double weight){
        super(side);
        System.out.println("This is a constructor of Base class named BoxWeight");
        this.weight = weight;
    }

    public ChildBox(double l, double b, double h, double weight) {
       super(l, b, h);
       // System.out.println(super.weight);
        System.out.println(this.weight);
        this.weight = weight;
    }
}