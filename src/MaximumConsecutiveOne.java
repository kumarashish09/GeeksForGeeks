import java.util.Scanner;
/**Given a binary array, find the maximum number of consecutive 1s in this array.
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.*/

class Solution1 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int flag =0;int max=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] == 1){
                flag++;
                if (flag>=max){
                    max=flag;
                }
            }
            else if (nums[i] == 0){
                flag =0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: n");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0;i<a.length;i++){
            a[i]  = sc.nextInt();
        }
        findMaxConsecutiveOnes(a);

    }

}

