package lesson13;

import jdk.jfr.Name;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestFactorial {

    Factorial factorial = new Factorial();

    @Test
    @Name("Проверка 0!")
    void testFactorialOfZero() {
        assertEquals(factorial.factorialCalculator(0), 1);
    }

    @Test
    @Name("Проверка 1!")
    void testFactorialOfOne() {
        assertEquals(factorial.factorialCalculator(1), 1);
    }

    @Test
    @Name("Проверка 5!")
    void testPositiveFactorial() {
        assertEquals(factorial.factorialCalculator(5), 120);
    }

    @Test
    @Name("Проверка 20!")
    void testMaxPositiveFactorial() {
        assertEquals(factorial.factorialCalculator(20), 2432902008176640000L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Допустимые значения факториала для типа long 0-20")
    @Name("Проверка -2!")
    void testNegativeFactorial() {
        factorial.factorialCalculator(-2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Допустимые значения факториала для типа long 0-20")
    @Name("Проверка >20!")
    public void testFactorialMoreOfRealType() {
        factorial.factorialCalculator(21);
    }
}
