import java.util.Scanner;

/**Given an array A of N positive numbers.
 *  The task is to find the position where equilibrium first occurs in the array.
 *  Equilibrium position in an array is a position
 *  such that the sum of elements before it is equal to the sum of elements after it.*/
public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :n");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter the values in array");
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println("equilibrium index is " + i);
        }
        if (n == 2) {
            System.out.println("equilibrium index not possible");
        }
        if (n > 2) {
            int equibPoint = Equilibrium(a);
            System.out.println("equilibrium point found at " + equibPoint);
        }
    }

    public static int Equilibrium(int a[]) {
        int sumBeforeEquib = 0;
        int sumAfterEquib =0;
     for (int i =2;i<a.length;i++){// calculating right sum //here starting index for equib is 1 (one)
         sumAfterEquib += a[i];
     }

     for (int i =1;i<a.length-1;){
         sumBeforeEquib += a[i-1];
        if(sumBeforeEquib == sumAfterEquib){
            return i;
        }
        else {
            sumAfterEquib = sumAfterEquib-a[i+1];
            i++;
        }
     }
    return -1;
    }
}
