package id.sivia.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testTambah() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.tambah(2, 3));
    }

    @Test
    public void testKurang() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.kurang(3, 2));
    }

    @Test
    public void testKali() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.kali(2, 3));
    }

    @Test
    public void testBagi() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.bagi(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testBagiDenganNol() {
        Calculator calculator = new Calculator();
        calculator.bagi(1, 0);
    }
}
