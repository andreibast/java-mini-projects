package andrei;

public class Main extends DecimalComparator{

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-1.1756, -1.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
