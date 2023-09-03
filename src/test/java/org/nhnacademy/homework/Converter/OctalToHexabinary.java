package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OctalToHexabinary {
    @Test
    @DisplayName("OctalToHexabinary 777")
    void OctalToHexabinary1() {

        Assertions.assertEquals("1FF", Converter.octalToHexadecimal("777"));
    }

    @Test
    @DisplayName("OctalToHexabinary 123")
    void OctalToHexabinary2() {

        Assertions.assertEquals("53", Converter.octalToHexadecimal("123"));
    }
    @Test
    @DisplayName("OctalToHexabinary 427")
    void OctalToHexabinary3() {

        Assertions.assertEquals("117", Converter.octalToHexadecimal("427"));
    }
    @Test
    @DisplayName("OctalToHexabinary Execption")
    void OctalToHexabinary4() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.octalToHexadecimal("aa"));
    }

    @Test
    @DisplayName("OctalToHexabinary 0")
    void OctalToHexabinary5() {

        Assertions.assertEquals("0", Converter.octalToHexadecimal("00"));
    }
}
