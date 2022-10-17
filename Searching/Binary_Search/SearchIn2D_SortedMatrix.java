package Java.Searching.Binary_Search;

import java.util.Arrays;

public class SearchIn2D_SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int tar=10;
        System.out.println(Arrays.toString(search(arr,tar)));

    }

    static int[] binsearch(int[][] arr,int row,int cstart,int cend,int tar){
        while(cstart<=cend){
            int mid=(cstart+cend)/2;
            if(arr[row][mid]==tar){
                return new int[] {row,mid};
            }
            if(arr[row][mid]>tar){
                cend=mid-1;
            }
            else{
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int tar){
        int r=arr.length;
        int c=arr[0].length;
        if(c==0){
            return new int[]{-1,-1};
        }
        if(r==1){
            return binsearch(arr,0,0,c-1,tar);
        }

        int cmid=c/2;
        int rstart=0;
        int rend=r-1;
        while(rstart<(rend-1)){
            int rmid=(rstart+rend)/2;
            if(arr[rmid][cmid]==tar){
                return new int[]{rmid,cmid};
            }
            if(arr[rmid][cmid]<tar){
                rstart=rmid;
            }
            else{
                rend=rmid;
            }
        }

        if(arr[rstart][cmid]==tar){
            return new int[]{rstart,cmid};
        }
        if(arr[rstart+1][cmid]==tar){
            return new int[]{rstart+1,cmid};
        }
        if(tar<=arr[rstart][cmid-1]){
            return binsearch(arr,rstart,0,cmid-1,tar);
        }
        if(tar<=arr[rstart+1][cmid-1]){
            return binsearch(arr,rstart+1,0,cmid-1,tar);
        }
        if(tar>=arr[rstart][cmid+1] && tar<=arr[rstart][c-1]){
            return binsearch(arr,rstart,cmid+1,c-1,tar);
        }
        else{
            return binsearch(arr,rstart+1,cmid+1,c-1,tar);
        }
    }
}
