import java.util.Scanner;

public class QuestionPractise1 {

// QUESTION 1

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number: ");
    //     int number= sc.nextInt();
    //     System.out.println("The Given number is: " + number);

    //     if(number % 2.0 == 0.0){
    //         System.out.println("Given Number is even.");
    //     }

    //     else{
    //         System.out.println("Given number is odd.");
    //     }

    //     sc.close();
    // }


//QUESTION 2

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the name for the greetings: ");
    //     String name= sc.nextLine();

    //     System.out.println("Hello " + name + "!");

    //     sc.close();
    // }


//QUESTION 3

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the Principal Amount, Rate of Interest and Time Period: ");
    //     float principal_amount= sc.nextFloat();
    //     float rate= sc.nextFloat();
    //     int time=sc.nextInt();

    //     float SimpleInterest= (principal_amount*rate*time)/100;

    //     System.out.println("The calculated Simple Interest is: " + SimpleInterest);

    //     sc.close();
    // }


//QUESTION 4

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter two numbers and an Operator: ");
    //     float num1= sc.nextFloat();
    //     float num2= sc.nextFloat();
    //     char op = sc.next().charAt(0);
    //     float result;

    //     if(op=='+'){
    //         result=num1+num2;
    //         System.out.println("The sum is: " + result);            
    //     }

    //     else if(op=='-'){
    //             result=num1-num2;
    //             System.out.println("The difference is: " + result);
    //     }

    //     else if(op=='*'){
    //         result=num1*num2;
    //         System.out.println("The multiplication is: " + result);
    //     }

    //     else if(op=='/'){
    //         result=num1/num2;
    //         System.out.println("The division is: " + result);
    //     }

    //     else{
    //         System.out.println("Invalid Operator. Please enter a valid operator.");
    //     }

    //     sc.close();
    // }


//QUESTION 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float num1= sc.nextFloat();
        float num2= sc.nextFloat();

        if(num1>num2){
            System.out.println("The largest number is: " + num1);
        }
        else{
            System.out.println("The largest number is: " + num2);
        }

        sc.close();
    }



























}
