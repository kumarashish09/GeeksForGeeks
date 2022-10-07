import java.util.Scanner;
/**
//Given an unsorted array A of size N of non-negative integers,
// find a continuous sub-array which adds to a given number S.
public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh size of the array: n");
        int n = sc.nextInt();
        System.out.println("enter the given sum : Sum");
        int Sum = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values of the array");
        for (int i =0; i<a.length;i++){
             a[i]= sc.nextInt();
        }
        check(a,Sum);
    }
    public  static void check(int a[],int Sum) {
        int firstPointer = 0 , secondPointer =0;
        int curr_Sum = 0;
       for (int i =0; i<a.length;i++){
           curr_Sum = a[firstPointer] + a[secondPointer];
           if (curr_Sum == Sum){
               System.out.println("SubArray found ! between index" + firstPointer + " and" + secondPointer);
               for (i = firstPointer;i<=secondPointer;i++){
                   System.out.print(a[i] + " ");
               }
               System.out.println(" ");
               break;
           }
           else if (curr_Sum < Sum){
               secondPointer++;
           }
           else if (curr_Sum > Sum){
               firstPointer++;
           }
       }
        System.out.println("no Subarray found");
    }
} **/

class SubarraySum
{
   //  Returns true if the there is a subarray of arr[] with sum equal to
    //'sum' otherwise returns false. Also, prints the result
    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;
        // Pick a starting point
        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum)
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }
            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        System.out.println("No subarray found");
        return 0;
    }
    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 6,5,10,90,2, 4, 8, 9};
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}



