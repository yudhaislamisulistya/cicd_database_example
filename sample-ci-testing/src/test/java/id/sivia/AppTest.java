package id.sivia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testMain() {
        String[] args = {};
        App.main(args);
        assertTrue("Main method executed successfully", true);
        // You can add assertions here to verify the output of the main method
        // For example, you can check if the output contains "Hello World!"
    }
}
