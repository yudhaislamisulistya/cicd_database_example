package id.sivia.utils;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testTambah() {
        Calculator calculator = new Calculator();
        int result = calculator.tambah(2, 3);
        assert result == 5 : "Expected 2 + 3 to equal 5";
    }

    @Test
    public void testKurang() {
        Calculator calculator = new Calculator();
        int result = calculator.kurang(5, 3);
        assert result == 2 : "Expected 5 - 3 to equal 2";
    }

    @Test
    public void testKali() {
        Calculator calculator = new Calculator();
        int result = calculator.kali(2, 3);
        assert result == 6 : "Expected 2 * 3 to equal 6";
    }

    @Test
    public void testBagi() {
        Calculator calculator = new Calculator();
        int result = calculator.bagi(6, 3);
        assert result == 2 : "Expected 6 / 3 to equal 2";
    }

    @Test(expected = ArithmeticException.class)
    public void testBagiDenganNol() {
        Calculator calculator = new Calculator();
        calculator.bagi(6, 0);
    }
}
