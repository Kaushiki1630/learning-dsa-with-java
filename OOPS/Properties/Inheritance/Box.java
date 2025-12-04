package OOPS.Properties.Inheritance;

public class Box {
    double l;
    double b;
    double h;
    double weight;

    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    Box(double side){
        System.out.println("This is a parent class constructor.");
        this.l=side;
        this.b=side;
        this.h=side;
    }

    Box(double length, double breadth, double height){
       // System.out.println("This is a parent class constructor.");
        this.l=length;
        this.b = breadth;
        this.h= height;
    }

    Box(Box otherObj){
        this.l = otherObj.l;
        this.b = otherObj.b;
        this.h = otherObj.h;
    }

    public void display(){
        System.out.println("Hello, I am in the Constructor.");
    }
}

// class Random{
//     public static void main(String[] args) {
//         Box obj = new Box();

//       // it will show error as the "l" variable is private in the box class;
//       //  System.out.println(obj.l);
//     }
// }
