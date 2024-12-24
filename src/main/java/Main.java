import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();                          // Задание 1
        checkSumSign();                             // Задание 2
        printColor();                               // Задание 3
        compareNumbers();                           // Задание 4
        limitsTesting(13, -4);                 // Задание 5
        checkPositivity(0);                  // Задание 6
        positiveOrNegative(0);               // Задание 7
        stringQuantity("Привет", 3);     // Задание 8
        leapYear(1900);                             // Задание 9
        zeroReplacement();                          // Задание 10
        fillingArray();                             // Задание 11
        multiplicationNumbers();                    // Задание 12
        fillingWithNumberOne();                     // Задание 13
        arrayGeneration(10, 1);       // Задание 14


    }

    static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = -1;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 41;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    static boolean limitsTesting(int a, int b) {
        return (a + b) > 9 & (a + b) < 21;
    }

    static void checkPositivity(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");
    }

    static boolean positiveOrNegative(int number) {
        return number < 0;
    }

    static void stringQuantity(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    static boolean leapYear(int year) {
        return (year % 4 == 0 & year % 100 != 0 || year % 400 == 0);
    }

    static void zeroReplacement() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void fillingArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void multiplicationNumbers() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void fillingWithNumberOne() {
        int[][] array = new int[5][5];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (i == array.length - j - 1) {
                array[i][j] = 1;
                array[j][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    static int[] arrayGeneration(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
