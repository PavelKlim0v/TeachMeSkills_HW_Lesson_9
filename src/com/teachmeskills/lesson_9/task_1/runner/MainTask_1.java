package com.teachmeskills.lesson_9.task_1.runner;

import com.teachmeskills.lesson_9.task_1.numdoc.NumberDocument;
import java.util.Scanner;

/**
 *  Задание 1. (Основное задание)
 *    Написать программу со следующим функционалом:
 *    На вход передать строку(будем считать, что это номер документа).
 *    Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 *      1)Вывести на экран в одну строку два первых блока по 4 цифры
 *      2)Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 *      3)Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 *      4)Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
 *        (реализовать с помощью класса StringBuilder)
 *      5)Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или
 *        нет(причем, abc и ABC считается одинаковой последовательностью).
 *      5)Проверить начинается ли номер документа с последовательности 555.
 *      5)Проверить заканчивается ли номер документа на последовательность 1a2b.
 *      Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут
 *        принимать ввводимую на вход программы строку.
 */

public class MainTask_1 {

    public static void main(String[] args) {
        System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.");
        Scanner scan = new Scanner(System.in);

        System.out.println(NumberDocument.str1(scan.nextLine()));
        System.out.println(NumberDocument.str2(scan.nextLine()));
        System.out.println(NumberDocument.str3(scan.nextLine()));
        System.out.println(NumberDocument.str4(new StringBuilder(scan.nextLine())));
        System.out.println(NumberDocument.str5(scan.nextLine()));
        System.out.println(NumberDocument.str6(scan.nextLine()));
        System.out.println(NumberDocument.str7(scan.nextLine()));
        scan.close();

        /*
        0123-abc-4567-def-8g9h
        0123-abc-4567-def-8g9hXyZ123
        */
    }

}
