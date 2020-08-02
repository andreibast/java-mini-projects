package andrei;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5)
            System.out.println("Invalid Value");
        else{
            for (int i = 0; i < number; i++) {
                System.out.print("*");
                for (int j = 1; j < number; j++) {
                    if (i == 0 || i == number - 1 || j == number - 1 || j == i || j == ((number - 1) - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
