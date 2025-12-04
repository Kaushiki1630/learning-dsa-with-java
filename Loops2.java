import java.util.Scanner;

public class Loops2 {
   // public static void main(String[] args) {

// while loop


        // int count=0;

        // while(count<10){
        //     count=count+1;
        //     System.out.print(count + " ");
        // }


// for loop
        

        // int count =1;

        //  for(int i=0; i<10; i++){
        //     System.out.print(count + " ");
        //     count++;
        //  }
    
  //  }

// IF CONDITION

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Salary: ");

//     double Salary= sc.nextDouble();

//     if(Salary>30000){
//         System.out.println("Give a Bonus of Rs. 2000");
//     }

//     else{
//         System.out.println("Give a Bonus of Rs. 1000");
//     }

//     sc.close();

//   }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Salary: ");

//     double Salary= sc.nextDouble();

//     if(Salary>100000){
//         System.out.println("Give a Bonus of Rs. 10,000.");
//     }

//     else if(80000 <= Salary && Salary < 100000){
//         System.out.println("Give a Bonus of Rs. 8,000.");
//     }

//     else{
//         System.out.println("Give a Bonus of Rs. 5,000.");
//     }

//     sc.close();

//   }

//FOR LOOP

// public static void main(String[] args) {
//     int count = 1;
//     System.out.println("The countings are: ");

//     for(int i=0; i<5;i++){
//         System.out.print(count + " ");
//         count=count+1;
//     }
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int count=1;
//     System.out.print("Enter the Number: ");
//     int Number = sc.nextInt();

//     System.out.println("The countings are: ");

//     for(int i=0; i<Number; i++){
//         System.out.print(count + " ");
//         count=count+1;
//     }

//     sc.close();
// }


// WHILE LOOP

// public static void main(String[] args) {
//     int count =1;
//     System.out.println("The countings are: ");
//      while(count<=5){
//         System.out.print(count + " ");
//         count=count+1;
//      }
    
// }


// DO WHILE LOOP

// public static void main(String[] args) {
//     int count=1;
//     do{
//         System.out.println(count + " ");
//         count = count+1;
//     }

//     while(count<=5);
// }

// public static void main(String[] args) {
//     int n=1;
//     do{
//         System.out.println("Hello world");
//         n++;
//     }
//     while(n!=2);
    
//}


//QUESTIONS

// #1

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int c=sc.nextInt();

//     if(a>b && a>c){
//         System.out.println("Largest Number is: " + a);
//     }

//     else if(b>a && b>c){
//         System.out.println("Largest Number is: " + b);
//     }

//     else{
//         System.out.println("Largest Number is: " + c);
//     }
    
//     sc.close();
// }


// #2

// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//    char alphabet=sc.next().charAt(0);
//    // char alphabet=sc.next().trim().charAt(0);
//     System.out.println("The given alphabet is: " + alphabet);

//     if(alphabet>= 'A' && alphabet<= 'Z'){
//         System.out.println("Alphabet is of Upper case.");
//     }

//     if(alphabet>= 'a' && alphabet<= 'z'){
//         System.out.println("Alphabet is of Lower case.");
//     }
    
//     sc.close();
// }


//  #3

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num=sc.nextInt();
//     int a=0;
//     int b=1;
    
//     if(num>=1){
//     System.out.print(a);
//     }

//     if(num>=2){
//     System.out.print(" " + b);
//     }

//     for(int i=2; i<num ; i++){
//         int sum=a+b;
   
//         a=b;
//         b=sum;
//         System.out.print(" " + sum); 
//     }

//     sc.close();
// }


// #4

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num=sc.nextInt();
//     System.out.println("The number is: " + num);

//     int count=0;

//     while(num!=0){
//         int rem=num%10;
//     if(rem == 7){
//         count++;
//     }
//     num=num/10;
// }
//     System.out.println("The number of occurrences of 7 are: " + count);
// }


//  #5

// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     int num= sc.nextInt();

//     while(num>0){
//         int digit=num%10;
//         System.out.print(digit);
//         num=num/10;
//     }

//     sc.close();
// }


//  CALCULATOR

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int result=0;
    
        while(true){
            System.out.println("Enter the operator: ");
            char operator=sc.next().trim().charAt(0);
        
            if(operator=='+' || operator=='-'|| operator=='*'|| operator=='/'|| operator=='%' ){
    
            System.out.println("Enter the value of both number: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
    
            if(operator=='+'){
                result=num1+num2;
            }
    
            if(operator=='-'){
                result=num1-num2;
            }
    
            if(operator=='*'){
                result=num1*num2;
            }
    
            if(operator=='/'){
                result=num1/num2;
            }
    
            if(operator=='%'){
                result=num1%num2;
            }
    
            }
    
            else if(operator=='x' || operator=='X'){
                break;
            }
    
            else{
                System.out.println("Please enter the valid operator.");
            }
    
            System.out.println("The result is: " + result);
        }
    
        sc.close();
    
    }
    
    }

