package andrei;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int num = number;
        if (num < 0){
            return -1;
        }
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if(num % 2 !=0){
                num = num /10;
                continue;
            }
            sum += digit;
            num = num/ 10;
        }
        return sum;
    }
}
