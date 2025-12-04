package RecursionConcepts;

public class Recursion15 {
    // QUESTION 1 (FIBONACCI NUMBER)
    // public static void main(String[] args) {
    //   //  System.out.println(fibonacci(50));
    //   System.out.println(fiboFormula(50));
    // }

    // static int fiboFormula(int a){

    //     return (int) (Math.pow(1+ Math.sqrt(5)/2, a));
    // }

    // static int fibonacci(int n){

    //     if(n<2){
    //         return n;
    //     }

    //     int fibonacci=fibonacci(n-1)+ fibonacci(n-2);

    //     return fibonacci;
    // }

// BINARY SEARCH

    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,55,66,78};
    //     int target=78;

    //     System.out.println(bs(arr, target,0, arr.length-1));
    // }

    // static int bs(int[] nums, int target, int s, int e){
        
    //     if(s>e){
    //         return -1;
    //     }

    //     int m= s+(e-s)/2;

    //     if(target==nums[m]){
    //         return m;
    //     }

    //     if(nums[m]>target){
    //        return bs(nums, target, s, m-1);
    //     }

    //     else{
    //         return bs(nums, target, m+1, e);
    //     }
    // }

// PRINT N TO 1

// public static void main(String[] args) {
//     fun(5);
// }

// static void fun(int num){
//     if(num==1){
//         System.out.println(num);
//         return;
//     }

//     System.out.println(num);
//     fun(num-1);
// }


// PRINT 1 TO N
// public static void main(String[] args) {
//     fun(1);
//     funRev(5);
// }

// static void fun(int num){
//     if(num==5){
//         System.out.println(num);
//         return;
//     }

//     System.out.println(num);
//     fun(num+1);
// }


// static void funRev(int num){
//     if(num==1){
//         System.out.println(num);
//         return;
//     }

//     funRev(num-1);
//     System.out.println(num);
// }


// // FACTORIAL OF A NUMBER

// public static void main(String[] args) {
//     int result=Factorial(10);
//     System.out.println(result);
// }

// static int Factorial(int n){
//     if(n==0){
//         return 1;
//     }

//     int factorial= n* Factorial(n-1);
//     return factorial; 
// }


// // Sum OF n NUMBER

// public static void main(String[] args) {
//     int result=Sum(10);
//     System.out.println(result);
// }

// static int Sum(int n){
//     if(n==0){
//         return 0;
//     }

//     int Sum= n + Sum(n-1);
//     return Sum; 
// }



// // Sum OF Digits

// public static void main(String[] args) {
//     int result=SumOfDigits(54129);
//     System.out.println(result);
// }

// static int SumOfDigits(int n){
//     if(n==0){
//         return 0;
//     }

//     int digit=n%10;
    
//   //  int result=digit + SumOfDigits(n/10);       // same for both the statements
//     int result= SumOfDigits(n/10) + digit;
//     return result; 
// }


// PRODUCT OF Digits

// public static void main(String[] args) {
//     int result=ProductOfDigits(54129);
//     System.out.println(result);
// }

// static int ProductOfDigits(int n){
//     if(n==0){
//         return 1;
//     }
//     // if(n%10==n){
//     //     return n;
//     // }

//     int digit=n%10;
    
//   //  int result=digit * ProductOfDigits(n/10);       // same for both the statements
//     int result= ProductOfDigits(n/10) * digit;
//     return result; 
// }

// CONCEPT OF PREDECREMENT AND POSTDECREMENT

// public static void main(String[] args) {
//    // concept(5);
//     concept(1);
// }

// static void concept(int n){
//     // if(n==0){
//     //     return;
//     // }

//     if(n>5){
//         return;
//     }

//     System.out.println(n);
//     concept(++n);
//    // concept(n++);    // forms the infinite loop as it passes the value to the function and decrease it.
// }


// REVERSE OF A NUMBER

//METHOD 1
// public static void main(String[] args) {
//     int n=54129;
//     int digits=(int)Math.log10(n)+1;

//     System.out.println(digits);

//     // int ans=Reverse(n, digits);
//     // System.out.println(ans);
// }

// static int Reverse(int n, int digits){
//     if(n==0){
//         return 0;
//     }
//     int digit=n%10;

//     return digit * (int) Math.pow(10, digits-1) + Reverse(n/10, digits-1);
// }

//METHOD 2
// public static void main(String[] args) {
//     int n=54129;

//    int ans= Reverse(n, 0);
//    System.out.println(ans);
    
// }

// static int Reverse(int n, int reversed){
//     if(n==0){
//         return reversed;
//     }
//     int digit=n%10;
//     reversed=reversed*10+digit;

//    return Reverse(n/10, reversed);
// }


//CHECK WHETHER THE GIVEN NUMBER IS PALINDROME OR NOT

// WAY 1
// public static void main(String[] args) {
//    // int n=54129;
//     int n=54122145;

//     System.out.println(Palindrome(n));

    
// }

// static boolean Palindrome(int n){
//     if(n== Reverse(n, 0)){
//         return true;
//     }
//     else{
//         return false;
//     }
// }

// static int Reverse(int n, int reversed){
//     if(n==0){
//         return reversed;
//     }
//     int digit=n%10;
//     reversed=reversed*10+digit;

//    return Reverse(n/10, reversed);
// }

// COUNTING THE NUMBER OF ZEROES IN THE NUMBER

// public static void main(String[] args) {
//     System.out.println(Zeroes(30000204));
// }

// static int Zeroes(int n){
//     int count=0;

    
//     while(n!=0){
//         if(n%10==0){
//         count++;
//         n=n/10;
//     }
//     else{
//         n=n/10;
//     }
// }
//     return count;
// }

// NUMBER OF STEPS TO REDUCE A NUMBER TO ZERO

// public static void main(String[] args) {
//     int ans=CountSteps(41);
//     System.out.println(ans);
// }

// static int CountSteps(int n){
//     int count1=0;
//     int count2=0;

//     while(n!=0){
//     if((n&1)==0){
//         n=n/2;
//         count1++;
//     }
//     else{
//         n=n-1;
//         count2++;
//     }
// }

// return count1+count2;
// }




// RECURSION - ARRAY QUESTIONS



// CHECK WHETHER THE ARRAY IS SORTED OR NOT

// public static void main(String[] args) {
//     int[] arr={1,4,3,2};
//   //  int[] arr={1,2,3,4};
//    // System.out.println(sorted(arr));
//    System.out.println(sorted1(arr, 0));
// }

// withour recursion

// static boolean sorted(int[] arr){
//     for(int i=0; i<arr.length-1;i++){
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//     }
//     return true;
// }

// using recursion

// static boolean sorted1(int[] arr, int index){
//     if(index==arr.length-1){
//         return true;
//     }

//     return arr[index]<arr[index+1] && sorted1(arr, index+1);
// }


// LINEAR SEARCH 

//using recursion

// public static void main(String[] args) {
//     int[] arr={3,2,1,21,14,18,18,9};
   
//     System.out.println(linearSearchFront(arr, 0, 18));
  
//     System.out.println(linearSearchLast(arr, arr.length-1, 18));
   
//    // linearSearchMultipleOccur(arr, 0, 18);
//    // System.out.println(List);

//     // ArrayList<Integer> ans1 = new ArrayList<>();
//    // ArrayList<Integer> ans= linearSearchMultipleOccur1(arr, 0, 18, ans1);
//   //  System.out.println(ans);
  
// //   linearSearchMultipleOccur1(arr, 0, 18, ans1);
// //   System.out.println(ans1);
// System.out.println(Search(arr, 0, 18));
// }

// static int linearSearchFront(int[] arr, int index, int target){
//     if(index>= arr.length-1){
//         return -1;
//     }

//     if(arr[index]== target){
//         return index;
//     }

//     return linearSearchFront(arr, index+1, target);
// }

// static int linearSearchLast(int[] arr, int index, int target){
//     if(index==-1){
//         return -1;
//     }

//     if(arr[index]== target){
//         return index;
//     }

//     return linearSearchLast(arr, index-1, target);
// }

// static ArrayList<Integer> List= new ArrayList<>();
// static void linearSearchMultipleOccur(int[] arr, int index, int target){
//     if(index==arr.length){
//         return ;
//     }

//     if(arr[index]== target){
//         List.add(index);
//     }

//     linearSearchMultipleOccur(arr, index+1, target);
// }

// static ArrayList<Integer> linearSearchMultipleOccur1(int[] arr, int index, int target, ArrayList<Integer> list){
//     if(index==arr.length){
//         return list;
//     }

//     if(arr[index]== target){
//         list.add(index);
//     }

//     return linearSearchMultipleOccur1(arr, index+1, target, list);
// }

// static ArrayList<Integer> Search(int[] arr, int index, int target){
//     ArrayList<Integer> list = new ArrayList<>();

//     if(index==arr.length){
//         return list;
//     }

//     if(arr[index]== target){
//         list.add(index);
//     }

//     ArrayList<Integer> belowAnswers = Search(arr, index+1, target);

//     list.addAll(belowAnswers);

//     return list;
// }


// ROTATED BINARY SEARCH

// public static void main(String[] args) {
//     int[] arr={5,6,7,8,9,1,2,3};

//     System.out.println(RotatedBinary(arr, 0, arr.length-1, 8));
// }

// static int RotatedBinary(int[] arr, int s, int e, int target){
//     s=0;
//     e= arr.length-1;

//     if(s>e){
//         return -1;
//     }

//     int m=s+(e-s)/2;

//     if(target==arr[m]){
//         return m;
//     }

//     if(arr[s]<=arr[m]){
//         if(target>=arr[s] && target<=arr[m]){
//             return RotatedBinary(arr, s, m-1, target);
//         }
//         else{
//             return RotatedBinary(arr, m+1, e, target);
//         }
//     }

//     if(target>=arr[m] && target<=arr[e]){
//         return RotatedBinary(arr, m+1, e, target);
//     }

//     return RotatedBinary(arr, s, m-1, target);
// }




// QUESTIONS ON RECURSION OF PATTERN, BUBBLE SORT AND SELECTION SORT

//Question 1
// * * * *
// * * *
// * *
// *

// public static void main(String[] args) {
//  //   pattern1(4);
//     patternWithRecursion(4, 0,0);
// }

// // static void pattern1(int n){
// //     for(int i=1; i<=n; i++){
// //         for(int j=1; j<=n-i+1; j++){
// //             System.out.print("* ");
// //         }
// //         System.out.println();
// //     }
// // }

// static void patternWithRecursion(int n, int r, int c){
//     if(r==n){
//         return;
//     }

//     if(c< n-r){
//         System.out.print("* ");
//         patternWithRecursion(n, r, c+1);
//     }
//     else{
//         System.out.println();
//         patternWithRecursion(n, r+1, 0);
//     }
// }


// question 2
// *
// * *
// * * *
// * * * *

// public static void main(String[] args) {
//     pattern2(4, 0, 0);
// }

// static void pattern2(int n, int r, int c){
//     if(r==n){
//         return;
//     }

//     if(c<=r){
//         System.out.print ("* ");
//         pattern2(n, r, c+1);
//     }
//     else{
//         System.out.println();
//         pattern2(n, r+1, 0);
//     }
// }

// BUBBLE SORT WOTH RECURSION

// public static void main(String[] args) {
//     int[] arr={5,2,1,6,3};

//     BubbleSort(arr);
//     System.out.println(Arrays.toString(arr));
// }

// static void BubbleSort(int[] arr){
//     helper(arr, 0, 0);
// }

// static void helper(int[] arr, int i, int j){
//     if(i==arr.length){
//         return ;
//     }

//     if(j<arr.length-1-i){
//         if(arr[j]>arr[j+1]){
//             swap(arr, j, j+1);
//         }
//         helper(arr, i, j+1);
//     }
//     else{
//         helper(arr, i+1,0);
//     }
// }

// static void swap(int[] arr, int a, int b){
//     int temp=arr[a];
//     arr[a]=arr[b];
//     arr[b]=temp;
// }

// SELECTION SORT USING RECURSION


// public static void main(String[] args) {
//    // int[] arr={5,2,1,6,3};
//     int[] arr={5,2,1,6,3, 10, 9, 8,11};

//     SelectionSort(arr);
//     System.out.println(Arrays.toString(arr));
// }

// static void SelectionSort(int[] arr){
//     helper(arr, 0, 0);
// }

// static void helper(int[] arr, int i, int j){
//     if(i==arr.length){
//         return ;
//     }

//         int minIndex=min(arr, i);
//         swap(arr, j, minIndex);

//         helper(arr, i+1, i+1);
//     }

// static int min(int[] arr, int i){
//     int min=i;
//     for(int j=i; j<arr.length; j++){
//         if(arr[min]>arr[j]){
//             min=j;
//         }
//     }
//     return min;
// }

// static void swap(int[] arr, int a, int b){
//     int temp=arr[a];
//     arr[a]=arr[b];
//     arr[b]=temp;
// }

// SKIP A CHARACTER

// public static void main(String[] args) {
//   //  String str="abaccadh";
//     String str="abacappeadh";

//     System.out.println(skip4(str));

  //  System.out.println(skip3(str));

  //  System.out.println(skip2(str));

  //  skip("", str);

//}

//METHOD 1
// static void skip(String processed, String Unprocessed){
//     if(Unprocessed.isEmpty()){
//         System.out.println(processed);
//         return;
//     }

//     char ch=Unprocessed.charAt(0);

//     if(ch=='a'){
//         skip(processed, Unprocessed.substring(1));
//     }
//     else{
//         skip(processed + ch, Unprocessed.substring(1));
//     }
// }

//METHOD 2
// static String skip2(String unProcessed){
//     if(unProcessed.isEmpty()){
//         return unProcessed;
//     }

//     char ch=unProcessed.charAt(0);
//     if(ch=='a'){
//         return skip2(unProcessed.substring(1));
//     }
//     else{
//         return ch+ skip2(unProcessed.substring(1));
//     }
// }

// SKIP A STRING
// static String skip3(String unProcessed){
//     if(unProcessed.isEmpty()){
//         return unProcessed;
//     }

//     if(unProcessed.startsWith("apple")){
//         return skip3(unProcessed.substring(5));
//     }
//     else{
//         return  unProcessed.charAt(0)+ skip3(unProcessed.substring(1));
//     }
// }

// static String skip4(String unProcessed){
//     if(unProcessed.isEmpty()){
//         return unProcessed;
//     }

//     if(unProcessed.startsWith("app") && !unProcessed.startsWith("apple")){
//         return skip4(unProcessed.substring(3));
//     }
//     else{
//         return  unProcessed.charAt(0)+ skip4(unProcessed.substring(1));
//     }
// }

}
