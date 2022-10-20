package Java.Sort.Selection_sort;

import java.util.Arrays;

public class Selection1 {
    public static void main(String[] args) {
        int[] arr={4,1,2,5,7};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxindex=findmax(arr,0,last);
            int temp=arr[last];
            arr[last]=arr[maxindex];
            arr[maxindex]=temp;
        }
    }

    static int findmax(int[] arr,int start,int last){
        int max=start;
        for(int j=0;j<=last;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
        }
        return max;
    }
}
