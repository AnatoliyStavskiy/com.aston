package lesson6;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
        printStackTrace();
    }
}
