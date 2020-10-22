import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 5;
        int expectedResult = 15;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        double expectedResult = 1.66;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZero() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }


}
