package by.teachmeskills.hometask7;

/*Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название должности и
        имплементировать этот метод в созданные классы.*/
public class Demo {
    public static void main(String[] args) {
        Printable wr = new Worker();
        wr.print();
        Printable dr = new Director();
        dr.print();
        Printable br = new Bookkeeper();
        br.print();
    }
}
