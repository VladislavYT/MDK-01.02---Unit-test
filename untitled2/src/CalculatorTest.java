import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void plus() {
        Calculator calculator = new Calculator();
        int actual = calculator.plus(2,3);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();
        int actual = calculator.minus(6,3);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void multi() {
        Calculator calculator = new Calculator();
        int actual = calculator.multi(5,5);
        int expected = 25;
        assertEquals(expected,actual);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        int actual = calculator.division(10,5);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void perimeter() {
        Calculator calculator = new Calculator();
        int actual = calculator.perimeter(5);
        int expected = 20;
        assertEquals(expected,actual);
    }
}