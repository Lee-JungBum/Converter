package org.nhnacademy.homework.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class toNumeral {
    @Test
    @DisplayName("toNumeral(toHex)")
    void toNumeralTest1()
    {
        Assertions.assertEquals("AAAA",Converter.toNumeral(43690,16));
    }
    @Test
    @DisplayName("toNumeral(toOct)")
    void toNumeralTest2()
    {
        Assertions.assertEquals("7170",Converter.toNumeral(3704,8));
    }
    @Test
    @DisplayName("toNumeral(toBinary)")
    void toNumeralTest3()
    {
        Assertions.assertEquals("10101011",Converter.toNumeral(171,2));
    }
}
