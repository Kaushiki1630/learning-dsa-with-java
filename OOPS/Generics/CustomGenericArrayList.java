package OOPS.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    // we want to create a add method for our custom arrayList
    public void add(T num){
        if(isFull()){
            resize();
        }

        data[size++]= num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the items of previous array into new array
        for(int i=0; i< data.length; i++){
            temp[i]=data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    // remove function
    // public T remove(){
    //     T removed = (T) (data[--size]);
    //     return removed;
    // }

    // get function
    // public T get(int index){
    //     return (T) data[index];
    // }

    // size function
    public int size(){
        return size;
    }

    // set function
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomGenericArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        //ArrayList l = new ArrayList<>();

        // CustomGenericArrayList list = new CustomGenericArrayList();
        // list.add(232);
        // list.add(3214);
        // list.add(12);

        //for(int i=0; i<14; i++){
        //     list.add(2*i);
        // }

        // System.out.println(list);

        CustomGenericArrayList<Integer> list2= new CustomGenericArrayList<>();
        list2.add(12);
        list2.add(121);
        list2.add(122);
        list2.add(1221);
        System.out.println(list2);

        
    }
}
