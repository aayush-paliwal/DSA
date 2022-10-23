package Java.Recursion;

public class Fibonacci_No{
    public static void main(String[] args) {
//        Finding nth fibonacci number
        int a=fibo(6);
        System.out.println(a);
    }

    static int fibo(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int ans=fibo(n-1) + fibo(n-2);
        return ans;
    }
}

