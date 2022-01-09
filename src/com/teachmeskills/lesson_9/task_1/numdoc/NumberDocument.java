package com.teachmeskills.lesson_9.task_1.numdoc;

import java.util.Scanner;

public class NumberDocument {

    private static String str;

    // 1)Вывести на экран в одну строку два первых блока по 4 цифры
    public static String str1(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = String.valueOf(arr[0]) + arr[1] + arr[2] + arr[3] + arr[9] + arr[10] + arr[11] + arr[12];

        return str;
    }

    // 2)Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
    public static String str2(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = String.valueOf(arr);

        // В задании сказано, что "(каждая буква заменятся на )", на что они заменяются? (я заменил на '*')
        str = str.replace(arr[5],'*').
                            replace(arr[6],'*').
                            replace(arr[7],'*').
                            replace(arr[14],'*').
                            replace(arr[15],'*').
                            replace(arr[16],'*');

        return str;
    }

    // 3)Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static String str3(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = (str.substring(5, 8) +"/"+ str.substring(14, 17) +"/"+
                str.substring(19, 20) +"/"+ str.substring(21)).toLowerCase();

        return str;
    }

    // 4)Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    //   (реализовать с помощью класса StringBuilder)
    public static String str4(StringBuilder enterStr) {
        str = checkStr(String.valueOf(enterStr));

        return "Letters:"+ (str.substring(5, 8) +"/"+ str.substring(14, 17) +"/"+
                str.substring(19, 20) +"/"+ str.substring(21)).toUpperCase();
    }

    // 5)Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или
    //   нет(причем, abc и ABC считается одинаковой последовательностью).
    public static String str5(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = String.valueOf(arr).toLowerCase();

        if (str.contains("abc")) {
            str = "Номер документа содержит \"abc\"";
        } else {
            str = "Номер документа не содержит \"abc\"";
        }

        return str;
    }

    // 5)Проверить начинается ли номер документа с последовательности 555.
    public static String str6(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = String.valueOf(arr).toLowerCase();


        if (str.startsWith("555")) {
            str = "Номер документа начинается \"555\"";
        } else {
            str = "Номер документа не начинается \"555\"";
        }

        return str;
    }

    // 5)Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static String str7(String enterStr) {
        str = checkStr(enterStr);

        char[] arr = str.toCharArray();
        str = String.valueOf(arr).toLowerCase();

        if (str.endsWith("1a2b")) {
            str = "Номер документа заканчивется \"1a2b\"";
        } else {
            str = "Номер документа не заканчивется \"1a2b\"";
        }

        return str;
    }

    private static String checkStr(String enterStr) {
        Scanner scan = new Scanner(System.in);
        String s = "xxxx-yyy-xxxx-yyy-xyxy";
        boolean correctNumDoc = false;

        while (!correctNumDoc) {
            if (enterStr.length() > s.length()) {
                System.out.println("Вы ввели число символов больше, чем нужно!");
                str = scan.nextLine();
                enterStr = str;
            } else if (enterStr.length() < s.length()) {
                System.out.println("Вы ввели меньше символов, чем нужно!");
                str = scan.nextLine();
                enterStr = str;
            } else {
                correctNumDoc = true;
            }
        }

        return enterStr;
    }

}
