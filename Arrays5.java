import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;

public class Arrays5 {
//     public static void main(String[] args) {
//     int[] arr= new int[5];
    
//     System.out.println(arr[4]);

//     String[] nums =new String[10];

//     System.out.println(nums[7]);
// }

// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);

//     String[] str= new String[4];

//     for(int i=0; i<str.length; i++){
//         str[i]=sc.next();
//     }

//     // way 1

//     // for(int i=0; i<str.length; i++){
//     //     System.out.print(str[i] + " ");
//     // }

//     // way 2

//     // for(String str1: str){
//     //     System.out.print(str1 + " ");
//     // }

//     // way 3

//     System.out.println(Arrays.toString(str));

//     // modification

//     str[2]="Kaushiki";

//     System.out.println(Arrays.toString(str));


// //     sc.close();
// }


//  ARRAY PASSING IN FUNCTION

// public static void main(String[] args) {
//     output();
// }

// static void output(){
//     Scanner sc= new Scanner(System.in);

//     String[] str=new String[5];

//     for(int i=0; i<str.length; i++){
//         str[i]=sc.next();
//     }

//     System.out.println(Arrays.toString(str));

//     sc.close();
// }

// 2D array 

// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
   
//     //int[][] arr= new int[3][];

//      int[][] arr={
//         {1,2},
//         {23,4,5,6},
//         {34,6,7,8,8,89}
//     };

//     // for(int i=0; i<arr.length; i++){
//     //     for(int j=0; j<arr[i].length; j++){
//     //     arr[i][j]= sc.nextInt();
//     //     }
//     // }

//     // for(int i=0; i<arr.length; i++){
//     //     for(int j=0; j<arr[i].length; j++){
//     //         System.out.print(arr[i][j] + " ");
//     //     }
//     //     System.out.println();
//     // }

//     for(int i=0; i<arr.length; i++){
//         System.out.println(Arrays.toString(arr[i]));
//     }

//    // System.out.println(Arrays.toString(arr));

//     sc.close();
// }


// 1D arraylist

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the elements: ");

    ArrayList<Integer> al = new ArrayList<>();

    // for(int i=0; i< 5;i++){
    //     al.add(sc.nextInt());
    // }
    
    // for(int i=0; i< 5;i++){
    //     System.out.print(al.get(i) + " ");
    // }

    while(al.size()<5){
        al.add(sc.nextInt());
    }

       System.out.println(al);
    
       sc.close();

}


// QUESTIONS BASED ON ARRAYS
// 1. question    (Swaping in arrays)

// public static void main(String[] args) {
//     int[] arr= {1,2,3,4,5};
//     System.out.println(Arrays.toString(arr));

//     swap(arr, 1, 3);

//     System.out.println(Arrays.toString(arr));
// }

// static void swap(int[] nums, int index1, int index2){
//     int temp=nums[index1];
//     nums[index1]=nums[index2];
//     nums[index2]= temp;
// }


// 2. question    (maximum value of an array)

// public static void main(String[] args) {

//     int[] arr={ 22, 45,1, 78,34,23,9,33};

//     int maxiValue=maximum(arr);
//     System.out.println(maxiValue);
// }

// static int maximum(int[] nums){
//     int max= nums[0];

//     for(int i=0; i<nums.length; i++){
//         if(nums[i]>max){
//             max= nums[i];
//         }
//     }

//     return max;
// }


// 3. quedtion    (Reverse an array)

// public static void main(String[] args) {
//     int[] arr={1,3,23,9,18,56};
//     reverseArray(arr);

//     System.out.println(Arrays.toString(arr));
// }

// static void reverseArray(int[] arr){
//     int start=0;
//     int end= arr.length -1;

//     while(start<end){
//         swap(arr, start, end);
//         start++;
//         end--;
//     }
// }


//     static void swap(int[] arr, int index1, int index2){
//         int temp= arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]= temp;
//     }


}
