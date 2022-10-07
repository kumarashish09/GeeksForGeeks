import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array : n");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the array");
        for (int i= 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        reverse(arr);
    }
    public static void  reverse(int a[]){
        int temp;
        int maxLength = a.length -1;
        int midLength = a.length/2;
    for (int i =0;i<midLength;i++){
        temp = a[i];
        a[i]=a[maxLength];
        a[maxLength] = temp;
        maxLength--;
        //u can also use
        //a[i] = a[maxLength-i] // so that you dont need to use maxLength--

    }
    for (int i =0;i<a.length;i++){
        System.out.print(a[i] + " ");
    }
        System.out.println(" ");
    }
}
