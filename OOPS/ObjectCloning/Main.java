package OOPS.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kaush = new Human("Kaushiki", 34);
       // Human kaush2 = new Human(kaush);

       Human twinKaush = (Human) kaush.clone();
       System.out.println(twinKaush.name + " " + twinKaush.age);
       System.out.println(Arrays.toString(twinKaush.arr));

       twinKaush.arr[0] = 1000;

       System.out.println(Arrays.toString(kaush.arr));
       System.out.println(Arrays.toString(twinKaush.arr));

    //    twinKaush.name = "Kaushhhhh";
    //    System.out.println(kaush.name);
    //    System.out.println(twinKaush.name);
    }
}
