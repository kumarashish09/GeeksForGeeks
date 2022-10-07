import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Given arrival and departure times of all trains that reach a railway station.
// Your task is to find the minimum number of platforms required for the railway station
// so that no train waits.
//Note: Consider that all the trains arrive on the same day and leave on the same day.
// Also, arrival and departure times will not be same for a train,
// but we can have arrival time of one train equal to departure of the other.
// In such cases, we need different platforms, i.e at any given instance of time,
// same platform can not be used for both departure of a train and arrival of another.
//Note: Time intervals are in the 24-hour format(HHMM)

/**public class MinimumPlatforms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of trains:n");
        int n = sc.nextInt();
        int arrivalTime[] = new int[n];
        int departureTime[] = new int[n];
        for (int i=0;i<n;i++){
            arrivalTime[i] = sc.nextInt();
        }
        for (int i =0; i<n;i++){
            departureTime[i] = sc.nextInt();
        }
        Arrays.sort(arrivalTime);
        Arrays.sort(departureTime);
        int flag =0;
        for (int i =0;i<n-1;i++){
            for (int j = i+1;j<n;j++){
                if (arrivalTime[i]==departureTime[j] || arrivalTime[j]<departureTime[i])
                {
                    flag++;
                }
            }
        }
        System.out.println("Number of platforms needed " + flag);
    }
}
**/