package homework.question17;


public class Floor {

    double width;
    double length;

    Floor(double width, double length) {

        if (width < 0 && length < 0) {
            this.width = width = 0;
            this.length = length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea(){
        double area;
        area = length * width;
        return area;
    }

}
