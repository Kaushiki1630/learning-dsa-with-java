import java.util.Arrays;

public class MergeSort18 {
    // public static void main(String[] args) {
    //     int[] arr= {5,4,3,2,1,6,0};
    //     int[] ans= MergeSort(arr);
    //     System.out.println(Arrays.toString(ans));
    //     System.out.println(Arrays.toString(arr));
    // }

    // static int[] MergeSort(int[] arr){
    //     if(arr.length==1){
    //         return arr;
    //     }
    //     int mid= arr.length/2;
    //     int[] first=MergeSort(Arrays.copyOfRange(arr, 0, mid));
    //     int[] second=MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    //     return merge(first, second);
    // }

    // static int[] merge(int[] left, int[] right){
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     int[] mix= new int[left.length + right.length];

    //     while(i<left.length && j<right.length){
    //         if(left[i]<right[j]){
    //             mix[k]=left[i];
    //             i++;
    //         }
    //         else{
    //             mix[k]=right[j];
    //             j++;
    //         }

    //         k++;
    //     }

    //     while(i<left.length){
    //         mix[k]=left[i];
    //         i++;
    //         k++;
    //     }

    //     while(j<right.length){
    //         mix[k]=right[j];
    //         j++;
    //         k++;
    //     }

    //     return mix;


    // }

// IN PLACE MERGE SORT

public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    InPlaceMergeSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
}

static void InPlaceMergeSort(int[] arr, int s, int e){
    if(s>=e){
        return;
    }
    int mid= s+(e-s)/2;

    InPlaceMergeSort(arr, s, mid);
    InPlaceMergeSort(arr, mid+1, e);

    merge(arr, s, mid, e);
    }
    
    static void merge(int[] arr, int s,int mid, int e) {
        int[] mix= new int[e-s+1];

        int i=s;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=e){
            if(arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]= arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<=e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length; l++ ){
            arr[s+l]=mix[l];
        }

    }




}


