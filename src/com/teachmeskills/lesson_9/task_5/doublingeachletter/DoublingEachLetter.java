package com.teachmeskills.lesson_9.task_5.doublingeachletter;

public class DoublingEachLetter {

    public String getDoublingEachLetter(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str = "";
            }
            str += String.valueOf(arr[i]) + arr[i];
        }
        return str;
    }

}
