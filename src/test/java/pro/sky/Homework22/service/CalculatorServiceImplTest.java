package pro.sky.Homework22.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.Homework22.exception.WrongArgumentException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ContextConfiguration(classes = {CalculatorServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CalculatorServiceImplTest {
    @Autowired
    private CalculatorServiceImpl calculatorServiceImpl;

    /**
     * Method under test: {@link CalculatorServiceImpl#plus(int, int)}
     */
    @Test
    void testPlus() {
        assertEquals(ResultMessagesForTests.TEN_PLUS_TEN, calculatorServiceImpl.plus(10, 10));
    }

    @Test
    void testPlus2(){assertEquals(ResultMessagesForTests.TEN_PLUS_TWO, calculatorServiceImpl.plus(10,2));}
    /**
     * Method under test: {@link CalculatorServiceImpl#minus(int, int)}
     */
    @Test
    void testMinus() {
        assertEquals(ResultMessagesForTests.TEN_MINUS_TEN, calculatorServiceImpl.minus(10, 10));
    }
    @Test
    void testMinus2() {
        assertEquals(ResultMessagesForTests.TEN_MINUS_TWO, calculatorServiceImpl.minus(10, 2));
    }

    /**
     * Method under test: {@link CalculatorServiceImpl#multiply(int, int)}
     */
    @Test
    void testMultiply() {
        assertEquals(ResultMessagesForTests.TEN_MULTIPLY_TEN, calculatorServiceImpl.multiply(10, 10));
    }
    @Test
    void testMultiply2() {
        assertEquals(ResultMessagesForTests.TEN_MULTIPLY_TWO, calculatorServiceImpl.multiply(10,2));
    }

    /**
     * Method under test: {@link CalculatorServiceImpl#divide(int, int)}
     */
    @Test
    void testDivide() {
        assertThrows(WrongArgumentException.class, () -> calculatorServiceImpl.divide(10, 0));
    }
    @Test
    void testDivide2() {
        assertEquals(ResultMessagesForTests.TEN_DIVIDE_TEN, calculatorServiceImpl.divide(10, 10));
    }

    @Test
    void testDivide3() {
        assertEquals(ResultMessagesForTests.TEN_DIVIDE_TWO, calculatorServiceImpl.divide(10, 2));
    }



}

