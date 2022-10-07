import java.util.Scanner;

/**Given a sorted array of positive integers.
 * Your task is to rearrange  the array elements alternatively
 * i.e first element should be max value, second should be min value,
 * third should be second max, fourth should be second min and so on...
 * Also given is time complexity is O(n) means you have to traverse orray only
 * once(also means you have to take only one array)*/
public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int auxArr[] = new int[n];
        boolean flag = true;
        int startIndex =0;
        int lastIndex = n-1;
        for (int i =0;i<auxArr.length;i++){
            if (flag){
                auxArr[i] = arr[lastIndex];
                lastIndex--;
            }
            else {
                auxArr[i] = arr[startIndex];
                startIndex++;
            }
            flag = !flag;
        }
        for (int i =0;i<n;i++){
            arr[i] = auxArr[i];
            System.out.print(arr[i] + " ");
        }

    }
}
