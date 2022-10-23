package Java.Recursion;

public class Recursion1 {
//    A function calling another function
//    The body and the definition of the function is same
    public static void main(String[] args) {
        printnum(1);
    }
    static void printnum(int n){
//        Base Condition: Condition where our recursion will stop making new call
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
//        Recursive call
//        Last function call
//        This is known as tail recursion
        printnum(n+1);
    }
}
