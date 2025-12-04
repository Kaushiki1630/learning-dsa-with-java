package OOPS.Properties.Inheritance;

public class Practice{
    public static void main(String[] args) {
        // Box i = new Box();
        // Box i1 = new Box(4);
        // Box i2 = new Box(4, 5, 6);
        // Box i3 = new Box(i);

        // System.out.println(i.l + " " + i.b + " " + i.h + " ");
        // System.out.println(i1.l + " " + i1.b + " " + i1.h + " ");
        // System.out.println(i2.l + " " + i2.b + " " + i2.h + " ");
        // System.out.println(i3.l + " " + i3.b + " " + i3.h + " ");

        // ChildBox child = new ChildBox();
        // System.out.println(child.l + " " + child.weight);

        // ChildBox child1 = new ChildBox(2, 3, 4, 5);
        // System.out.println(child1.l + " " + child1.b + " " + child1.h + " " + child1.weight);

        // Box O4 = new ChildBox(2,3,4,6);
        // System.out.println(O4.l +" " + O4.b+" "+ O4.h);

        ChildBox2 obj1= new ChildBox2(3, 4, 1000);
        System.out.println(obj1.l + " " +  obj1.b + " " + obj1.h + " " + obj1.weight + " " + obj1.cost );

    }
}