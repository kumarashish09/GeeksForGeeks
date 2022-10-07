import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the value of N");
        int N = sc.nextInt();
        int a[] = new int[N-1];
        System.out.println("enter the elements of the array");
        for (int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        //Using formula of Arithmetic progression
        int naturalSum = (N * (N+1)/2);
        missingNumber(a,N-1,naturalSum);
    }
    public static void missingNumber(int[] a,int n,int naturalSum){


        int missingNumber;
        int sum =0;
        for (int i =0;i<a.length;i++){
            sum = sum + a[i];
        }
        missingNumber = naturalSum-sum;
        System.out.println("The number missing from array is " + missingNumber);

    }
}
