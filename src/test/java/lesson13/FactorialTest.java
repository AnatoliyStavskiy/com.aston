package lesson13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @DisplayName("Проверка 0!")
    void testFactorialOfZero() {
        assertEquals(1, Factorial.factorialCalculator(0));
    }

    @Test
    @DisplayName("Проверка 1!")
    void testFactorialOfOne() {
        assertEquals(1, Factorial.factorialCalculator(1));
    }

    @Test
    @DisplayName("Проверка 5!")
    void testPositiveFactorial() {
        assertEquals(120, Factorial.factorialCalculator(5));
    }

    @Test
    @DisplayName("Проверка 20!")
    void testMaxPositiveFactorial() {
        assertEquals(2432902008176640000L, Factorial.factorialCalculator(20));
    }

    @Test
    @DisplayName("Проверка -2!")
    void testNegativeFactorial() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorialCalculator(-2));
        assertEquals("Допустимые значения факториала для типа long 0-20", exception.getMessage());

    }

    @Test
    @DisplayName("Проверка >20!")
    void testFactorialMoreOfRealType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorialCalculator(21));
        assertEquals("Допустимые значения факториала для типа long 0-20", exception.getMessage());

    }
}
