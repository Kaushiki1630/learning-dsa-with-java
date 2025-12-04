package OOPS.Generics.ComparingObjects;

public class Student{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks){
        this.marks=marks;
        this.rollNo= rollNo;
    }

    @Override
    public String toString(){
        // return "Student{" + "rollno=" +rollNo + ", marks=" + marks + '}';
        return marks + "";
    }

    // @Override
    // public int compareTo(Student o) {
    //     int diff = (int)(this.marks - o.marks);

    //     //if(diff == 0) both are equal
    //     //if(diff < 0) o is bigger  else o is smaller
    //     return diff;
    // }

    
}
