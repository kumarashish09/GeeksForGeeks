import java.util.Scanner;

/**Given an array of positive integers. Your task is to find the leaders in the array.
 Note: An element of array is leader
 if it is greater than or equal to all the elements to its right side.
 Also, the rightmost element is always a leader.
 */
//THIS IS AN UPDATED VERSION WITH TIME COMPLEXITY LESS THAN THE PREVIOUS ONE.

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the numbers in the array");
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Leaders(a, n);
    }

    public static void Leaders(int a[], int size) {
        int rightIndex = a[size - 1];
        System.out.print(rightIndex + " ");
        for (int i = size - 2; i >= 0; i--) {
            if (a[i]>rightIndex)
            {
                rightIndex =a[i];
                System.out.print(rightIndex + " ");
            }

        }
    }
}

//old version consist of two loops
/**public class LeadersInArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : n");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the values in the array");
        for (int i =0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        Leader(a,n);
    }
    public static void Leader(int a[],int n)
    {
        int i,j;

        for (i =0;i<a.length-1;i++)
        {
            for (j =i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            if(j==(a.length))
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(a[n-1]);
    }
}*/