import java.util.Scanner;

//Given an array arr[] of positive integers of size N.
// Reverse every sub-array of K group elements.
public class ReverseArrayInGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the size of the group : k");
        int k = sc.nextInt();
        System.out.println("enter the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
            for (int i =0;i<a.length;i+=k) {
                int start = i;int temp;
                int end = Math.min(i + k - 1, a.length - 1);
            while (start<=end){
                temp= a[start];
                a[start]= a[end];
                a[end]= temp;
                start++;
                end--;
            }
            }
            for (int i =0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
    }
}