package org.nhnacademy.homework.Converter;

import java.util.Stack;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Converter {
    private static Stack<Character> stack = new Stack<>();

    private Converter() {

    }

    public static long toDecimal(String value, int numeralSystem) {
        long answer = 0;
        stack.clear();
        if (!numeralSystemCheck(value, numeralSystem)) {
            throw new IllegalArgumentException("올바르지 않은 값이 들어왔습니다");
        }
        stackAdd(value);
        int i = 1;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            int minus = base(c);
            if (i == 1) {
                if ((int) c - minus == 0) {
                    i++;
                    continue;
                }
                answer += (c - minus);
//                System.out.println("answer = "+answer);
                i++;
                continue;
            }
            if ((int) c - minus == 0) {
                i++;
                continue;
            }
            answer += ((long) Math.pow(numeralSystem, i - 1) * (c - minus));
//            System.out.println("answer = "+answer);

            i++;

        }
        return answer;
    }

    private static int base(Character c) {
        System.out.println((int) c);
        if ((int) c <= 57) {
            return 48;
        } else if ((int) c <= 70) return 55;
        else {
            return 87;
        }
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
    private static void stackAdd(String value) {
        for (char a : value.toCharArray()) {
            stack.add(a);
        }
    }

    public static boolean numeralSystemCheck(String value, int numeralSystem) {
        System.out.println(numeralSystem);
        if (numeralSystem == 2) return binaryCheck(value);
        else if (numeralSystem == 8) return octalCheck(value);
        else if (numeralSystem == 16) return hexadecimalCheck(value);
        return false;
    }

    private static boolean hexadecimalCheck(String value) {
        return Pattern.matches("^([0-9]*|[a-f]*|[A-F]*)+$", value);
    }

    private static boolean octalCheck(String value) {
        return Pattern.matches("^[0-7]+$", value);
    }

    private static boolean binaryCheck(String value) {
        return Pattern.matches("^[0-1]+$", value);
    }
}
