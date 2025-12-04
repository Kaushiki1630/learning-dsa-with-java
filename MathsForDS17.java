// import java.util.ArrayList;
// import java.util.List;


public class MathsForDS17 {

    //PRIME NUMBERS

    // public static void main(String[] args) {
    //     int num=-19;
    //     System.out.println(PrimeNumbers(num));

    //     // for(int i=1; i<=num; i++){
    //     //     System.out.println(i + " " + PrimeNumbers(i));
    //     // }
    // }

    // static boolean PrimeNumbers(int num){
    //     if(num<=1){
    //         return false; 
    //     }

    //     for(int i=2; i<=Math.sqrt(num); i++){
    //         if(num%i==0){
    //            return false;
    //         }
    //         }
    //         return true;
    //     }


//ALL  THE PRIME NUMBERS UPTO n 
    
    // public static void main(String[] args) {
    //     int num=20;
    //     System.out.println(AllPrimeNumber(num));

    // }

    // static boolean PrimeNumbers(int num){
    //     if(num<=1){
    //         return false; 
    //     }

    //     for(int i=2; i<=Math.sqrt(num); i++){
    //         if(num%i==0){
    //            return false;
    //         }
    //         }
    //         return true;
    //     }

    // static List<Integer> AllPrimeNumber(int num){
    //     List<Integer> prime= new ArrayList<>();
    //     for(int i=2; i<=num; i++){
    //         if(PrimeNumbers(i)){
    //             prime.add(i);
    //         }
    //     }
    //     return prime;
    // }


// OPTIMISED WAY for PRIME NUMBERS (STIEVE OF ERATOSTHENES)
    
    // public static void main(String[] args) {
    //     int num=37 ;
    //     optimisedprime(num);
    // }

    // static void optimisedprime(int n){
    //     boolean[] array= new boolean[n+1];
    //     for(int i=2; i<=n; i++){
    //         array[i]=true;
    //     }

    //     for(int j=2; j<=Math.sqrt(n); j++){
    //         if(array[j]){
    //             for(int multiple= j*j; multiple<=n; multiple+=j ){
    //                 array[multiple]=false;
    //             }
    //         }
    //     }

    //     for(int i=2; i<=n; i++){
    //         if(array[i]){
    //             System.out.print(i + " ");
    //         }
    //     }
    // }


// SQUARE ROOT

// public static void main(String[] args) {
//     int num=40;
//     int p=3;
//     //System.out.printf("%.3f", squareRoot(num, p));
//     System.out.println( squareRoot(num, p));
// }

// static double squareRoot(int num, int p){
//     int s=0;
//     int e=num;

//     double root=0.0;

//     while(s<=e){
//         int m=s+(e-s)/2;

//         if(m*m==num){
//             return m;
//         }

//         else if(m*m>num){
//             e=m-1;
//         }
//         else{
//             root=m;
//             s=m+1;
//         }
//     }

//     double incr=0.1;
//     for(int i=0; i<p; i++){
        
//         while(root*root<=num){
//             root=root+incr;
//         }

//         root= root-incr;
//         incr=incr/10;
//     }

//     return root;
// }


// NEWTON RAPHSON METHOD FOR CALCULATING SQUARE ROOT OF A NUMBER

// public static void main(String[] args) {
//     int num=40;
//     System.out.println(Nrm(num));
// }

// static double Nrm(int num){
//     double x=num;
//     double root;

//     while(true){
//         root= 0.5*(x+(num/x));

//         if(Math.abs(root-x)<0.00001){
//             break;
//         }
        
//         x= root;
//     }

//     return root;
// }


// FACTORS OF A NUMBER // DIVISIOR

// public static void main(String[] args) {
//     int num=36;
//     factors1(num);
//     System.out.println();
//     factors2(num);
//     System.out.println();
//     factors3(num);
// }

// //time complexity : o(n)
// static void factors1(int num){
//     System.out.println("The factors1 of the " + num +" are: ");
//     for(int i=1; i<=num; i++){
//         if(num%i==0){
//             System.out.print(i + " ");
//         }
//     }
// }


// // time complexity : o(Math.sqrt(n))
// static void factors2(int num){
//     System.out.println("The factors2 of the " + num +" are: ");
//     for(int i=1; i<=Math.sqrt(num); i++){
        
//         if(num%i==0){
//             if(num/i==i){
//                 System.out.print(i + " ");
//             }
//             else{
//                 System.out.print(i + " " + num/i + " ");
//             }
//         }
//     }
// }


// // time complexity : o(Math.sqrt(n)) and space complexity : o(Math.sqrt(n))
// static void factors3(int num){
//     System.out.println("The factors2 of the " + num +" are: ");
//     ArrayList<Integer> al = new ArrayList<>();
//     for(int i=1; i<=Math.sqrt(num); i++){
        
//         if(num%i==0){
//             if(num/i==i){
//                 System.out.print(i + " ");
//             }
//             else{
//                 System.out.print(i + " ");
//                 al.add(num/i);
//             }
//         }
//     }

//     for(int j=al.size()-1; j>=0; j--){
//         System.out.print(al.get(j) + " ");
//     }
// }


// GCD/HCF OF A NUMBER

public static void main(String[] args) {
    System.out.println(Hcf(4,8));
    System.out.println(Lcm(4,8));
}

static int Hcf(int a, int b){
    if(a==0){
        return b;
    }

    return Hcf(b%a, a);
}

static int Lcm(int a, int b){
    return a*b/Hcf(a,b);
}


        
    }

