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
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @ParameterizedTest
    @DisplayName("입력 타입 확인")
    @ValueSource(
            ints = {2, 8, 16}
    )
    void typeCheck(int numeralSystem) {
        Assertions.assertTrue(Converter.numeralSystemCheck("1111", numeralSystem));
    }

    @Test
    @DisplayName("2진법 재확인")
    void binaryTypeCheck() {
        Assertions.assertTrue(Converter.numeralSystemCheck("000", 2));
    }

    @Test
    @DisplayName("8진법 재확인")
    void octalTypeCheck() {
        Assertions.assertTrue(Converter.numeralSystemCheck("234567", 8));
    }

    @Test
    @DisplayName("16진법 재확인")
    void hexadecimalTypeCheck() {
        Assertions.assertTrue(Converter.numeralSystemCheck("abc24d", 16));
    }

    @Test
    @DisplayName("2진법 틀린경우")
    void binaryTypeCheck2() {
        Assertions.assertFalse(Converter.numeralSystemCheck("00300", 2));
    }

    @Test
    @DisplayName("8진법 틀린경우")
    void octalTypeCheck2() {
        Assertions.assertFalse(Converter.numeralSystemCheck("9999990", 8));
    }

    @Test
    @DisplayName("16진법 틀린경우")
    void hexadecimalTypeCheck2() {
        Assertions.assertFalse(Converter.numeralSystemCheck("10000g", 16));
    }


}
