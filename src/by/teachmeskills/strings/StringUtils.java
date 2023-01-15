package by.teachmeskills.strings;
/*Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или
        нет(причем, abc и ABC считается одинаковой последовательностью).
        Проверить начинается ли номер документа с последовательности 555.
        Проверить заканчивается ли номер документа на последовательность 1a2b.
        Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром)
        будут принимать вводимую на вход программы строку.*/
public class StringUtils {
    public static boolean startsWith555(String docNumber) {
        final String prefix = "555";
        return docNumber.startsWith(prefix);
    }
    public static boolean containsAbc(String docNumber) {
        final String sequence = "abc";
        return docNumber.contains(sequence);
    }
    public static boolean ended1a2b(String docNumber) {
        final String suffix = "1a2b";
        return docNumber.endsWith(suffix);
    }
}
