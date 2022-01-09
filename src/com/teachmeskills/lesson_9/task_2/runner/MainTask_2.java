package com.teachmeskills.lesson_9.task_2.runner;

import com.teachmeskills.lesson_9.task_2.findbuzzword.FindBuzzword;

/**
 *  Задание 2. (Основное задание)
 *    Дана строка произвольной длины с произвольными словами.
 *    Найти самое короткое слово в строке и вывести его на экран.
 *    Найти самое длинное слово в строке и вывести его на экран.
 *    Если таких слов несколько, то вывести последнее из них.
 */

public class MainTask_2 {

    public static void main(String[] args) {
        String s1 = "Человек находит время для всего, что он действительно хочет.";
        String s2 = "Мама мыла раму, апельсин, мандарин, маракуйя.";
        String str1 = s1.replace(",","").replace(".","");
        String str2 = s2.replace(",","").replace(".","");

        // Находим самое короткое слово в строке и вывести его на экран
        FindBuzzword.shortWord(str1);

        // Находим самое длинное слово в строке и вывести его на экран
        FindBuzzword.longWord(str1);

        // Находим самое короткое слово в строке, если таких слов несколько, то вывести последнее из них. (короткое)
        FindBuzzword.lastAndShortestWord(str2);

        // Находим самое длинное слово в строке, если таких слов несколько, то вывести последнее из них. (длинное)
        FindBuzzword.lastAndLongestWord(str2);
    }

}
