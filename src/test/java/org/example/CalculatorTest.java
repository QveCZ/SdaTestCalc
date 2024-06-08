package org.example;

import org.assertj.core.api.Assertions;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void divide() {
        //given
        Calculator calc = new Calculator();
        //when
        Double result = calc.divide(10D,5D);
        //then
        Assertions.assertThat(result).isEqualTo(2);
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
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(10D, null))
               .isInstanceOf(RuntimeException.class)
               .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(null,null))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Parameter can't be null");

        Assertions.assertThatThrownBy(() -> calc.divide(10D, 0D))
                .isInstanceOf(RuntimeException.class)
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