package OOPS.CollectionFrameWork;

// import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;
// import java.util.Stack;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
    //   List<Integer> c = new ArrayList<>();
    //   List<String> names1 = new Stack<>();
    //   List<Integer> list = new LinkedList<>();

    List<String> vector = new Vector<>();
    vector.add("Hey!");
    vector.add("You");
    vector.add("Are");
    vector.add("So");
    vector.add("Beautiful.");

    System.out.println(vector);
    
    }
}
