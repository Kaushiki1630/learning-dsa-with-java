package OOPS.Enums;

public class Basic {
    enum Week implements A, B{
        mon, tue, wed, thrus, fri, sat, sun;

        Week(){
            System.out.println("This is a constructor for " + this);
        }

        @Override
        public void show() {
           System.out.println("I am in enum using show method of interface A");
        }

        @Override
        public void display() {
            System.out.println("I am in enum using display method of interface B");
        }
        
    }

    public static void main(String[] args) {
        Week w;
        w = Week.sat;

        w.show();
        w.display();
        System.out.println(w.ordinal());

        
    }
}
