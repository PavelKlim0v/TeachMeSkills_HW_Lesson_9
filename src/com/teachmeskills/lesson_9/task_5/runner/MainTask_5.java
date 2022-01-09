package com.teachmeskills.lesson_9.task_5.runner;

import com.teachmeskills.lesson_9.task_5.doublingeachletter.DoublingEachLetter;

/**
 *  Задание 5. (Основное задание)
 *    Дана произвольная строка.
 *    Вывести на консоль новую строку, которой задублированно каждая буква из начальной строки.
 *    Например, "Hello" -> "HHeelllloo"
 */

public class MainTask_5 {

    public static void main(String[] args) {
        DoublingEachLetter del = new DoublingEachLetter();
        System.out.println(del.getDoublingEachLetter("Hello"));
    }

}
