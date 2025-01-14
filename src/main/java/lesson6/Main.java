package lesson6;

import static lesson6.Array.methodArr;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] invalidArray1 = {{"1", "2", "3", "4"}, {"1", "2", "Error", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] invalidArray2 = {{"1", "2", "3", "4", "FiveElement"}, {"6", "7", "8", "9"}, {"10", "11", "12", "13"}, {"14", "15", "16", "17"}};

        try {
            System.out.println(methodArr(validArray));
            System.out.println(methodArr(invalidArray1));
            System.out.println(methodArr(invalidArray2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.err.println(e.getMessage());
        }
    }
}
