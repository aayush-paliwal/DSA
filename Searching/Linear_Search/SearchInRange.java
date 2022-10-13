package Java.Searching.Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={4,56,14,56,59,5,89,5,21};
        int ele=14;
        System.out.println("Your element is at index " + searchinrange(arr,ele,2,8));
    }
    static int searchinrange(int[]arr,int ele,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
