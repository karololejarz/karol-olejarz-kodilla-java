package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        Assert.assertEquals(5.5,calculator.add(3,2.5),0.0);
        Assert.assertEquals(0.5,calculator.sub(3,2.5),0.0);
        Assert.assertEquals(7.5,calculator.mul(3,2.5),0.0);
        Assert.assertEquals(1.5,calculator.div(3,2),0.0);
    }
}
