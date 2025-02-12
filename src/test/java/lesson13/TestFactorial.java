package lesson13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorial {
    Factorial factorial = new Factorial();

    @Test
    @DisplayName("Проверка 0!")
    void testFactorialOfZero() {
        assertEquals(1, factorial.factorialCalculator(0));
    }

    @Test
    @DisplayName("Проверка 1!")
    void testFactorialOfOne() {
        assertEquals(1, factorial.factorialCalculator(1));
    }

    @Test
    @DisplayName("Проверка 5!")
    void testPositiveFactorial() {
        assertEquals(120, factorial.factorialCalculator(5));
    }

    @Test
    @DisplayName("Проверка 20!")
    void testMaxPositiveFactorial() {
        assertEquals(2432902008176640000L, factorial.factorialCalculator(20));
    }

    @Test
    @DisplayName("Проверка -2!")
    void testNegativeFactorial() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> factorial.factorialCalculator(-2));
        assertEquals("Допустимые значения факториала для типа long 0-20", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка >20!")
    void testFactorialMoreOfRealType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> factorial.factorialCalculator(21));
        assertEquals("Допустимые значения факториала для типа long 0-20", exception.getMessage());
    }
}

