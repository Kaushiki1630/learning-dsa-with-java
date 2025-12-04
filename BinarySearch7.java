//import java.util.Scanner;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch7 {
    // public static void main(String[] args) {
    //     int[] arr={2,5,7,9,10,34,67,89,90};

    //     System.out.println(BinarySearch(arr, 34));


    // }

    // static int BinarySearch(int[] nums, int target){
    //     int start=nums[0];
    //     int end= nums.length-1;

    //     while(start<end){

    //         int mid=(start+end)/2;

    //         if(target==nums[mid]){
    //             return mid;
    //         }

    //         else if(target>nums[mid]){
    //             start=mid+1;
    //         }

    //         else{
    //             end=mid-1;
    //         }

    //     }
    //     return -1;
    // }

// ORDER AGNOSTIC BINARY SEARCH

// public static void main(String[] args) {
//     int[] arr={90,87,65,54,32,21,19,12,8,6};

//     int target=32;

//     int ans=OrderAgnosticBinarySearch(arr, target);

//     System.out.println(ans);
// }

// static int OrderAgnosticBinarySearch(int[] nums, int target){
//     int start=0;
//     int end=nums.length-1;

//     boolean check= nums[start]>nums[end];

//     while(start<=end){
//         int mid= start+(end-start)/2;

//         if(target==nums[mid]){
//             return mid;
//         }

//         else{
//             if(check){
//                 if(target>nums[mid]){
//                     end=mid-1;
//                 }
//                 else{
//                     start=mid+1;
//                 }
//             }
//             else{
//                 if(target>nums[mid]){
//                     start=mid+1;
//                 }
//                 else{
//                     end=mid-1;
//                 }
//             }
//         }
//     }
//     return -1;
// }


// SEARCHING IN 2-D ARRAYS (MATRICES)

// public static void main(String[] args) {
//     int[][] arr={
//         {18,9,12},
//         {36,-4,91},
//         {44,33,16}
//     };

//     int target=91;

//     int[] ans= Search(arr, target);

//     System.out.println(Arrays.toString(ans));
// }

// static int[] Search(int[][] nums, int target){
//     for(int i=0; i<nums.length; i++){
//         for(int j=0; j<nums[i].length; j++){
//             if(nums[i][j]== target){
//                 return new int[] {i,j};
//             }
//         }
//     }
//     return new int[] {-1, -1};
// }


//QUESTION 1 (ROW COLUMN MATRIX)

public static void main(String[] args) {
    int[][] matrix ={
        // {10,20,30,40},
        // {15,25,35,45},
        // {28,29,37,49},
        // {33,34,38,50}
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    int target=17;

    System.out.println(Arrays.toString(Searching(matrix, target)));


}

static int[] Searching(int[][] nums, int target){
    int r=0;
    int c=nums.length-1;

    while(r<nums.length && c>=0){
        if(nums[r][c]== target){
            return new int[] {r,c};
        }

        if(nums[r][c] <target){
            r++;
        }
        else{
            c--;
        }
    }

    return new int[]{-1,-1};
}

}
