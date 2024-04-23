import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class NextDateCalculatorTest {

    @Test
    public void testNextDate_31_12_2023() {
        int[] expected = { 1, 1, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(31, 12, 2023);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNextDate_30_6_2024() {
        int[] expected = { 1, 7, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(30, 6, 2024);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNextDate_28_2_2024() {
        int[] expected = { 29, 2, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(28, 2, 2024);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNextDate_29_2_2024() {
        int[] expected = { 1, 3, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(29, 2, 2024);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNextDate_31_1_2024() {
        int[] expected = { 1, 2, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(31, 1, 2024);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNextDate_15_4_2024() {
        int[] expected = { 16, 4, 2024 };
        int[] result = NextDateCalculator.calculateNextDate(15, 4, 2024);
        assertArrayEquals(expected, result);
    }
}
