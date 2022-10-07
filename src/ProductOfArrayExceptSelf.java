import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array values");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int product = 1;
        int j = 1;
        for (int i = 0; i < a.length; i++) {
        product = product*a[i];
        }
        for (int i =0;i<a.length;i++){
            System.out.print((product/a[i]) + " ");
        }
    }
    }
