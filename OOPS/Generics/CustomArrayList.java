package OOPS.Generics;

import java.util.Arrays;

//import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    // we want to create a add method for our custom arrayList
    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++]= num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

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
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    // get function
    public int get(int index){
        return data[index];
    }

    // size function
    public int size(){
        return size;
    }

    // set function
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        //ArrayList l = new ArrayList<>();

        CustomArrayList list = new CustomArrayList();
        // list.add(232);
        // list.add(3214);
        // list.add(12);

        for(int i=0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list);

        
    }
}
