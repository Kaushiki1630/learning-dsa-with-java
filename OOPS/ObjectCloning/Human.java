package OOPS.ObjectCloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{2,3,45,5};
    }

    // SHALLOW COPY
    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }

    // DEEP COPY
    @Override
    public Object clone() throws CloneNotSupportedException {
       // shallow copies all the other variable in the class Human except non-primitives (mutable)
        Human twin = (Human) super.clone();

        twin.arr = new int[twin.arr.length];
        for(int i=0; i< twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
