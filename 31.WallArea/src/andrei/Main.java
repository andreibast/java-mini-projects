package andrei;

public class Main extends WallArea{

    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(2.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
