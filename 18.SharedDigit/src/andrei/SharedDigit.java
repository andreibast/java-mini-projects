package andrei;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        while ((number1 >= 10 && number1 <= 99 ) && (number2 >= 10 && number2 <= 99)) {
            int firstDigitNumber1 = number1 / 10;  // 12 / 10 = 1
            int lastDigitNumber1 = number1 % 10;  // 12 % 10 = 2
            int firstDigitNumber2 = number2 / 10;  // 14 / 10 = 1
            int lastDigitNumber2 = number2 % 10;  // 14 % 10 = 4
            if((lastDigitNumber1==lastDigitNumber2) ||(lastDigitNumber1==firstDigitNumber2) || (lastDigitNumber2==firstDigitNumber1) || (firstDigitNumber1==firstDigitNumber2)){
                return true;
            }
            return false;
        }
        return false;
    }
}
