package Java.Sort.Cyclic_sort;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
//        Only for continuous n number of element in array starting from 1
        int[] arr1={5,4,3,2,1};
        cyclicSort(arr1);

        System.out.println(Arrays.toString(arr1));

    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
}
