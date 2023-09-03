package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class binaryToOctal {
    @Test
    @DisplayName("binaryToOctal 1111")
    void binaryToOctal1() {

        Assertions.assertEquals("17", Converter.binaryToOctal("1111"));
    }

    @Test
    @DisplayName("binaryToOctal 01010")
    void binaryToOctal2() {

        Assertions.assertEquals("12", Converter.binaryToOctal("01010"));
    }

    @Test
    @DisplayName("binaryToOctal Execption")
    void binaryToOctal3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.binaryToOctal("aa"));
    }

    @Test
    @DisplayName("binaryToOctal 0")
    void binaryToOctal4() {

        Assertions.assertEquals("0", Converter.binaryToOctal("00"));
    }
}
