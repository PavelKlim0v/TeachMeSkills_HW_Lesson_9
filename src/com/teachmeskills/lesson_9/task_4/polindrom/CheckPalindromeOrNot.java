package com.teachmeskills.lesson_9.task_4.polindrom;

import java.util.Scanner;

public class CheckPalindromeOrNot {

    public static void printPalindromeOrNot(String str) {
        String[] arrayStr = str.replace(",","").replace(".","").split(" ");
        Scanner scan = new Scanner(System.in);
        int enterNum = 0;
        boolean correctNum = false;

        while (!correctNum) {
            System.out.print("Введите число(номер слова): ");
            enterNum = scan.nextInt();
            if (enterNum < 0) {
                System.out.println("Введите число больше 0");
            } else if (enterNum > arrayStr.length) {
                System.out.println("Введите число меньше "+ arrayStr.length);
            } else {
                correctNum = true;
            }
        }

        System.out.println(checkPalindromeOrNo(arrayStr,enterNum));
        scan.close();
    }

    private static String checkPalindromeOrNo(String[] arrayStr, int numb) {
        StringBuilder sb = new StringBuilder(arrayStr[numb]);

        if (sb.toString().equals(sb.reverse().toString())) {
            return "Да, это палиндром.";
        } else {
            return "Нет, это не палиндром.";
        }
    }

}
