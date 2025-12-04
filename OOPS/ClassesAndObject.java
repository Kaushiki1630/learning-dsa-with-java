// package OOPS;

// public class ClassesAndObject {
// //     public static void main(String[] args) {
// //         // Student Student1;
// //         // Student1= new Student();

// // //modifing the object ourselves

// //     //     Student1.rollNo= 73;
// //     //     Student1.name="Kaushiki Chaudhary";
// //     //   //  Student1.marks= 99.9f;

// //     //     System.out.println(Student1);
// //     //     System.out.println(Student1.rollNo);
// //     //     System.out.println(Student1.name);
// //     //     System.out.println(Student1.marks);

// //     // Student Kaush = new Student();
// //     // Student Kirti = new Student();

// //     // System.out.println(Kaush.rollNo);
// //     // System.out.println(Kaush.name);
// //     // System.out.println(Kaush.marks);
// //     // System.out.println(Kirti.rollNo);
// //     // System.out.println(Kirti.name);
// //     // System.out.println(Kirti.marks);
    
// //     // Kaush.greeting();
// //     // Kirti.greeting();

// //     Student Kaushiki = new Student(15, "Kim Taehyung", 30);
// //     System.out.println(Kaushiki.rollNo);
// //     System.out.println(Kaushiki.name);
// //     System.out.println(Kaushiki.marks);
    

// //     }
// // }

// // class Student{
// //     int rollNo;
// //     String name;
// //     float marks=90;  // declaring default

// //     Student(){
// //         this.rollNo=13;
// //         this.name="Kaushiki Chaudhary";
// //         this.marks=73;
// //     }

// //     Student(int rollNo1, String name1, float marks1){
// //         rollNo=rollNo1;
// //         name=name1;
// //         marks=marks1;
// //     }

// //     void greeting(){
// //         System.out.println("Hello!, My name is " + name);
// //     }



// // CONSTRCUTOR OVERLOADING

// public static void main(String[] args) {
//     // Maths m1 = new Maths(4, 4.5f);
//     // System.out.println(m1.side);

//     // Maths m2 = new Maths(4.6f, 5);
//     // System.out.println(m2.side);

//     Construct Kaush = new Construct();

//     Construct cons1 = new Construct(Kaush);
//     System.out.println(cons1.name);
// }
// }

// // class Maths{
// //     int side;
// //     float length;
// //     double breath;

// //     Maths(int side, float length){
// //         this.side=side;
// //         this.length=length;
// //     }

// //     Maths(float length, int side){
// //         this.length=length;
// //         this.side=side;
// //     }

// //     Maths(float length, int side, double breath){
// //         this.side=side;
// //         this.length=length;
// //         this.breath=breath;
// //     }
// // }

// class Construct{
//     int rno=13;
//     String name="Kaushiki Chaudhary";
//     float marks = 4.5f;

//     Construct(){}

//     Construct(Construct other){
//         this.name = other.name;
//         this.rno = other.rno;
//         this.marks= other.marks;
//     }
// }


package OOPS;

public class ClassesAndObject{
    public static void main(String[] args) {
        // Student stu1 = new Student();
        // System.out.println(stu1.name);

        // Student one = new Student();
        // Student two = one;

        // one.name="Kaushiki is a good girl.";
        // System.out.println(two.name);

      final  A kaush= new A("Kaushiki");
      System.out.println(kaush.name);

      // value of non primitive datatypes could be changed even if it is final
      kaush.name= "Homies";
      System.out.println(kaush.name);

      //but is cannot be reassigned
 //     kaush= new A("Chaudhary");
    }
}

// class Student{
//     // int rno =10;
//     // String name = "Kim Taehyung";
//     // float marks = 100.0f;

//     // Student(){
//     //     this(13, "Default Person", 100.0f);
//     //     System.out.println("Hello!");
//     // }

//     // Student(int rno, String name, float marks){
//     //     this.rno=rno;
//     //     this.name=name;
//     //     this.marks= marks;
//     // }

//     String name;

//     Student(){
//         this("Default Person");
//         System.out.println("Hello! This is a default cons.");
//     }

//     Student(String name){
//         this.name=name;
//         System.out.println("This is a paramterized cons.");
//     }
// }

class A{
    String name;

    A(String name){
        this.name= name;
    }
}

// static keyword wagera netbeans pr hain