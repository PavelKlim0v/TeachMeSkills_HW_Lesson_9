package com.teachmeskills.lesson_9.task_3.sameletterinarow;

import java.util.Arrays;

public class SameLetterInARow {

    public static String findSymbolInARow(String str) {
        String[] arrayStr = str.split(" ");
        char[] arrayChar = str.toCharArray();
        int[] arrayNumOfMatches = new int[arrayStr.length];    // кол-во совпадений в "слове", предыдущей буквы(цифры) со следующей

        char lastSymbol = arrayChar[0];
        int sameSymbol = 0;
        int a = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == ' ') {
                arrayNumOfMatches[a] = sameSymbol - 1;    // кол-во совпадений в "слове", предыдущей буквы(цифры) со следующей
                sameSymbol = 0;
                lastSymbol = arrayChar[i + 1];
                a++;
            } else if (lastSymbol == arrayChar[i]) {
                sameSymbol++;
            } else if (lastSymbol != arrayChar[i]) {
                lastSymbol = arrayChar[i];
            }

            if (i == arrayChar.length - 1) {              // это только для последнего "слова"
                arrayNumOfMatches[a] = sameSymbol - 1;    // -1 потому что в цикле добавляется +1 к sameSymbol, но совпадений нет
            }
        }

        System.out.println("Самое большое кол-во повторений у \"слова\" под индексом: "+ findMax(arrayNumOfMatches));
        System.out.println(Arrays.toString(arrayNumOfMatches));
        sameSymbol = findMax(arrayNumOfMatches);          // ищем индекс "слова", в котором максимальное кол-во совпадений букв(цифр)

        return arrayStr[sameSymbol];
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
