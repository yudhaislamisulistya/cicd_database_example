package id.sivia;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        App.main(new String[] {});

        System.setOut(originalOut);

        // Verifikasi output
        String output = outContent.toString().trim();
        assertTrue(output.contains("Sum of first 10 numbers is: 55"));
    }
}
