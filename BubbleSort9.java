// public class BubbleSort9 {
//    
//    public static void main(String[] args) {
//     int[] arr={3,1,5,4,10,2};
    
//     BubbleSort(arr);
//     printArray(arr);
//    }
   
//    static void BubbleSort(int[] nums){
//     for(int i=0; i<nums.length; i++){
//         for(int j=1; j< (nums.length-i); j++){
//             if(nums[j]<nums[j-1]){
//                 swap(nums, j,j-1);
//             }
//         }
//     }
//    }

//    static void swap(int[] nums, int a, int b){
//     int temp=nums[a];
//     nums[a]=nums[b];
//     nums[b]=temp;
//    }

//    static void printArray(int[] nums){
//     for(int i=0; i<nums.length; i++){
//         System.out.print(nums[i] + " ");
//     }
//    }
// }

import java.util.Arrays;

public class BubbleSort9 {
    //this code will 
   public static void main(String[] args) {
    int[] arr={3,1,5,4,10,2};
    
    BubbleSort(arr);
    System.out.println(Arrays.toString(arr));
   }
   
   static void BubbleSort(int[] nums){
    boolean swapped;
    for(int i=0; i<nums.length; i++){
        swapped=false;
        for(int j=1; j< (nums.length-i); j++){
            if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                swapped=true;
            }
        }

        if(!swapped){
            break;
        }
    }
   }

}
