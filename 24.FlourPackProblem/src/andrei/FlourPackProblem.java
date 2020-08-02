package andrei;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount = bigCount * 5;
        int totalCount = bigCount + smallCount;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0 && totalCount >= goal){
            if (bigCount % goal == 0)
                return true;

            if (smallCount >= goal % bigCount)
                return true;

            if ((bigCount - 5 + smallCount) >= goal)
                return true;
        }
        return false;
    }
}
