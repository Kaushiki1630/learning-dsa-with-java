
// QUESTION 1 (CEILING OF A NUMBER)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr={2,3,5,9,14,16,18};

//         System.out.println(Ceiling(arr, 19 ));


//     }

//     static int Ceiling(int[] nums, int target){
//         int start=0;
//         int end=nums.length -1;
//         int mid= start+(end-start)/2;

//         if(target> nums[end]){
//             return -1;
//         }


//         while(start<=end){
//             mid= start+(end-start)/2;


//             if(nums[mid]== target){
//                 return nums[mid];
//             }

//             else if(target> nums[mid]){
//                 start=mid+1;
                
//             }

//             else{
//                 end=mid-1;
//             }
//         }

//         return nums[start];
//     }
// }



// QUESTION 2 (FLOOR OF A NUMBER)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr={2,3,5,9,14,16,18};

//         System.out.println(Floor(arr, 1 ));

//     }

//     static int Floor(int[] nums, int target){
//         int start=0;
//         int end=nums.length -1;
//         int mid= start+(end-start)/2;

//         if(target< nums[start]){
//             return -1;
//         }


//         while(start<=end){
//             mid= start+(end-start)/2;


//             if(nums[mid]== target){
//                 return nums[mid];
//             }

//             else if(target> nums[mid]){
//                 start=mid+1;
                
//             }

//             else{
//                 end=mid-1;
//             }
//         }

//         return nums[end];
//     }
// }


//QUESTION 3 (FIND THE SMALLEST LETTER GREATER THAN TARGET)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         char[] arr={'c','f', 'j'};

//         System.out.println(SmallestLetter(arr, 'c' ));

//     }

//     static char SmallestLetter(char[] nums, char target){
//         int start=0;
//         int end=nums.length -1;
       
//         while(start<=end){
//            int mid= start+(end-start)/2;

//             if(target< nums[mid]){
//                 end=mid-1;   
//             }

//             else{
//                 start=mid+1;
//             }
//         }

//         return nums[start % nums.length];
//     }
// }


// QUESTION 4 (LAST AND FIRST INDEX OF THE TARGET ELEMENT)

// import java.util.Arrays;

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr={5,7,7,8,8,10};
//         int target=8;

//         int[] result=SearchRange(arr, target);

//         System.out.println(Arrays.toString(result));

//         // This statement will give the location of the result instead of showing us the exact answer.
//        // System.out.println(result);
 
//     }

//     static int[] SearchRange(int[] nums, int target){

//         int[] ans={-1, -1};

//         ans[0]=Search(nums, target, true);
//         if(ans[0]!= -1){
//             ans[1]= Search(nums, target, false);
//         }
        
//         return ans;
//     }

//     static int Search(int[] nums, int target, boolean firstIndex){
//         int ans=-1;

//         int start=0;
//         int end=nums.length-1;


//         while(start<=end){
            
//         int mid=start+(end-start)/2;

//             if(target>nums[mid]){
//                 start=mid+1;
//             }

//             else if(target<nums[mid]){
//                 end=mid-1;
//             }

//             else{
//                 ans=mid;

//                 if(firstIndex){
//                     end=mid-1;
//                 }
//                 else{
//                     start=mid+1;
//                 }
//             }
//         }

//         return ans;
//     }
// }


// QUESTION 5 (FIND POSITION OF AN ELEMENT IN A SORTED ARRAY OF INFINITE NUMBERS)


// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {3,5,7,9,10,90,100,130,140,160,170,190};
//         int target=10;
       
//         System.out.println(ans(arr, target));
//     }

//     static int ans(int[] nums, int target){
//         int start=0;
//         int end=1;

//         while(target> nums[end]){
//            int newStart=end+1;
//            // end= end+ (size of box)*2;
//            end=end+(end-start+1)*2;
//            start=newStart;
//          //  end=newEnd;
//         }

//         return BinarySearch(nums, target, start, end);
//     }

//     static int BinarySearch(int[] nums, int target, int start, int end){
//         while(start<=end){
//            int mid= start+(end-start)/2;

//             if(target< nums[mid]){
//                 end=mid-1;   
//             }

//             else if(target> nums[mid]){
//                 start=mid+1;
//             }

//             else{
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }


// QUESTION 6 (PEAK OF THE MOUNTAIN ARRAY)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {2,3,4,5,7,10,9,4,2,1};

//         System.out.println(BinarySearch(arr));
       
//     }

// //     static int Search(int[] nums){
// //         int PeakElement=0;

// //         for(int i=0; i<nums.length; i++){
// //             if(nums[i] > PeakElement){
// //                 PeakElement=nums[i];
// //             }
// //         }

// //         return PeakElement;
        
// //     }
// // }

//     static int BinarySearch(int[] nums){
//         int start=0;
//         int end= nums.length-1;

//         while(start<end){

//             int mid=start+(end-start)/2;

//             if(nums[mid] > nums[mid+1]){
//                 end=mid;
//             }

//             else if(nums[mid] < nums[mid+1]){
//                 start=mid+1;
//             }

//         }
//         return start;
//     }
// }


// QUESTION 7 (SEARCH IN MOUNTAIN ARRAY)


// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {2,3,4,5,7,10,9,4,2,1};

//         System.out.println(SearchElement(arr, 1));

       
//     }

//     static int SearchElement(int[] nums, int target){
//         int PeakElement=BinarySearch(nums);

//         int firstTry= Binary(nums, target, 0, PeakElement);
//         if(firstTry != -1){
//             return firstTry;
//         }

//         int secondTry= OrderAgnosticBinarySearch(nums, target, PeakElement-1, nums.length-1 );
//         return secondTry;

//     }

    
// static int OrderAgnosticBinarySearch(int[] nums, int target, int start, int end){
//     while(start<=end){
//         int mid= start+(end-start)/2;

//         if(target==nums[mid]){
//             return mid;
//         }

//         else if(target>nums[mid]){
//             end=mid-1;
//         }
//         else{
//             start=mid+1;
                
//             }
            
//     }
//     return -1;
// }

//     static int BinarySearch(int[] nums){
//         int start=0;
//         int end= nums.length-1;

//         while(start<end){

//             int mid=start+(end-start)/2;

//             if(nums[mid] > nums[mid+1]){
//                 end=mid;
//             }

//             else if(nums[mid] < nums[mid+1]){
//                 start=mid+1;
//             }

//         }
//         return start;
//     }

    
//     static int Binary(int[] nums, int target, int start, int end){
//         while(start<=end){
//            int mid= start+(end-start)/2;

//             if(target< nums[mid]){
//                 end=mid-1;   
//             }

//             else if(target> nums[mid]){
//                 start=mid+1;
//             }

//             else{
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }


// QUESTION 8 (SEARCH IN ROTATED SORTED ARRAY)


// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {4,5,6,7,0,1,2,3};

//         System.out.println(Search(arr, 10));
// }

//     static int Search(int[] nums, int target){
//     int Pivot=PivotElement(nums);

//     if(Pivot == -1){
//         return BinarySearch(nums, target, 0, nums.length-1);
//     }
    
//         // 3 cases aa jayenge
//         if(nums[Pivot]== target){
//             return Pivot;
//         }
//         if(target >= nums[0]){
//             return BinarySearch(nums, target, 0, Pivot-1);
//         }
//             return BinarySearch(nums, target, Pivot+1 , nums.length-1);
// }

//     static int BinarySearch(int[] nums, int target, int start, int end){
//         while(start<=end){

//             int mid=(start+end)/2;

//             if(target==nums[mid]){
//                 return mid;
//             }

//             else if(target>nums[mid]){
//                 start=mid+1;
//             }

//             else{
//                 end=mid-1;
//             }

//         }
//         return -1;
//     }


// static int PivotElement(int[] nums){
//     int start=0;
//     int end= nums.length-1;

//     while(start<= end){
//         int mid= start+(end-start)/2;

//         // 4 cases will be there

//         if(mid<end && nums[mid]> nums[mid+1]){
//             return mid;
//         }

//         if(mid>start && nums[mid] < nums[mid-1]){
//             return mid-1;
//         }

//         if(nums[start] >= nums[mid]){
//             end=mid-1;
//         }
//         else{
//             start=mid+1;
//         }
//     }
//     return -1;
// }
// }


// QUESTION 9 (ROTATED BINARY SEARCH IN ARRAY WITH DUPLICATE VALUES)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {2,2,9,2,2,2};

//         System.out.println(Search(arr, 2));
// }

//     static int Search(int[] nums, int target){
//     int Pivot=PivotDuplicateElement(nums);

//     if(Pivot == -1){
//         return BinarySearch(nums, target, 0, nums.length-1);
//     }
    
//         // 3 cases aa jayenge
//         if(nums[Pivot]== target){
//             return Pivot;
//         }
//         if(target >= nums[0]){
//             return BinarySearch(nums, target, 0, Pivot-1);
//         }
//             return BinarySearch(nums, target, Pivot+1 , nums.length-1);
// }

//     static int BinarySearch(int[] nums, int target, int start, int end){
//         while(start<=end){

//             int mid=(start+end)/2;

//             if(target==nums[mid]){
//                 return mid;
//             }

//             else if(target>nums[mid]){
//                 start=mid+1;
//             }

//             else{
//                 end=mid-1;
//             }

//         }
//         return -1;
//     }


// static int PivotDuplicateElement(int[] nums){
//     int start=0;
//     int end= nums.length-1;

//     while(start<= end){
//         int mid= start+(end-start)/2;

//         // 4 cases will be there

//         if(mid<end && nums[mid]> nums[mid+1]){
//             return mid;
//         }

//         if(mid>start && nums[mid] < nums[mid-1]){
//             return mid-1;
//         }

//         if(nums[start] == nums[mid] && nums[end] == nums[mid]){
//             if(nums[start] > nums[start+1]){
//                 return start;
//             }
//             start++;
//             if(nums[end] < nums[end-1]){
//                 return end-1;
//             }
//             end--;
//         }

//         else if(nums[start]< nums[mid] || (nums[start] == nums[mid] && nums[mid]> nums[end])){
//             start= mid+1;
//         }

//         else{
//             end=mid-1;
//         }
//     }
//     return -1;
// }
// }


// QUESTION 10 (FIND THE ROTATION COUNT IN ROTATED SORTED ARRAY)

// public class BinarySearchQuestions8 {
//     public static void main(String[] args) {
//         int[] arr= {14,15,18,2,3,6,12};

//         System.out.println(CountRotation(arr));
// }

//     static int CountRotation(int[] nums){
//     int Pivot=PivotDuplicateElement(nums);

//     return Pivot+1;
// }

// static int PivotDuplicateElement(int[] nums){
//     int start=0;
//     int end= nums.length-1;

//     while(start<= end){
//         int mid= start+(end-start)/2;

//         // 4 cases will be there

//         if(mid<end && nums[mid]> nums[mid+1]){
//             return mid;
//         }

//         if(mid>start && nums[mid] < nums[mid-1]){
//             return mid-1;
//         }

//         if(nums[start] == nums[mid] && nums[end] == nums[mid]){
//             if(nums[start] > nums[start+1]){
//                 return start;
//             }
//             start++;
//             if(nums[end] < nums[end-1]){
//                 return end-1;
//             }
//             end--;
//         }

//         else if(nums[start]< nums[mid] || (nums[start] == nums[mid] && nums[mid]> nums[end])){
//             start= mid+1;
//         }

//         else{
//             end=mid-1;
//         }
//     }
//     return -1;
// }
// }


// QUESTION 11 (SPLIT ARRAY LARGEST SUM)

public class BinarySearchQuestions8 {
    public static void main(String[] args) {
       // int[] arr= {14,15,18,2,3,6,12};
       int[] arr={7,2,5,10,8};
        int m=2;

        System.out.println(SplitArray(arr, m));  
}

static int SplitArray(int[] nums, int m){
    int start=0;
    int end=0;

    for(int i=0; i<nums.length; i++){
        start= Math.max(start, nums[i]);
        end= end+nums[i];
    }

    while(start < end){
        int mid= start+(end-start)/2;

        int sum=0;
        int pieces=1;

        for(int num: nums){
            if(sum+ num > mid){
                sum=num;
                pieces++;
            }
            else{
                sum+=num;
            }
        }
        if(pieces > m){
            start=mid+1;
        }
        else{
            end=mid;
        }
    }
    return end;
}
}
