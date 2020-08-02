package andrei;

public class AllFactors {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for(int i =1; i <=number; i++ ){
            int div1 = number % i;
            int split = div1 / i;
            if(div1 == 0 && split < 1){
                System.out.println(i);
            }
        }
    }
}
