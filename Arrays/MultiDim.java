package Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {
        //int[][] arr=new int[3][];

        //int[][] arr={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // }

        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];

//        Creating multi-dim array
        System.out.println("Enter multi array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }

//        Printing MultiDimension array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        for(int[] a:arr){
            for(int j:a){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
