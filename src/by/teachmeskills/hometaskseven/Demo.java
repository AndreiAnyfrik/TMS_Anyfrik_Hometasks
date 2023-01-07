package by.teachmeskills.hometaskseven;
/*Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
        Создать массив из 5 фигур.
        Вывести на экран сумму периметра всех фигур в массиве.*/

public class Demo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3);
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2, 3);

        triangle.getArea();
        triangle.getPerimeter();
        circle.getArea();
        circle.getPerimeter();
        rectangle.getArea();
        rectangle.getPerimeter();

        Figure[] array = new Figure[5];
        array[0] = new Triangle(1, 3, 3);
        array[1] = new Circle(2);
        array[2] = new Rectangle(3, 2);
        array[3] = new Circle(3);
        array[4] = new Triangle(2, 3, 4);
        double areatriangle = 0;
        double arearectangle = 0;
        double areacircle = 0;
        double arearound = 0;
        double areatriangletwo = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                areatriangle = array[i].getPerimeter();
                System.out.println("Периметр треугольника: " + areatriangle);
            } else if (i == 1) {
                areacircle = array[i].getPerimeter();
                System.out.println("Периметр круга: " + areacircle);
            } else if (i == 2) {
                arearectangle = array[i].getPerimeter();
                System.out.println("Периметр прямоугольника: " + arearectangle);
            } else if (i == 3) {
                arearound = array[i].getPerimeter();
                System.out.println("Периметр круга: " + arearound);
            } else if (i == 4) {
                areatriangletwo = array[i].getPerimeter();
                System.out.println("Периметр треугольника: " + areatriangletwo);
            } else if (i == 5) {
                double result = areatriangle + areacircle + arearectangle + arearound + areatriangletwo;
                System.out.println("Общий периметр: " + result);
            }
        }
    }
}
