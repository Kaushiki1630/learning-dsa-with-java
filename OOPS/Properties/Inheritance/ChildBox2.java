package OOPS.Properties.Inheritance;

public class ChildBox2 extends ChildBox{
    double cost;

    ChildBox2(){
        super();
        this.cost=-1;
    }

    ChildBox2(ChildBox2 other){
        super(other);
        this.cost = other.cost;
    }

    public ChildBox2(double l, double b, double h, double weight, double cost){
        super(l, b, h, weight);
        this.cost = cost;
    }

    public ChildBox2(double side, double weight, double cost){
        super(side, weight);
        System.out.println("This is a child class (of BoxWeight) constructor.");
        this.cost= cost;
    }
}
