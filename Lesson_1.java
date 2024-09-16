public class Lesson_1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isTrueTenTwenty(5, 11));
        isPositivInt(18);
        System.out.println(isPositivBoolean(-156));


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
}
