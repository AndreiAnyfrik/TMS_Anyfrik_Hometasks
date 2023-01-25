package by.teachmeskills.strings;
/*
1. Написать программу со следующим функционалом:
        На вход передать строку (будем считать, что это номер документа). Номер документа имеет формат
         xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        Вывести на экран в одну строку два первых блока по 4 цифры.
        Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать
        с помощью класса StringBuilder).
        Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или
        нет(причем, abc и ABC считается одинаковой последовательностью).
        Проверить начинается ли номер документа с последовательности 555.
        Проверить заканчивается ли номер документа на последовательность 1a2b.
        Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром)
         будут принимать вводимую на вход программы строку.
*/
public class Strings {
    public static void main(String[] args) {
        String DOCUMENT_NUMBER = "1111-aaa-1111-aaa-1a1a".replaceAll("aaa", "***");
        String doc = "1111-aaa-1111-aaa-1a1a";
        String[] blocks = doc.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
        System.out.println(DOCUMENT_NUMBER);
        char[] chars = doc.toCharArray();
        char[] letters = new char[chars.length];
        int i = 0;
        for (char symbol : chars) {
            if (Character.isLetter(symbol)) {
                letters[i] = symbol;
                i++;
            }
        }
        System.out.println("" + letters[0] + letters[1] + letters[2] + "/" + letters[3] + letters[4] + letters[5] + "/"
                + letters[6] + "/" + letters[7]);
        StringBuilder sb = new StringBuilder().append("Letters :" + letters[0] + letters[1] + letters[2] + "/"
                + letters[3] + letters[4] + letters[5] + "/"
                + letters[6] + "/" + letters[7]);
        System.out.println(sb);
        System.out.println(StringUtils.containsAbc("1111-aaa-1111-aaa-1a1a"));
        System.out.println(StringUtils.ended1a2b("1111-aaa-1111-aaa-1a1a"));
        System.out.println(StringUtils.containsAbc("1111-aaa-1111-aaa-1a1a"));
    }
}
