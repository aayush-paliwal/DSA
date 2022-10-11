package Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearArray {
    public static void main(String[] args) {
         Scanner inn=new Scanner(System.in);

         // array of primitives
         int[] arr=new int[5];
         int[] arr1={1,2,3,4,5};

         // Declaration of array
         System.out.println("Enter array");
         for(int i=0;i<arr.length;i++){
             System.out.println("Enter element " + (i+1));
             arr[i]=inn.nextInt();
         }
        System.out.println();

         // Printing an array
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println();

         for(int i:arr){
             System.out.print(i + " ");
         }
         System.out.println();

         System.out.print(Arrays.toString(arr));
         System.out.println();

         // array of objects
         String[] str=new String[4];
         System.out.println("enter string:");
         for(int i=0;i<str.length;i++){
             System.out.println("Enter string "+ (i+1));
             str[i]=inn.next();
         }

         for(String i:str){
             System.out.print(i + "->");
         }
         System.out.println();
         System.out.print(Arrays.toString(str));
         System.out.println();
         str[0]="Aayush";         // Changing first element
         System.out.print(Arrays.toString(str));
         System.out.println();



        // practice
        int[] num={4,8,2,6,7};
        int tar=7;
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"->");
        }
        System.out.println();
        for(int i:num){
            System.out.print(i+"->");
        }
        System.out.println();
        // tar=5;
        System.out.println(findele(num,6));
    }
    static int findele(int[] num,int tar){
        for(int i=0;i<num.length;i++){
            if(tar==num[i]){
                return i;
            }
        }
        return -1;
    }
}
