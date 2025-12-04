public class BitWiseOperator16 {


// QUESTION 1 (GIVEN A NUMBER. YOU NEED TO FIND IF IT IS EVEN OR ODD.)


    // public static void main(String[] args) {
    //     int n=2099896567;
    //     System.out.println(EvenorOdd(n));
    // }

    // static boolean EvenorOdd(int a){
    //     int answer= a&1;

    //     if(answer==1){
    //         return false;
    //     }

    //     else{
    //         return true;
    //     }
    // }


// QUESTION 2 (IF AN ARRAY IS GIVEN AND ALL THE ELEMENTS ARE IN PAIR EXCEPT ONE, FIND THE ONE.)


    // public static void main(String[] args) {
    //     int[] arr={2,3,3,4,2,6,4};

    //     System.out.println(ans(arr));
    // }

    // static int ans(int[] nums){
    //     int unique=0;

    //     for(int i=0; i<nums.length; i++){
    //         unique^=nums[i];
    //     }

    //     return unique;
    // }

// QUESTION 3 (IF AN ARRAY IS GIVEN AND ALL THE ELEMENTS ARE IN PAIR OF NEGATIVE AND POSITIVE EXCEPT ONE, FIND THE ONE.)


    // public static void main(String[] args) {
    //     int[] arr={-2,3,-4,2,-6,6,4};

    //     System.out.println(ans(arr));
    // }

    // static int ans(int[] nums){
    //     int unique=0;

    //     for(int i=0; i<nums.length; i++){
    //         unique+=nums[i];
    //     }

    //     return unique;
    // }


// QUESTION 4 (FIND THE ith BIT IF A NUMBER)

    // public static void main(String[] args) {
    //     int number= 0b110011101;
    //     int bit=2;

    //     System.out.println(ans(number, bit));
    // }

    // static int ans(int number, int bit){

    //     int answer= number>>(bit-1);
        
    //     return answer&1;
    // }


// QUESTION 5 (SET THE ith BIT IF A NUMBER)


    // public static void main(String[] args) {
    //     int number= 0b110011101;
    //     int bit=6;

    //     System.out.println(Integer.toBinaryString(ans(number, bit)));
    // }

    // static int ans(int number, int bit){

    //     int mask= 1<<(bit-1);
    //     int answer= (number|mask);
        
    //     return answer;
    // }


    
// QUESTION 6 (RESET THE ith BIT IF A NUMBER)


// public static void main(String[] args) {
//    // int number= 0b110011101;
//     int number= 0b1010110;
//     int bit=5;

//     System.out.println(Integer.toBinaryString(ans(number, bit)));
// }

// static int ans(int number, int bit){

//     int mask= 1<<(bit-1);
//    // int answer= (number& ~mask);
//     int answer= (number^mask);
    
//     return answer;
// }


// QUESTION 8 (FIND THE NTH MAGIC NUMBER)

// public static void main(String[] args) {
   
//     int number= 4;

//     System.out.println(ans(number));
// }

// static int ans(int number){
//     int answer=0;
//     int base=5;

//    while(number>0){
//     int lastdigit=number & 1;
//     number=number>>1;

//     answer=answer+lastdigit*base;

//     base=base*5;

//    } 
//     return answer;
// }


//QUESTON 10(FIND THE DIGITS IN BASE b)

// public static void main(String[] args) {
//     int number=120;
//     int base=16;

//     int formula=(int)((Math.log(number)/Math.log(base))+1);

//     System.out.println(formula);
// }


//QUESTION 11(PASCALS'S TRIANGLE)

// public static void main(String[] args) {
//     int row=6;

//     int answer=1<<(row-1);

//     System.out.println(answer);
// }



//QUESTION 12 (CHECK WHETHER THE GIVEN NUMBER IS A POWER OF TWO OR NOT)

// public static void main(String[] args) {
//     int number=32;

//     //method 1

//     // int count=0;
//     // while(number>0){
//     //     count=count+ (number &1);
//     //     number=number>>1;  
//     // }

//     // if(count==1){
//     //     System.out.println("The number is a power of 2.");
//     // }

//     // else{
//     //     System.out.println("The number is not a power of 2.");
//     // }


//     //method 2

//     int answer=number&(number-1);

//     if(number==0){
//         System.out.println("The number is not a power of 2.");
//     }

//     else{
//     if(answer==0){
//         System.out.println("The number is a power of 2.");
//     }

//     else{
//         System.out.println("The number is not a power of 2.");
//     }
// }    
// }


//QUESTION 13(FIND a^b)

// public static void main(String[] args) {
//     int base=2;
//     int power=6;

//     int ans=1;
//     while(power>0){
//         if((power&1)==1){
//             ans*=base;
//         }

//         base*=base;
//         power=power>>1;
//     }

//     System.out.println(ans);
// }


//QUESTION 14 (find the number of set bit in a given number)

// public static void main(String[] args) {
//     int number=6;

//     System.out.println(count(number));
// }

// static int count(int number){
//     int count=0;
//     while(number>0){
//         if((number & 1)==1){
//             count=count+1;
//         }
//         number=number>>1;
//     }

//     return count;

// }


// //QUESTION 15 (FIND XOR OF NUMBER FROM 0 TO a)

// public static void main(String[] args) {
//     int a=9;

//     if(a%4==0){
//         System.out.println(a);
//     }
//     else if(a%4==1){
//         System.out.println(1);
//     }
//     else if(a%4==2){
//         System.out.println(a + 1);
//     }
//     else{
//         System.out.println(0);
//     }
// }



//QUESTION 16 (FIND XOR OF NUMBER FROM a TO b)

public static void main(String[] args) {
    int a=5;
    int b=8;

    System.out.println(XorfromAtoB(a, b));

}

static int Xor(int a){
    if(a%4==0){
        return a;
    }
    else if(a%4==1){
        return 1;
    }
    else if(a%4==2){
       return (a + 1);
    }
    else{
        return 0;
    }
}

static int XorfromAtoB(int a, int b){
    return (Xor(b)) ^ (Xor(a-1));

}
}
