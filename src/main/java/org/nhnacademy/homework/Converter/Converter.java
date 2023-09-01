package org.nhnacademy.homework.Converter;

import java.util.Stack;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Converter {
    private static Stack<Character> stack = new Stack<>();

    private Converter() {

    }

    public static int toDecimal(String value, int numeralSystem) {
        stack.clear();
//        stackAdd(value);
        return 0;
    }

    //    public String toBinary()
//    {
//        return "";
//    }
//    public void binaryToOctal()
//    {
//
//    }
//    public void octalToBinary(){
//
//    }
//    public void binaryToHexadecimal(){
//
//    }
//    public void hexadecimalToBinary(){
//
//    }
//    public void octalToHexadecimal() {
//
//    }
//    public void hexadecimalToOctal() {
//
//    }
    private static void stackAdd(String value, int numeralSystem) {
        for (char a : value.toCharArray()) {
            stack.add(a);
        }
    }

    public static boolean numeralSystemCheck(String value, int numeralSystem) {
        System.out.println(numeralSystem);
        if (numeralSystem == 2)
            return binaryCheck(value);
        else if (numeralSystem == 8)
            return octalCheck(value);
        else if (numeralSystem == 16)
            return hexadecimalCheck(value);
        return false;
    }

    private static boolean hexadecimalCheck(String value) {
        System.out.println("16");
        return Pattern.matches("^[0-9]+|[a-f]+|[A-F]+$", value);
    }

    private static boolean octalCheck(String value) {
        System.out.println("8");
        return Pattern.matches("^[0-7]+$", value);
    }

    private static boolean binaryCheck(String value) {
        System.out.println("2");
        return Pattern.matches("^[0-1]+$", value);
    }
}
