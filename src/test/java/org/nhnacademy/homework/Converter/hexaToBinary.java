package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class hexaToBinary {
    @Test
    @DisplayName("hexaToBinary A")
    void hexaToBinary1() {

        Assertions.assertEquals("1010", Converter.hexadecimalToBinary("A"));
    }

    @Test
    @DisplayName("hexaToBinary 123")
    void hexaToBinary2() {

        Assertions.assertEquals("000100100011", Converter.hexadecimalToBinary("123"));
    }

    @Test
    @DisplayName("hexaToBinary Execption")
    void hexaToBinary3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.hexadecimalToBinary("aa"));
    }

    @Test
    @DisplayName("hexaToBinary 0")
    void hexaToBinary4() {

        Assertions.assertEquals("0", Converter.hexadecimalToBinary("00"));
    }
}
