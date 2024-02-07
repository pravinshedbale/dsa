import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];
        int[] pf = new int[n];

        System.out.println("Input Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Approach 1 Brute Force
        // TC : O(n^2)
        // SC : O(n)
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            pf[i] = sum;
        }

        System.out.println("Prefix Sum Array");
        for (int i = 0; i < n; i++) {
            System.out.print(pf[i] + " ");
        }
        System.out.println();

        //
    }
}