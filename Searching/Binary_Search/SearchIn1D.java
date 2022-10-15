package Java.Searching.Binary_Search;

public class SearchIn1D {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,10,16,23,28,32};
        int target=23;
        System.out.println(search(arr,target));
    }

    //return the index
    //return -1 if it not exist
    static int search(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;

        //Checking for ascending or descending
        boolean isasc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(tar==arr[mid]){
                return mid;
            }

            if(isasc==true){
                if(tar<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(tar<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
