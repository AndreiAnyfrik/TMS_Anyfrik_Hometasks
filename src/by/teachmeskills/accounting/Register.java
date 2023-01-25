package by.teachmeskills.accounting;
/*Accounting system 
        Создать систему для учета документов.
        Создать класс Регистр, который будет иметь методы:
        сохранения документа в регистре
        предоставление информации о документе

        Система может работать с тремя типами документов:
        1) Контракт на поставку товаров. Содержит поля:
        Номер документа
        Тип товаров
        Количество товаров
        Дата документа

        2) Контракт с сотрудником. Содержит поля:
        Номер документа
        Дата документа
        Дата документа
        Дата окончания контракта
        Имя сотрудника

        3) Финансовая накладная. Содержит поля:
        Итоговая сумма за месяц
        Дата документа
        Номер документа
        Код департамента

        Класс регистр должен содержать внутри себя массив и при добавлении
        документа в регистр этот добавляемый документ должен добавляться в массив;
        Массив для класса регистра должен быть размером 10;
        Для полей "Дата документа" следует использовать тип данных Date;
        В методе предоставления информации о документе следует выводить на экран
        информацию о переданном входным параметром документе;
        Каждый класс для описания документов должен содержать конструктор с
        параметрами и без;
        Для имитации работы системы создайте класс Main, который будет содержать
        только один метод public static void main. В этом методе напишите код для создания каждого из типов документов,
        добавления их в регистр и вывода информации о документе;
        Все классы разместить по пакетам;
        При выполнении задания использовать понятия интерфейсов и абстрактных
        классов.*/

import by.teachmeskills.exception.Exception1a1b;
import by.teachmeskills.exception.Exception555;
import by.teachmeskills.strings.StringUtils;
import by.teachmeskills.exception.AbcException;

public class Register {
    private static final int REGISTER_LENGTH = 10;
    private Document[] listOfDocuments = new Document[REGISTER_LENGTH];
    private int indexInArray = 0;

    public void saveDocument(Document document) throws AbcException, Exception1a1b, Exception555 {
        String docNumber = document.getNumberOfDocument();
        if (!StringUtils.containsAbc(docNumber)) {
            throw new AbcException();
        }
        if (!StringUtils.ended1a2b(docNumber)) {
            throw new Exception1a1b();
        }
        if (!StringUtils.startsWith555(docNumber)) {
            throw new Exception555();
        }
        if (indexInArray < REGISTER_LENGTH) {
            listOfDocuments[indexInArray] = document;
            indexInArray++;
        } else {
            System.out.println("Register is full");
        }
    }
}
