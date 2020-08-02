package andrei;

public class AreaCalculator {
        public static double area(double radius){
            if(radius < 0){
                return -1;
            }
            double circleResult = radius * radius * Math.PI;
            return circleResult;
        }
        public static double area(double x, double y){
            if((x <0) || (y < 0)){
                return -1;
            }
            double rectangleResult = x * y;
            return rectangleResult;
        }
}
