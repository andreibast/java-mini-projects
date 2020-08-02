package andrei;

public class LargestPrime {
    public static int getLargestPrime(int a) {
        int p = 2;
        int ret = -1;

        while (a > 1) {
            while (a % p == 0) {
                a /= p;
                ret = p;
            }
            p++;
        }
        return ret;
    }
}
