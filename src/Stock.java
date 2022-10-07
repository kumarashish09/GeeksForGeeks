import java.util.Scanner;

//Stock Buy and Sell
//The cost of stock on each day is given in an array A[] of size N.
// Find all the days on which you buy and sell the stock so that in between
// those days your profit is maximum.
/**IMP:  If the given array of prices is sorted in decreasing order,
 *  then profit cannot be earned at all.**/
public class Stock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size  of the array:n");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array values");
        for (int i =0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Stock(a,n);
    }
    public static void Stock(int a[] , int n){
        int ptr =0;
        for (int i =ptr;i<a.length-1;i++){

            for (int j =i+1;j<a.length;j++){
                if (a[j]>a[i]){
                    ptr++;
                    continue;
                }
                else {
                    int z =j-1;
                    System.out.println("bought at " + i + " sold at " + z);
                    i =j;
                    ptr++;
                    break;
                }
            }           ///INCOMPLETE
        }
    }
}
