package com.teachmeskills.lesson_9.task_2.findbuzzword;

public class FindBuzzword {

    // Находим самое короткое слово в строке и вывести его на экран
    public static void shortWord(String str1) {
        String shortWord = str1;

        for (String word: str1.split(" ")) {
            if (word.length() < shortWord.length()) {
                shortWord = word;
            }
        }
        System.out.println("Самое короткое слово в строке: "+ shortWord +" ("+ shortWord.length() +" символа(ов)");
    }

    // Находим самое длинное слово в строке и вывести его на экран
    public static void longWord(String str1) {
        int count1 = 0;
        String longWord = str1;

        for (String word: str1.split(" ")) {
            if (count1 == 0) {
                if (word.length() < longWord.length()) {
                    longWord = word;
                    count1++;
                }
            } else if (count1 >= 1) {
                if (word.length() > longWord.length()) {
                    longWord = word;
                }
            }
        }
        System.out.println("Самое длинное слово в строке: "+ longWord +" ("+ longWord.length() +" символа(ов))");
    }

    // Находим самое короткое слово в строке, если таких слов несколько, то вывести последнее из них. (короткое)
    public static void lastAndShortestWord(String str2) {
        String short1Word = str2;

        for (String word: str2.split(" ")) {
            if (word.length() < short1Word.length() || word.length() == short1Word.length()) {
                short1Word = word;
            }
        }
        System.out.println("Самое последнее и короткое слово в строке: "+ short1Word +" ("+ short1Word.length() +" символа(ов))");
    }

    // Находим самое длинное слово в строке, если таких слов несколько, то вывести последнее из них. (длинное)
    public static void lastAndLongestWord(String str2) {
        int count2 = 0;
        String long1Word = str2;

        for (String word: str2.split(" ")) {
            if (count2 == 0) {
                if (word.length() < long1Word.length()) {
                    long1Word = word;
                    count2++;
                }
            } else if (count2 >= 1) {
                if (word.length() > long1Word.length() || word.length() == long1Word.length()) {
                    long1Word = word;
                }
            }
        }
        System.out.println("Самое последнее и длинное слово в строке: "+ long1Word +" ("+ long1Word.length() +" символа(ов))");
    }

}
