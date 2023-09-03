package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class binaryToHexa {
    @Test
    @DisplayName("binaryToHexadecimal 1111")
    void binaryToHexadecimal1() {

        Assertions.assertEquals("F", Converter.binaryToHexadecimal("1111"));
    }

    @Test
    @DisplayName("binaryToHexadecimal 01010")
    void binaryToHexadecimal2() {

        Assertions.assertEquals("A", Converter.binaryToHexadecimal("01010"));
    }

    @Test
    @DisplayName("binaryToHexadecimal 11101010")
    void binaryToHexadecimal5() {

        Assertions.assertEquals("EA", Converter.binaryToHexadecimal("11101010"));
    }

    @Test
    @DisplayName("binaryToHexadecimal Execption")
    void binaryToHexadecimal3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.binaryToHexadecimal("G"));
    }

    @Test
    @DisplayName("binaryToHexadecimal 0")
    void binaryToHexadecimal4() {

        Assertions.assertEquals("0", Converter.binaryToHexadecimal("00"));
    }
}
