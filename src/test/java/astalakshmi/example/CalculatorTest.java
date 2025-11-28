package astalakshmi.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorLogicTest {

    @Test
    void testAdd() {
        assertEquals(8, CalculatorLogic.add(5, 3));
        assertEquals(-1, CalculatorLogic.add(-2, 1));
        assertEquals(0, CalculatorLogic.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2, CalculatorLogic.subtract(5, 3));
        assertEquals(-3, CalculatorLogic.subtract(2, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(15, CalculatorLogic.multiply(5, 3));
        assertEquals(0, CalculatorLogic.multiply(0, 7));
    }

    @Test
    void testDivide() {
        assertEquals(5, CalculatorLogic.divide(10, 2));
        assertEquals(3, CalculatorLogic.divide(9, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> CalculatorLogic.divide(10, 0));
    }
}


