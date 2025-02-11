package lesson13;

import jdk.jfr.Name;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestFactorial {

    @Test
    @Name("Проверка 0!")
    void testFactorialOfZero() {
        assertEquals(Factorial.factorialCalculator(0), 1);
    }

    @Test
    @Name("Проверка 1!")
    void testFactorialOfOne() {
        assertEquals(Factorial.factorialCalculator(1), 1);
    }

    @Test
    @Name("Проверка 5!")
    void testPositiveFactorial() {
        assertEquals(Factorial.factorialCalculator(5), 120);
    }

    @Test
    @Name("Проверка 20!")
    void testMaxPositiveFactorial() {
        assertEquals(Factorial.factorialCalculator(20), 2432902008176640000L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Допустимые значения факториала для типа long 0-20")
    @Name("Проверка -2!")
    void testNegativeFactorial() {
        Factorial.factorialCalculator(-2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Допустимые значения факториала для типа long 0-20")
    @Name("Проверка >20!")
    void testFactorialMoreOfRealType() {
        Factorial.factorialCalculator(21);
    }
}
