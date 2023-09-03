package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OctalTobinary {
    @Test
    @DisplayName("octaltoBinary 777")
    void octaltoBinary1() {

        Assertions.assertEquals("111111111", Converter.octalToBinary("777"));
    }

    @Test
    @DisplayName("binaryToOctal 123")
    void octaltoBinary2() {

        Assertions.assertEquals("001001011", Converter.octalToBinary("123"));
    }
    @Test
    @DisplayName("binaryToOctal 427")
    void octaltoBinary6() {

        Assertions.assertEquals("100010111", Converter.octalToBinary("427"));
    }
    @Test
    @DisplayName("octaltoBinary Execption")
    void binaryToOctal3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> Converter.octalToBinary("aa"));
    }

    @Test
    @DisplayName("octaltoBinary 0")
    void octaltoBinary3() {

        Assertions.assertEquals("0", Converter.octalToBinary("00"));
    }
}
