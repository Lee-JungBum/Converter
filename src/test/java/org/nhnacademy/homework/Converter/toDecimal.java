package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.stream.Stream;

class toDecimal {

    static Stream<Arguments> value() {
        return Stream.of(
                Arguments.of("1", 2, 1), Arguments.of("1111", 2, 15), Arguments.of("0000", 2, 0), Arguments.of("111111011", 2, 507),
                Arguments.of("1111", 8, 585), Arguments.of("0000", 8, 0), Arguments.of("111111011", 8, 19173897), Arguments.of("73221274", 8, 15540924),
                Arguments.of("1111", 16, 4369), Arguments.of("0000", 16, 0), Arguments.of("111111011", 16, 4581298193L), Arguments.of("73221274", 16, 1931612788),
                Arguments.of("a", 16, 10), Arguments.of("A", 16, 10), Arguments.of("AB123D", 16, 11211325), Arguments.of("ab123d", 16, 11211325));
    }

    @ParameterizedTest(name = "{1}진법 value : {0}변환 = {2}")
    @MethodSource("value")
    @DisplayName("2,8,16진법들 10진법으로 변경하는 테스트")
    void toDecimalListTest(String value, int numeralSystem, long answer) {
        Assertions.assertEquals(answer, Converter.toDecimal(value, numeralSystem));
    }

    @Test
    @DisplayName("2진법 to 10진법 입력예외(3)")
    void binaryToDecimalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("11111311", 2));
    }

    @Test
    @DisplayName("2진법 to 10진법 입력예외(a)")
    void binaryToDecimalException2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("111111a", 2));
    }

    @Test
    @DisplayName("2진법 to 10진법 입력예외(Argument)")
    void binaryToDecimalException3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("o", 2));
    }

    @Test
    @DisplayName("8진법 to 10진법 입력예외(3)")
    void octalToDecimalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("11111911", 8));
    }

    @Test
    @DisplayName("8진법 to 10진법 입력예외(a)")
    void octalToDecimalException2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("111111A", 8));
    }

    @Test
    @DisplayName("8진법 to 10진법 입력예외(Argument)")
    void octalToDecimalException3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("G", 8));
    }

    @Test
    @DisplayName("16진법 to 10진법 입력예외(Argument)")
    void hexaDecimalToDecimalException2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.toDecimal("G", 16));
    }


}