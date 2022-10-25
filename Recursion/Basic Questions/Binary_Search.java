package Java.Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,10};
        int tar=12;
        int end=arr.length-1;
        int ans=binsearch(arr,tar,0,end);
        System.out.println(ans);
    }

    static int binsearch(int[] arr,int tar,int start,int end){
        int mid=(start+end)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[mid]>tar){
            return binsearch(arr,tar,start,mid-1);
        }
        return binsearch(arr,tar,mid+1,end);
    }
}
