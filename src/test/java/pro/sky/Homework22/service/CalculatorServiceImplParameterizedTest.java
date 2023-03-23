package pro.sky.Homework22.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

@ContextConfiguration(classes = {CalculatorServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CalculatorServiceImplParameterizedTest {

    @Autowired
    private CalculatorServiceImpl calculatorServiceImpl;

    public static Stream<Arguments> provideParamsForTestsPlus() {
        return Stream.of(
                Arguments.of(10, 10, ResultMessagesForTests.TEN_PLUS_TEN),
                Arguments.of(10, 2, ResultMessagesForTests.TEN_PLUS_TWO));
    }

    public static Stream<Arguments> provideParamsForTestsMinus() {
        return Stream.of(
                Arguments.of(10, 10, ResultMessagesForTests.TEN_MINUS_TEN),
                Arguments.of(10, 2, ResultMessagesForTests.TEN_MINUS_TWO));
    }

    public static Stream<Arguments> provideParamsForTestsMultiply() {
        return Stream.of(
                Arguments.of(10, 10, ResultMessagesForTests.TEN_MULTIPLY_TEN),
                Arguments.of(10, 2, ResultMessagesForTests.TEN_MULTIPLY_TWO));
    }

    public static Stream<Arguments> provideParamsForTestsDivide() {
        return Stream.of(
                Arguments.of(10, 10, ResultMessagesForTests.TEN_DIVIDE_TEN),
                Arguments.of(10, 2, ResultMessagesForTests.TEN_DIVIDE_TWO));
    }
    /**
     * Method under test: {@link CalculatorServiceImpl#plus(int, int)}
     */

    @ParameterizedTest
    @MethodSource("provideParamsForTestsPlus")
    void parameterizedTestPlus(int num1, int num2, String expectedResult) {
        Assertions.assertEquals(calculatorServiceImpl.plus(num1, num2), expectedResult);
    }

    /**
     * Method under test: {@link CalculatorServiceImpl#minus(int, int)}
     */

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMinus")
    void parameterizedTestMinus(int num1, int num2, String expectedResult) {
        Assertions.assertEquals(calculatorServiceImpl.minus(num1, num2), expectedResult);
    }

    /**
     * Method under test: {@link CalculatorServiceImpl#multiply(int, int)}
     */

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMultiply")
    void parameterizedTestMultiply(int num1, int num2, String expectedResult) {
        Assertions.assertEquals(calculatorServiceImpl.multiply(num1, num2), expectedResult);
    }


    /**
     * Method under test: {@link CalculatorServiceImpl#divide(int, int)}
     */

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDivide")
    void parameterizedTestDivide(int num1, int num2, String expectedResult) {
        Assertions.assertEquals(calculatorServiceImpl.divide(num1, num2), expectedResult);
    }


}