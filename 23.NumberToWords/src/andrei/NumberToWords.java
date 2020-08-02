package andrei;

public class NumberToWords {
    public static void numberToWords(int number){
        int ReverseNumber = reverse(number);
        int numberOfZeroes = (getDigitCount(number) - getDigitCount(ReverseNumber));
        if(ReverseNumber<0){
            System.out.println("Invalid Value");
        } else if(ReverseNumber == 0){
            System.out.println("Zero");
        }
        while(ReverseNumber!=0){
            int lastDigit = ReverseNumber%10 ;
            ReverseNumber = ReverseNumber / 10 ;
            switch(lastDigit){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
            }
        }
        for(int i=0 ; i<numberOfZeroes ; i++){
            System.out.println("Zero");
        }
    }
    public static int reverse(int num){
        int reversedNumber = 0 ;
        while(num!=0){
            int lastdigit = num%10;
            reversedNumber = reversedNumber*10 + lastdigit ;
            num = num / 10 ;
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if(number<0){
            return -1;
        }
        if(number==0){
            count = 1;
        }
        while(number!=0){
            int lastdigit = number%10;
            count++;
            number= number / 10;
        }
        return count;
    }
}
