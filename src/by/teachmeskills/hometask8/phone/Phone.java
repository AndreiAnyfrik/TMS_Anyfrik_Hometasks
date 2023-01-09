package by.teachmeskills.hometask8.phone;
/*
Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и
        weight.
        Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
        Добавить в класс Phone методы:
        receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
        getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс Phone, который принимает на вход три
        параметра для инициализации переменных класса - number, model и
        weight.
        Добавить конструктор, который принимает на вход два параметра для
        инициализации переменных класса - number, model.
        Добавить конструктор без параметров.
       ? Вызвать из конструктора с тремя параметрами конструктор с двумя.
        ?Добавьте перегруженный метод receiveCall, который принимает два
        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
        метод.
       ? Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213). Данный метод принимает
        на вход номера телефонов,которым будет отправлено сообщение.
        Метод выводит на консоль номера этих телефонов.
*/

public class Phone {
    int number;
    String model;
    int weight;
    String name;

    /*Добавить конструктор в класс Phone, который принимает на вход три
   параметра для инициализации переменных класса - number, model и
   weight.*/
    public Phone() {
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone(int number, String model, int weight) {
        this(model, number);
        this.weight = weight;
    }


    /*getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.*/
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*методы:
        receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.*/
    public void receiveCall(String name) {
        System.out.println("Звонит { " + name + " }");
    }

    /*Добавьте перегруженный метод receiveCall, который принимает два
    параметра - имя звонящего и номер телефона звонящего. Вызвать этот
    метод.*/
    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getInfo() {
        return "Information " + this.model + this.number + this.weight;
    }

    /*  Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213). Данный метод принимает
      на вход номера телефонов,которым будет отправлено сообщение.
      Метод выводит на консоль номера этих телефонов.*/
    void sendMessage(int... numbers) {
        System.out.print("Номера телефонов:" + numbers.length);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
