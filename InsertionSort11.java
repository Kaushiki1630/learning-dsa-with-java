import java.util.Arrays;

public class InsertionSort11 {
    public static void main(String[] args) {
       // int[] arr={3,5,1,4,2};
       int[] arr={10,9,8,7,6,6,5};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int j=i+1;

            while(j>0){
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                    j--;
                }

                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
