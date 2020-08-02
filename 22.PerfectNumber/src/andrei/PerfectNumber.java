package andrei;

public class PerfectNumber {
    public static boolean  isPerfectNumber (int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for(int i =1; i <=number; i++){
            int div1 = number % i;
            int split = div1 / i;
            if(div1 == 0 && split < 1 && i != number){
                while (i != number){
                    sum += i;
                    if (sum == number){
                        return true;
                    }
                    break;
                }
                continue;
            }
        }
        return false;
    }
}
