package Java.Patterns;

public class Patterns2 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1;i<=2*n-1;i++){
            int c=i<n? i:2*n-i;
            for(int space=1;space<=n-c;space++){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=c;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for(int i=0;i<=2*n;i++){
            for(int j=0;j<=2*n;j++){
                int everyindex=n - Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j));
                System.out.print(everyindex + " ");
            }
            System.out.println();
        }
    }
}
