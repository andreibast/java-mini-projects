package andrei;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse=0;
        int digit=0;
        int num=0;
        num = number;
        while (num != 0){
            digit = num % 10;
            reverse = reverse *10;
            System.out.println("Reverse out1:" +reverse);
            reverse += digit;
            num = num /10;
            System.out.println("Digit out: " + digit);
            System.out.println("Reverse out2:" +reverse);
        }
        if (reverse == number ){
            return true;
        }
        else
            return false;
    }
}
