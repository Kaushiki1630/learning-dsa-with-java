// import java.util.Arrays;
// import java.util.Scanner;

public class LinearSearch6 {
    // public static void main(String[] args) {

        // dynamically

        // int[] arr= new int[5];
        // Scanner sc= new Scanner(System.in);

        // for(int i=0; i<arr.length; i++){
        // arr[i]= sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        

        // statically

        // int[] arr={10,-1,24,6,32,56};
       // int[] arr={};

    // System.out.println(LinearSearch(arr, 7));

//    if(LinearSearch(arr, 7)){
//     System.out.println("Element found in the array.");
//    }

//    else{
//     System.out.println("Element not found in the array.");
//    }
   
   // sc.close();

// }

// RETURNING THE INDEX OF THE ELEMENT IF IT IS FOUND

// static int LinearSearch(int[] nums, int key){

//     for(int i=0; i<nums.length; i++){
//         if(nums[i]==key){
//             return i;
//         }
//     }
//    return -1;
    
// }

// RETURNING THE ELEMENT IF THE ELEMENT IS FOUND IN THE ARRAY

// static int LinearSearch(int[] nums, int key){

//     for(int i=0; i<nums.length; i++){
//         if(nums[i]==key){
//             return nums[i];
//         }
//     }
//    return Integer.MAX_VALUE;
    
// }

// RETURNING THE TRUE OR FALSE AFTER SEARCHING THE ELEMENT IN THE ARRAY


// static boolean LinearSearch(int[] nums, int key){

//     for(int i=0; i<nums.length; i++){
//         if(nums[i]==key){
//             return true;
//         }
//     }
//    return false;
    
// }



// QUESTION 1: SEARCH IN STRINGS
// way 1

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     String[] find= new String[5];

//     for(int i=0; i<find.length; i++){
//         find[i]=sc.nextLine();
//     }

//     sc.close();

//     System.out.println(Arrays.toString(find));

//     System.out.println(SearchInStings(find, "Kaushiki"));
// }

// static int SearchInStings(String[] nums, String target){
//     for(int i=0; i<nums.length; i++){
//         if(nums[i].equals(target)){
//             return i;
//         }
//     }
//         return -1;
// }


// way 2

// public static void main(String[] args) {

//     Scanner sc= new Scanner(System.in);

//     String name=sc.nextLine();

//     sc.close();
    
//     char target='n';

//     System.out.println(SearchInString(name, target));

//     // PRINTS THE STRING INTO ARRAY OF CHARACTER
//     System.out.println(Arrays.toString(name.toCharArray()));
// }

// static boolean SearchInString(String str, char ch){
//     if(str.length()==0){
//         return false;
//     }

//     for(int i=0; i<str.length(); i++){
//         if(ch == str.charAt(i)){
//             return true;
//         }
//     }

//     return false;
// }

//   RETURNS THE INDEX

// static int SearchInString(String str, char ch){
//     if(str.length()==0){
//         return -1;
//     }

//     for(int i=0; i<str.length(); i++){
//         if(ch == str.charAt(i)){
//             return i;
//         }
//     }

//     return -1;
// }

//   returns boolean value using the enhanced for loops

// static boolean SearchInString(String str, char target){
//     if(str.length()==0){
//         return false;
//     }

//     for(char letter: str.toCharArray()){
//         if(target== letter){
//             return true;
//         }
//     }

//     return false;
//     }


// QUESTION 2: SEARCH IN RANGE

// public static void main(String[] args) {
//     int[] arr={ 22,3,34,5,9,48,7,12};

//     int target=34;

//     System.out.println(SearchInRange(arr,1,6, target));
// }

// static int SearchInRange(int[] nums, int start, int end, int target){
//     if(nums.length==0){
//         return -1;
//     }

//     for(int i=start; i<end; i++){
//         if(nums[i]== target){
//             return i;
//         }
//     }
//     return -1;
// }


// SEARCH MINIMUM NUMBER IN AN ARRAY

// public static void main(String[] args) {
//     int[] arr={11,122,3,4,5,12,34,1234,43,421,56};

//     System.out.println(MinimumNumber(arr));
// }

// static int MinimumNumber(int[] nums){
//     int mini=nums[0];
//     if(nums.length==0){
//         return -1;
//     }

//     for(int i=1; i<nums.length; i++){
//         if(nums[i]<mini){
//             mini=nums[i];
//         }
//     }

//     return mini;
          
// }

// }


//  SEARCH IN 2D ARRAYS


// public static void main(String[] args) {
//     int[][] arr={
//         {1,2,3},
//         {4,5,6},
//         {7,8,9}
//     };

//     int target=5;

//   int[] result= SearchIn2DArrays(arr, target);

//   System.out.println(Arrays.toString(result));

//  // System.out.println(SearchIn2DArrays(arr, target));

// //    if(result!= null){
// //     System.out.println("The index is: [" + result[0] + "," + result[1] + "]");
// //    }
// //    else{
// //     System.out.println("Element not found in the array.");
// //    }
// }

// static boolean SearchIn2DArrays(int[][] nums, int target){
//     if(nums.length==0){
//         return false;
//     }

//     for(int i=0; i<nums.length; i++){
//         for(int j=0; j<nums[i]. length; j++){
//             if(nums[i][j]== target){
//                 return true; 
//             }
//         }
//     }

//     return false;
// }


// static int[] SearchIn2DArrays(int[][] nums, int target){
//     if(nums.length==0){
//         return null;
//     }

//     for(int i=0; i<nums.length; i++){
//         for(int j=0; j<nums[i]. length; j++){
//             if(nums[i][j]== target){
//                 return new int[]{i,j}; 
//             }
//         }
//     }
//     return null;
// }


public static void main(String[] args) {
    int[][] arr={
        {1,2,3},
        {4,12,67,9},
        {7,45,32,10}
    };

    System.out.println(MaximumNumber(arr));
}

static int MaximumNumber(int[][] nums){
    int max= nums[0][0];

    if(nums.length==0){
        return -1;
    }

    for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums[i].length; j++){
            if(nums[i][j]>max){
                max=nums[i][j];
            }
        }
    }
    return max;

}

}
