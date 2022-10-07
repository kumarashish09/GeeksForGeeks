import java.util.Scanner;

/**Given an array of positive integers. The task is to find inversion count of array.

 Inversion Count : For an array, inversion count indicates how far (or close)
 the array is from being sorted.
 If array is already sorted then inversion count is 0.
 If array is sorted in reverse order that inversion count is the maximum.
 Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.*/
public class InversionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array");
        for (int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int flag =0;
        for (int i =0;i<a.length-1;i++){
            for (int j =1;j<a.length;j++){
                if (a[i]>a[j] && i<j){
                    flag++;
                    System.out.println("Inversion pairs are " + a[i] + " , " + a[j]);
                }
            }
        }
        System.out.println("total number of inversion pairs found is " + flag);
    }
}
