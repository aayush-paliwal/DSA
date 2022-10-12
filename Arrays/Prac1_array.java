package Java.Arrays;

import java.util.Arrays;

public class Prac1_array {
    public static void main(String[] args) {
        int[] arr={12,15,-6,-12,6,5,8,24};
        System.out.println("Maximum element is: " + searchMax(arr));
        System.out.println("Maximum element in specified range is: " + searchMaxRange(arr,1,5));


        System.out.println("Before Swap");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("After Swap");
        System.out.println(Arrays.toString(arr));
    }

//    Searching for maximum element in the array
    static int searchMax(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i:arr){
            if(i>=max){
                max=i;
            }
        }
        return max;
    }

    static int searchMaxRange(int[] arr,int start,int end){
        if(start>end){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


//    Swapping an array
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
