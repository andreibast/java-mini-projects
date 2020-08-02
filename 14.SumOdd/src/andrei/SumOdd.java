package andrei;

public class SumOdd {

    public static boolean isOdd(int number) {
        return (number % 2 != 0 && number > 0);
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 || end < start) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }


}
