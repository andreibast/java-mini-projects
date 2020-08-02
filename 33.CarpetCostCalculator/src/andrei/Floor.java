package andrei;

public class Floor {
    private double width;
    private double length;


    public Floor(double width, double length) {
        if(this.width < 0){
            this.width = 0;
            this.length = length;
        }else if(this.length < 0){
            this.width = width;
            this.length = 0;
        }else {
            this.length = length;
            this.width = width;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}
