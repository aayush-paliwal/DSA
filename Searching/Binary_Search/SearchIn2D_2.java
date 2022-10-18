package Java.Searching.Binary_Search;

import java.util.Arrays;

public class SearchIn2D_2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int tar=11;
        int[] a=search(arr,tar);
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[][] arr,int tar){
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==tar){
                return new int[]{r,c};
            }
            if(arr[r][c]<tar){
                r=r+1;
            }
            if(arr[r][c]>tar){
                c=c-1;
            }
        }
        return new int[]{-1,-1};
    }
}
