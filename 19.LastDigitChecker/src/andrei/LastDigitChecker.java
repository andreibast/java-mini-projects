package andrei;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if ((a >= 10 && a <= 1000)&&(b >= 10 && b <= 1000)&&(c >= 10 && c <= 1000))
        {
            int leftmosta = a % 10;
            int leftmostb = b % 10;
            int leftmostc = c % 10;
            if ((leftmosta == leftmostb) || (leftmosta == leftmostc) || (leftmostb == leftmostc))
            {
                return true;
            }
            return false;
        }

        return false;
    }
    public static boolean isValid(int d)
    {
        if(d>=10 && d<=1000)
        {
            return true;
        }
        return false;
    }
}
