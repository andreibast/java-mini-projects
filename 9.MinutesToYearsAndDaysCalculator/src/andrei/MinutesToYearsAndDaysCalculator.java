package andrei;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long calculatedDays = minutes/1440 % 365;
            long calculatedYears = minutes/525600;
            System.out.println(minutes + " min = " + calculatedYears + " y and " +  calculatedDays+ " d");
        }
    }
}
