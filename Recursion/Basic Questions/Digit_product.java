package Java.Recursion.Basic_Question;

public class Digit_product {
    public static void main(String[] args) {
        int num=3451;
        int ans=product(num);
        System.out.println(ans);
    }

    static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product(n/10);
    }
}
