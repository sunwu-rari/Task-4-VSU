import java.util.Scanner;

public class Main {

    static int cprime(int n) {
        int count = 0;
        for (int p = 2; p * p <= n; p++) {
            while (n % p == 0) {
                count++;
                n /= p;
            }
        }
        if (n > 1) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (i > 1 && cprime(i) == 3) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
