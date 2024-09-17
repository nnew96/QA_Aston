package com.qaaston.lesson1;

import java.util.Arrays;
public class Lesson1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isTrueTenTwenty(5, 11));
        isPositivInt(18);
        System.out.println(isPositivBoolean(-156));
        printInt("Привет, мир!", 2);
        System.out.println(isYearVisocosn(2025));
        arrayInt();
        fillEmptyArray(100);
        lessSixMultiplyTwo();
        diagonalArray(10);
        System.out.println(Arrays.toString(initialValue(5,1996)));

    }
    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 2
    public static void checkSumSign() {
        int a = 160;
        int b = 198;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // 3
    public static void printColor() {
        int value = 1528;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100 ) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // 4
    public static void compareNumbers(){
        int a, b;
        a = 15;
        b = 60;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // 5
    public static boolean isTrueTenTwenty (int a, int b) {
        int sum = a + b;
        if (sum >= 10 & sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // 6
    public static String isPositivInt (int number) {
        if (number >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
        return " ";
    }
    // 7
    public static boolean isPositivBoolean (int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }
    // 8
    public static String printInt (String string, int number) {
        for (int i = 0; i<number; i++) {
            System.out.println(string);
        }
        return " ";
    }
    // 9
     public static boolean isYearVisocosn(int year) {
         boolean visocosn;
         if (year % 4 == 0 & year % 100 != 0) {
             visocosn = true;
         } else if (year % 100 == 0) {
             if (year % 400 == 0 ) {
                 visocosn = true;
             } else {
                 visocosn = false;
             }
         } else {
             visocosn = false;
         }
         return visocosn;
     }
     // 10
    public static void arrayInt() {
        int [] array = { 1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < array.length; i++){
            if ( array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    // 11
    public static void fillEmptyArray(int quantity) {
        int [] array = new int [quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    // 12
    public static void lessSixMultiplyTwo() {
        int [] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    // 13
    public static void diagonalArray(int side) {
        int [][] array = new int[side][side];
        for (int i = 0; i < array.length; i++) {
            array [i][i] = 1;
            array [i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    // 14
    public static int[] initialValue (int len, int value) {
        int[] initialVal = new int[len];
        for (int i=0; i < len; i++) {
            initialVal[i] = value;
        }
       return initialVal;
    }

}
