package Java.Searching.Binary_Search;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int tar=12;
        int i=0;
        int[] arr1=search(arr,tar,i);
        System.out.println(Arrays.toString(arr1));

    }

    static int[] search(int[][] arr,int tar,int i){
//        int a=binsearch(arr[i],tar);
        while(i<arr.length){
            int a=binsearch(arr[i],tar);
            if(a==-1){
                i=i+1;
                return search(arr,tar,i);
            }
            else{
                return new int[]{i,a};
            }
        }
        return new int[]{-1,-1};
    }

    static int binsearch(int[]arr,int tar){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]>tar){
                end=mid-1;
            }
            if(arr[mid]<tar){
                start=mid+1;
            }
        }
        return -1;
    }
}
