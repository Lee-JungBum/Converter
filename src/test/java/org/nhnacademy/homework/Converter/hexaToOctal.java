package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class hexaToOctal {
    @Test
    @DisplayName("hexaToOctal A")
    void hexaToOctal1() {

        Assertions.assertEquals("12", Converter.hexadecimalToOctal("A"));
    }

    @Test
    @DisplayName("hexaToOctal 123")
    void hexaToOctal2() {

        Assertions.assertEquals("443", Converter.hexadecimalToOctal("123"));
    }

    @Test
    @DisplayName("hexaToOctal Execption")
    void hexaToOctal3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.hexadecimalToOctal("aa"));
    }

    @Test
    @DisplayName("hexaToOctal 0")
    void hexaToOctal4() {

        Assertions.assertEquals("0", Converter.hexadecimalToOctal("00"));
    }
}
