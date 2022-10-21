package Java.Sort.Insertion_sort;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr1={5,4,2,1,9};
        insertionSort(arr1);

        int[] arr2={2,5,-1,7,-4,12,0};
        insertionSort(arr2);

        int[] arr3={5,4,4,3,2,1};
        insertionSort(arr3);

        System.out.println(Arrays.toString(arr2));
    }

    static void insertionSort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            int j=i+1;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }
}
