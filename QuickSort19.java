import java.util.Arrays;

public class QuickSort19 {
    public static void main(String[] args) {
       // int[] arr={6,3,9,5,2,8};
        int[] arr={5,4,3,2,1};
        int n=arr.length;

        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    } 

    static void quickSort(int[] arr, int s, int e){

        if(s<e){
            int pivot= partition(arr, s, e);

            quickSort(arr, s, pivot-1);
            quickSort(arr, pivot+1, e);
        }
    }

    static int partition(int[] arr, int s, int e){
        int pivot=arr[e];
        int i=s-1;

        for(int j=s; j<e; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;

            return i;
    }
}
