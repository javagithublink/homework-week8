package homework.question19;


public class Circle {

    double radius;

    Circle(double radius) {


        if (radius < 0) {
            this.radius = radius = 0.0;
        } else {
            this.radius = radius;
        }
    }


    public double getRadius() {
        return radius;
    }


    public double getArea(){
        double area = this.radius*this.radius*Math.PI;
        return area;
    }

}
