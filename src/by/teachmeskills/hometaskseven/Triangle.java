package by.teachmeskills.hometaskseven;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формуга Герона
        return area;
    }

    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
