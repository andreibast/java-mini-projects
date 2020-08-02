package andrei;

public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double first, double second){
            int intFirst = (int)(first*1000);
            int intSecond = (int)(second*1000);

            if (intFirst==intSecond){
                return true;
            }
            return false;
        }
}
