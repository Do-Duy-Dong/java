
import java.util.Scanner;

public class bai {

    public static boolean check(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (check(n / i)) {
                        res = n / i;
                        break;
                    }
                    if (check(i)) {
                        res = i;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
