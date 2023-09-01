package org.nhnacademy.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.nhnacademy.homework.Converter.Converter;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @ParameterizedTest
    @DisplayName("입력 타입 확인")
    @ValueSource(
            ints = {2,8,16}
    )
    void typeCheck(int numeralSystem)
    {
        Assertions.assertTrue(Converter.numeralSystemCheck("1111",numeralSystem));
    }
}
