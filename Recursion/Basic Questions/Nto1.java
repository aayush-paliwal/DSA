package Java.Recursion.Basic_Question;

public class Nto1 {
    public static void main(String[] args) {
//        Printing numbers from N to 1 by recursion
        printnum1(5);
//        System.out.println();

//        Printing numbers from 1 to N
        printnum2(5);
//        System.out.println();

//        Printing both numbers from N to 1 and 1 to N
//        printnum3(5);

    }

//    Printing numbers from N to 1
    static void printnum1(int n){
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        printnum1(n-1);
    }

//    Printing numbers from 1 to N
    static void printnum2(int n){
        if(n==0){
            return;
        }
        printnum2(n-1);
        System.out.print(n + " ");
    }

//    Printing numbers from N to 1 and 1 to N
    static void printnum3(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printnum3(n-1);
        System.out.print(n + " ");
    }
}
