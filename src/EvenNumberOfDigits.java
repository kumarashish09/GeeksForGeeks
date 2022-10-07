import java.util.Scanner;

/**import java.util.Scanner;

/**Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Example:  Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:  Only 1771 contains an even number of digits.*/
/**
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:n");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int flag=0;
        for (int i =0;i<a.length;i++){
            int indexValue=a[i];
            int z = check(indexValue);
            if (z %2 == 0){
                flag++;
            }
        }
        System.out.println(flag);
    }
    public static int check(int v){
        int count =0;
        while (v!=0){
            v = v/10;
            count++;
        }
        return count;
    }
}

*/
class Solution {
    public static int findNumbers(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            int indexValue = nums[i];
            int z = check(indexValue);
            if (z % 2 == 0) {
                flag++;
            }
        }
        return flag;
    }
    public static int check(int n){
        int count =0;
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(findNumbers(a));
    }
}
