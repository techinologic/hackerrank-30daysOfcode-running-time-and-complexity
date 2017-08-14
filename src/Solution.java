import java.util.Scanner;

public class Solution {

    static boolean isPrime(int n) {
        //check if n is a multiple of 2, knowing if even nums are prime is trivial
        if (n % 2 == 0) return false;
        //then check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] nums = new int[input];
        for (int i = 0; i < input; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        for (int i :
                nums) {
            if (isPrime(i)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }
}
