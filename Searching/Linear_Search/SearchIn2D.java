package Java.Searching.Linear_Search;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {24,5,64},
                {4,25,9,55},
                {74,46},
                {47,26,3}
        };
        int target=47;
        int[] ret=search(arr,target);    //return type={row,column}
        System.out.println(Arrays.toString(ret));
        System.out.println(searchmax(arr));
    }

    //Searching in 2-D array

    static int[] search(int[][]array,int tar){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Searching maximum in 2-D array

    static int searchmax(int[][]array){
        int max=array[0][0];
        for(int[] i:array){
            for(int j:i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
}
