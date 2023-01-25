package by.teachmeskills;
/*
Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
*/

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int b = scanner.nextInt();
        int a[] = {22, 1, 23, 0, 5, 25, 34, 109, 7, 27};
        int b_index = -1;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == b) {
                b_index = j;
            }
        }

        if (b_index == -1) {
            System.out.println("Нету");
        } else {
            System.out.println("Есть " + b_index);
        }
    }
}