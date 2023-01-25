package by.onliner;

import java.util.Scanner;
/*
Создать трехмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
*/

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int numb = scanner.nextInt();
        int[][][] array = new int[2][2][3];
        array[0][0][0] = 1;
        array[0][0][1] = 2;
        array[0][0][2] = 3;
        array[0][1][0] = 4;
        array[0][1][1] = 5;
        array[0][1][2] = 6;
        array[1][0][0] = 7;
        array[1][0][1] = 8;
        array[1][0][2] = 9;
        array[1][1][0] = 10;
        array[1][1][1] = 11;
        array[1][1][2] = 12;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int f = 0; f < 3; f++) {
                    array[i][j][f] = array[i][j][f] + numb;
                    System.out.println(array[i][j][f]);
                }
            }
        }

    }
}
