import java.util.Scanner;

/**Little girl Tanya is learning how to decrease a number by one,
 * but she does it wrong with a number consisting of two or more digits.
 * Tanya subtracts one from a number by the following algorithm:
 if the last digit of the number is non-zero, she decreases the number by one;
 if the last digit of the number is zero, she divides the number by 10 (i.e. removes the last digit).
 You are given an integer number n.
 Tanya will subtract one from it k times. Your task is to print the result after all k subtractions.

 It is guaranteed that the result will be positive integer number.
 INput:512 4  (Here k =4)
 Output:50
 explanation:512→511→510→51→50 .
 */
public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: n");
        int n = sc.nextInt();
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        System.out.print(n + " -> " );
        while(k>0) {
            n = Sub(n);
            k--;
            if (k > 0) {
                System.out.print(n + " -> ");
            }
            else {
                System.out.print(n );
            }
        }

    }
    public static int Sub(int n) {
        if ((n%10 == 0)) {
            n = n / 10;
        } else {
            n--;
        }

        return  n;
    }

}
