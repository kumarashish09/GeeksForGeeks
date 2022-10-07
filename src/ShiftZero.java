import java.util.Scanner;

/**Move all zeroes to end of array-------
 Given an array of random numbers,
 Push all the zero’s of a given array to the end of the array.
 For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. */

public class ShiftZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:n");
        int n= sc.nextInt();
        System.out.println("enter the array");
        int a[]= new int[n];
        for (int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        Shift(a);
    }
    public static void Shift(int a[]){
        int right =0;
        int temp=0;
        for (int left =0;left<a.length;left++){
            if (a[left]!=0){
                continue;
            }
            else {
                right++;
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
