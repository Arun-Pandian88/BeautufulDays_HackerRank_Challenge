import java.util.Scanner;

public class Solution {

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;

        for (int itr = i; itr <= j; itr++) {
            int rev = reverse(itr);
            int diff = Math.abs(rev - itr);
            if (diff % k == 0) {
                count++;
            }
        }

        System.out.println(count);
        reverse(5);
    }
}
