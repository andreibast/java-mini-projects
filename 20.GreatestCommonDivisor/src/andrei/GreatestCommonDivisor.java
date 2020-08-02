package andrei;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y){
        while (x>=10 && y>=10){
            for (int i = 1; i <= x; i++){
                int mod1 = x % i;
                int div1 = x / i;
                for(int j=1; j<=y; j++){
                    int mod2 = y % j;
                    int div2 = y / j;
                    if(mod1==0 && mod1==mod2 && div1==div2){
                        return div1;
                    }
                }
            }
            return -1;
        }
        return -1;
    }
}
