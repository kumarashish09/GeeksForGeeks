import java.util.Scanner;
// Java program to rotate an array by
// d elements

class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: n");
       int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //d is number of time to rotate
        rotate.leftRotate(arr, 2, n);
        rotate.printArray(arr, n);
    }
}



