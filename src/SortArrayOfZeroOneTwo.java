import java.util.Arrays;
import java.util.Scanner;

//The array comtains 0's , 1's,2's
//SOrt the array in ascending order
public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[] = {0,1,0,2,2,2,2,0,1};
        Arrays.sort(a);
        for (int i =0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
}
