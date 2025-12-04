// import java.util.Arrays;

// public class CycleSort12 {
//     public static void main(String[] args) {
//         // int[] arr={3,5,2,1,4};
//         int[] arr={8,7,3,5,3,6,1,4};
//         CycleSort(arr);

//         System.out.println(Arrays.toString(arr));


//     }

//     static void CycleSort(int[] nums){
//         for(int i=0; i<nums.length;){
//             int correctPosition=nums[i]-1;

//             if(nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 i++;
//             }
            
//         }
//     }

//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }


// QUESTION 1 (MISSING NUMBER)

// public class CycleSort12 {
//     public static void main(String[] args) {
//         int[] arr={3,0,1,4};


//         System.out.println(MissingNumber(arr));

//     }

//     static int MissingNumber(int[] nums){
//         int i=0;
//         while(i<nums.length){
//             int correctPosition= nums[i];

//             if(nums[i]<nums.length && nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 i++;
//             }
            
//         }

//         for(int j=0; j<nums.length; j++){
//             if(nums[j] != j){
//             return j;
//         }
//     }
//         return nums.length;


//     }

//     // static int MissingNumber(int[] nums){
//     //     for(int i=0; i<nums.length; i++){
//     //         if(nums[i] != i){
//     //         return i;
//     //     }
//     // }
//     //     return nums.length;
//     // }


//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }


// QUESTION 2 (FIND ALL THE NUMBERS DISAPPEARED IN AN ARRAY)

// import java.util.ArrayList;
// import java.util.List;

// public class CycleSort12 {
//     public static void main(String[] args) {
//         //int[] arr={4,3,2,7,8,2,3,1};
//         int[] arr={8,7,3,5,3,6,1,4};


//         System.out.println(MissingNumber(arr));

//     }

//     static List<Integer> MissingNumber(int[] nums){
//         int i=0;
//         while(i<nums.length){
//             int correctPosition= nums[i]-1;

//             if(nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 i++;
//             }
            
//         }

//         List <Integer> ans= new ArrayList<>();
//         for(int j=0; j<nums.length; j++){
//             if(nums[j] != j+1){
//             ans.add(j+1);
//         }
//     }
//         return ans;


//     }


//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }


// // QUESTION 3 (FIND THE DUPLICATE NUMBER)


// public class CycleSort12 {
//     public static void main(String[] args) {
//         int[] arr={1,3,3,4,2};


//         System.out.println(duplicateNumber(arr));

//     }

//     static int duplicateNumber(int[] nums){
//         int i=0;
//         while(i<nums.length){

//             if(nums[i] != i+1){
//             int correctPosition= nums[i]-1;

//             if(nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 return nums[i];
//             }
//         }
//             else{
//                 i++;
//             }
            
//         }

//         return -1;

//     }


//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }



// QUESTION 4 (FIND ALL THE DUPLICATES IN AN ARRAY)


// import java.util.ArrayList;
// import java.util.List;

// public class CycleSort12 {
//     public static void main(String[] args) {
//         int[] arr={4,3,2,7,8,2,3,1};


//         System.out.println(DuplicateNumbers(arr));

//     }

//     static List<Integer> DuplicateNumbers(int[] nums){
//         int i=0;
//         while(i<nums.length){
//             int correctPosition= nums[i]-1;

//             if(nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 i++;
//             }
            
//         }

//         List <Integer> ans= new ArrayList<>();
//         for(int j=0; j<nums.length; j++){
//             if(nums[j] != j+1){
//             ans.add(nums[j]);
//         }
//     }
//         return ans;

//     }

//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }


//QUESTION 5 (SET MISMATCH)


// import java.util.Arrays;

// public class CycleSort12 {
//     public static void main(String[] args) {
//         //int[] arr={4,3,2,7,8,2,3,1};
//         int[] arr={8,7,3,5,3,6,1,4};
//         //int[] arr={1,1};

//         System.out.println(Arrays.toString(SetMatch(arr)));
       
//     }

//     static void CycleSort(int[] nums){
//         int i=0;
//         while(i<nums.length){
//             int correctPosition= nums[i]-1;

//             if(nums[i] != nums[correctPosition]){
//                 swap(nums, i, correctPosition);
//             }

//             else{
//                 i++;
//             }
            
//         }
//     }

//     static int[] SetMatch(int[] nums){

//         CycleSort(nums);

//         for(int i=0; i<nums.length; i++){
//             if(nums[i] != i+1){
//                 return new int[] {nums[i], i+1};
//             }
//         }

//         return new int[] {-1, -1};
//     }

//     static void swap(int[] nums, int first, int second){
//         int temp=nums[first];
//         nums[first]=nums[second];
//         nums[second]=temp;
//     }
// }


// QUESTION 6 (FIRST MISSING POSITIVE)


public class CycleSort12 {
    public static void main(String[] args) {
        //int[] arr={4,3,2,7,8,2,3,1};
        //int[] arr={8,7,3,5,3,6,1,4};
        //int[] arr={1,1};
        int[] arr={3,4,-1,1};

        // CycleSort(arr);
        // System.out.println(Arrays.toString(arr));
       System.out.println(MissingPositive(arr));
       
    }

    static void CycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctPosition= nums[i]-1;

            if(nums[i]>0 && nums[i] <= nums.length  && nums[i] != nums[correctPosition]){
                swap(nums, i, correctPosition);
            }

            else{
                i++;
            }
            
        }
    }

    static int MissingPositive(int[] nums){

        CycleSort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }

        return nums.length+1;
    }

    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
