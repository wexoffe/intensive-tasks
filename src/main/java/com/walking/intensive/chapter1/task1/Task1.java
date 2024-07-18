package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {

    static int[] exceptions = {11, 12, 13, 14, 111, 112, 113, 114};

    public static void main(String[] args) {
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String ageString = "Вам ";

        if(isException(age) || endsWith(age, new int[] {0, 5, 6, 7, 8, 9})) {
            ageString += age + " лет";
        } else if(endsWith(age, new int[] {2, 3, 4})) {
            ageString += age + " года";
        } else {
            ageString += age + " год";
        }

        return ageString;
    }

    static boolean isException(int age) {
        for(int i = 0; i < exceptions.length; i++) {
            if(exceptions[i] == age) {
                return true;
            }
        }
        return false;
    }

    static boolean endsWith(int age, int[] lastChar) {
        for(int i = 0; i < lastChar.length; i++) {
            if(age%10 == lastChar[i]) {
                return true;
            }
        }

        return false;
    }
}