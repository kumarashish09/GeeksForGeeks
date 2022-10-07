import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the two array a1 and a2");
        int n= sc.nextInt();
        int m = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[m];
        int a3[] = new int[n+m];
        System.out.println("enter the values in the array a1");
        for (int i = 0;i<a1.length;i++){
            a1[i] = sc.nextInt();
        }
        for (int j=0;j<a2.length;j++){
            a2[j] = sc.nextInt();
        }
       // Arrays.sort(a1);
        //Arrays.sort(a2);
          for (int i =0; i<n;i++){
              a3[i] = a1[i];
          }
          int j =0;
          for (int i = n;i<n+m;i++){
              a3[i] = a2[j];
              j++;
          }
          Arrays.sort(a3);
          for (int i=0;i<a3.length;i++){
              //System.out.print(args + " ");
              System.out.print(a3[i] + " ");
          }
        System.out.println(" ");
        }
    }

