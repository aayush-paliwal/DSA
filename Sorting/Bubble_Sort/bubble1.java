package Java.Sort.Bubble_sort;

import java.util.Arrays;

public class bubble1 {
    public static void main(String[] args) {
        int[] arr={7,6,8,1,3,4,9};
        int[] arr2={-7,8,-6,-22,12};
        System.out.println(Arrays.toString(sortoptimized(arr2)));
    }

    static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    static int[] sortoptimized(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        return arr;
    }
}
