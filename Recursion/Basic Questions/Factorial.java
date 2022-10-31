package Java.Recursion.Basic_Question;

public class Factorial {
    public static void main(String[] args) {
//        Finding factorial
        int ans=factorial(0);
        System.out.println(ans);
    }

    static int factorial(int num){
        if(num<=1) {
            return 1;
        }
        return num*factorial(num-1);
    }
}
