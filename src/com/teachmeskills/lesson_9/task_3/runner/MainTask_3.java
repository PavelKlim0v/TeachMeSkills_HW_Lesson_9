package com.teachmeskills.lesson_9.task_3.runner;

import com.teachmeskills.lesson_9.task_3.sameletterinarow.SameLetterInARow;

/**
 * Задание 3. (Основное задание)
 * Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class MainTask_3 {

    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        System.out.println(SameLetterInARow.findSymbolInARow(str));
    }

}
