import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        // Priprema ulaza
        List<Float> numbers = new ArrayList<>();
        numbers.add(10.0f);
        numbers.add(5.0f);
        numbers.add(2.0f);

        List<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("*");

        // Očekivani rezultat
        float expected = 20.0f; // (10 + 5) * 2 = 20

        // Poziv metode
        Calculator.Calculate(numbers, operations);

        // Provera rezultata
        assertEquals(expected, numbers.get(0), 0.0001);
    }
}
