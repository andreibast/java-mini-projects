package andrei;

public class WallArea {
    private double width;
    private double height;

    public WallArea() {
    }

    public WallArea(double width, double height) {
        if(height < 0 && width < 0) {
            this.height = 0;
            this.width = 0;
        } else if(height < 0 && width >= 0) {
            this.height = 0;
            this.width = width;
        } else if(height >= 0 && width < 0) {
            this.height = height;
            this.width = 0;
        } else {
            this.height = height;
            this.width = width;
        }
    }

    // Getters & Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Area
    public double getArea() {
        return height * width;
    }
}
