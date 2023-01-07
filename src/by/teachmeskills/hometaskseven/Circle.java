package by.teachmeskills.hometaskseven;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.radius = this.radius * this.radius * Math.PI;
        return radius;
    }

    public double getPerimeter() {
        this.radius = this.radius * 2 * Math.PI;
        return radius;
    }
}
