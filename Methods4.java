// import java.util.Arrays;
// import java.util.Scanner;
import java.util.*;

public class Methods4 {


    // public static void main(String[] args) {
        
    //     sum();
    // }

    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     int num1=sc.nextInt();
    //     int num2=sc.nextInt();

    //     int sum=num1+num2;

    //     System.out.println("The sum is: " + sum);

    // }


    //RETURNS VALUE


    // public static void main(String[] args) {
        
    //    int answer= sum2();
    //    System.out.println("The sum is: " + answer);
    // }

    // static int sum2(){
    //     Scanner sc = new Scanner(System.in);
    //     int num1=sc.nextInt();
    //     int num2=sc.nextInt();

    //     int sum=num1+num2;

    //     return sum;

    // }


    // RETURNING A STRING

    // public static void main(String[] args) {

    //     String output= statement();
    //     System.out.print("The String in the input is: ");
    //     System.out.println(output);

    // }

    // static String statement(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the String: ");
    //     String str = sc.nextLine();

    //     sc.close();

    //     return str;

    // }


// PARAMETERS (INTEGER)

    // public static void main(String[] args) {
    //     int result = sum3(10,20);
    //     System.out.println("The sum is: " + result);
    // }

    // static int sum3(int a, int b){
    //     int sum=a+b;
    //     return sum;
    // }


// PARAMETERS (STRING)
// WAY 1

    // public static void main(String[] args) {

    //     String printgreet = greetings("Kaushiki");
    //     System.out.println(printgreet);

    // }

    // static String greetings(String str){
    //     return str;
    // }


//   WAY 2
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name=sc.nextLine();
    //     String greet= greetings(name);
    //     System.out.println("The string is: " + greet);

    //     sc.close();
    // }

    // static String greetings(String name){
    //     String str="Hello " + name;
    //     return str;
    // }


//  SWAPPING TWO NUMBERS 

    // public static void main(String[] args) {
    //     int a=10;
    //     int b=20;
    //     swap(a, b);

    //     System.out.println(a + " " +b);

    // }

    // static void swap(int a, int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;

    // }


// CHANGING THE VALUE USING FUNCTION

    // public static void main(String[] args) {
    //     int[] arr={10,20,1,4,6,7};
    //     change(arr);
    //     System.out.println(Arrays.toString(arr));
    // }

    // static void change (int[] nums){
    //     nums[0]=30;
    // }


//  SHADOWING

    // static int x=90;
    // public static void main(String[] args) {
    //     System.out.println(x);
    //     int x;
    //     //System.out.println(x);
    //     x=40;
    //     System.out.println(x);
    //     fun();
    // }
    // static void fun(){
    //     System.out.println(x);
    // }

// VARIABLE ARGUMENTS

// public static void main(String[] args) {
//    // demo(12,54,6,76,8,9,5423,6,7,879,8987,3,323,3,54);
//     demo();    //Empty array
// }

// static void demo(int ...d){
//     System.out.println(Arrays.toString(d));
// }


// MULTIPLE VARIABLE ARGUMENTS

// public static void main(String[] args) {
//     demo(10,20,"KAUSHIKI","KIRTI","KIM TAEHYUNG");
// }

// static void demo(int a, int b, String ...s){
//     System.out.println(a +" "+ b+ " "+ Arrays.toString(s));
// }


//  METHOD OVERLOADING
//  EXAMPLE 1

// public static void main(String[] args) {
//     int ans=sum(10,20);
//     System.out.println(ans);

//     int result=sum(10,20, 30);
//     System.out.println(result);

//     sum("Kaushiki");
// }

// static int sum(int a, int b){
//     return a+b;
// }

// static int sum(int a, int b, int c){
//     return a+b+c;
// }

// static void sum(String str){
//    // str="Kaushiki";
//     System.out.println(str);
// }


// EXAMPLE 2

public static void main(String[] args) {
    demo(10,20);
    demo(30,1,3,4,5,6,7,8,9);
}
static void demo(int a, int b){
    System.out.println(a + " " + b);
}

static void demo(int b, int ...a){
    System.out.println(b + " " + Arrays.toString(a));
}

}
