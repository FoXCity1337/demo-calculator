package by.itacademy.arsenialeksandrovich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum1(){
        int a = 2;
        int b = 4;
        Calculator calculator = new Calculator();
        int actual = calculator.sum(a,b);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
}
