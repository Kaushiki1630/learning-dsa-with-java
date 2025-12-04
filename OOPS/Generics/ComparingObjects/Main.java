package OOPS.Generics.ComparingObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Kaush= new Student(12, 12.23f );
        Student Kirti= new Student(2, 92.51f );
        Student Kannu= new Student(4, 55.66f );
        Student Preeti= new Student(10,82.31f );
        Student Kashish= new Student(1, 43.76f );
        Student Manu= new Student(6, 52.22f );

        Student[] list ={Kaush, Kannu, Kashish, Kirti, Preeti, Manu};

        System.out.println(Arrays.toString(list));

        // Arrays.sort(list, new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return (int)(o1.marks - o2.marks);
        //     }
            
        // });

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));


        // if(Kaush.compareTo(Kirti)<0){
        //     System.out.println(Kaush.compareTo(Kirti));
        //     System.out.println("Kirti has more marks.");
        // }
    }
}
