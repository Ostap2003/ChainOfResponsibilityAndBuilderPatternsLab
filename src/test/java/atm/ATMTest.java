package atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void process() {
        atm.process(200);

        String expRes = "Receive 0 of 5 UAH\nReceive 0 of 10 UAH\nReceive 10 of 20 UAH\n";
        assertEquals(expRes, outContent.toString());
    }

    @Test
    void processSecondTestCase() {
        atm.process(125);

        String expRes = "Receive 1 of 5 UAH\nReceive 0 of 10 UAH\nReceive 6 of 20 UAH\n";
        assertEquals(expRes, outContent.toString());
    }
}