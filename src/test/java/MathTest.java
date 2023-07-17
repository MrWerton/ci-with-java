import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.notrew.cicd.Math;

public class MathTest {

    @Test
    public void shouldReturnCorrectSum() {
        final int result = Math.sum(10, 20);

        Assertions.assertEquals(30, result);
    }

    @Test
    public void shouldReturnCorrectDifference() {
        final int result = Math.subtract(20, 10);

        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldReturnCorrectProduct() {
        final int result = Math.multiply(10, 20);

        Assertions.assertEquals(200, result);
    }

    @Test
    public void shouldReturnCorrectQuotient() {
        final double result = Math.division(20, 10);

        Assertions.assertEquals(2.0, result);
    }
}
