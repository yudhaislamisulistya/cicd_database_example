package id.sivia.utils;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testTambah() {
        Calculator calculator = new Calculator();
        int result = calculator.tambah(2, 3);
        assertEquals("Expected 2 + 3 to equal 5", 5, result);
    }

    @Test
    public void testKurang() {
        Calculator calculator = new Calculator();
        int result = calculator.kurang(5, 3);
        assertEquals("Expected 5 - 3 to equal 2", 2, result);
    }

    @Test
    public void testKali() {
        Calculator calculator = new Calculator();
        int result = calculator.kali(2, 3);
        assertEquals("Expected 2 * 3 to equal 6", 6, result);
    }

    @Test
    public void testBagi() {
        Calculator calculator = new Calculator();
        int result = calculator.bagi(6, 3);
        assertEquals("Expected 6 / 3 to equal 2", 2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testBagiDenganNol() {
        Calculator calculator = new Calculator();
        calculator.bagi(6, 0);
    }
}