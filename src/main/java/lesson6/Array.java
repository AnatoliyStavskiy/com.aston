package lesson6;

public class Array {
    public static int methodArr(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Данные из ячейки [" + i + "][" + j + "] - " + array[i][j] + ", не могут быть преобразованы в int");
                }
            }
        }
        return sum;
    }
}
