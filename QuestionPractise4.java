import java.util.*;

public class QuestionPractise4 {
    // 1. WHETHER PRIME NUMBER OR NOT

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number to check whether it is prime number or not: ");
//         int number = sc.nextInt();

//         if(PrimeNumber(number)){
//             System.out.println("The number is Prime.");
//         }
//         else{
//             System.out.println("The number is not Prime.");
//         }

//         sc.close();


//     }

//     static boolean PrimeNumber(int num){
//          if(num<=1){
//             return false;
//          }

//         for(int i=2; i<=Math.sqrt(num); i++){
//             if(num % i ==0){
//                 return false;
//             }
//         }
//         return true;
//     }


//  CHECK IF THE GIVEN NUMBER IS ARMSTRONG NUMBER OR NOT

// public static void main(String[] args) {
//     Scanner sc= new Scanner (System.in);
//     System.out.println("Enter the number to check if it is armstrong number or not: ");
//     int number=sc.nextInt();
    
//     checkNumber(number);

//     sc.close();
// }

// static void checkNumber(int num){
//     int originalnum=num;
//     int sum=0;

//     while(num>0){
//         int digit=num%10;
//         sum=sum+(digit*digit*digit);
//         num=num/10;
//     }

//     if(sum==originalnum){
//         System.out.println("The number is Armstrong number.");
//     }
//     else{
//         System.out.println("The number is not an Armstrong number.");
//     }
// }
// }


//  ARMSTRONG NUMBERS BETWEEN 100 TO 1000;

public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the number to check if it is armstrong number or not: ");
    int number=sc.nextInt();
    
    checkNumber(number);

    if(checkNumber(number)){
        System.out.println("The number is an Armstrong number.");
    }

    else{
        System.out.println("The number is not an Armstrong number.");
    }

    System.out.print("The 3-digit armstrong numbers are: ");
    for(int i=100; i<1000; i++){
        if(checkNumber(i)){
            System.out.print(i + " ");
        }
    }

    sc.close();
}

static boolean checkNumber(int num){
    int originalnum=num;
    int sum=0;

    while(num>0){
        int digit=num%10;
        sum=sum+(digit*digit*digit);
        num=num/10;
    }

    if(sum==originalnum){
      //  System.out.println("The number is Armstrong number.");
      return true;
    }
    else{
      //  System.out.println("The number is not an Armstrong number.");
      return false;
    }
}

}


