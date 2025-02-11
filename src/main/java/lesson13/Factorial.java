package lesson13;

public class Factorial {
    public long factorialCalculator(long number) {
         long result = 1;

         if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Допустимые значения факториала для типа long 0-20");
         }
         if (number == 0 || number == 1) {
            return 1;
         }
         for (int i = 2; i <= number; i++) {
            result *= i;
         }
         return result;
    }
}
