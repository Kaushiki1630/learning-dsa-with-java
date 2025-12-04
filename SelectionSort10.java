import java.util.Arrays;

public class SelectionSort10 {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    static void selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int last=nums.length-i-1;
            int max=maxIndex(nums, 0, last);

            swap(nums, max, last);
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    static int maxIndex(int[] nums, int start, int end){
        int max=start;

        for(int i=start; i<=end; i++){
            if(nums[max] < nums[i]){
                max=i;
            }
        }

        return max; 
    }
}
