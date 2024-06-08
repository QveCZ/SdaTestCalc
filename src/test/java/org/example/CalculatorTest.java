package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatorTest {

    //@Test
    @ParameterizedTest
    //@CsvSource({"10,5,2", "20,2,10", "25,5,5"})
    @CsvFileSource(resources = "testData.csv")
    void divide(Double number1, Double number2,Double result) {
        //given
        Calculator calc = new Calculator();
        //when
        Double actuallyResult = calc.divide(number1,number2);
        //then
        Assertions.assertThat(actuallyResult).isEqualTo(result);
    }
    @Test
    void divideSouldThrowWhenParametrIsNull(){
        //given
        Calculator calc = new Calculator();
        //when
//        Double resultFirstParameterIsNull = calc.divide(null,5D);
//        Double resultSecondParameterIsNull = calc.divide(10D,null);
//        Double resultDivideByZero = calc.divide(10D,0D);
//        Double resultBothParametersIsNull = calc.divide(null,null);

        //then

        Assertions.assertThatThrownBy(() -> calc.divide(null, 5D))
                .isInstanceOf(Exception.class)
                .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(10D, null))
               .isInstanceOf(Exception.class)
               .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(null,null))
                .isInstanceOf(Exception.class)
                .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(10D, 0D))
                .isInstanceOf(Exception.class)
                .hasMessage("You can divide by zero");

    }

    @Test
    void multiply() {

    }

    @Test
    void total() {
    }

    @Test
    void difference() {
    }
}