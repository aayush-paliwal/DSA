package Java.Searching.Linear_Search;

public class SearchIn1D {
    public static void main(String[] args) {
        int[] arr={45,1,15,8,3,52,5,6,55};
        int target=55;
        int ans=linearSearch1(arr,target);
        System.out.println("your ele is at index:" + ans);

        int ans2=linearSearch2(arr,target);
        System.out.println("Your element is " + ans2);

        boolean ans3=linearSearch3(arr,target);
        System.out.println(ans3);
    }

    // search the target and return index
    static int linearSearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(ele==target){
                return i;
            }
        }
        return -1;
    }

    // search the target and return element
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int a:arr){
            if(a==target){
                return a;
            }
        }
        return -1;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr ,int target){
        if(arr.length==0){
            return false;
        }
        for(int i:arr){
            if(target==i){
                return true;
            }
        }
        return false;
    }
}
