import java.util.Scanner;

///Given an array arr of N integers.
// Find the contiguous sub-array with maximum sum.
public class  KadaneAlgo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :n");
        int n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(kadane(a));
    }
    public  static int kadane(int arr[]){
        int sumTillHere =0, finalSum = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            sumTillHere += arr[i];
            if (finalSum <sumTillHere){
                finalSum = sumTillHere;
            }
            else if (sumTillHere < 0){
                sumTillHere =0;
            }
        }
        return finalSum;
    }

}
