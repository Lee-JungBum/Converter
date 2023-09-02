package org.nhnacademy.homework.Converter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Stream;

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
                if (zeroCheck(c, minus)) {
                    i++;
                    continue;
                }
                answer += (c - minus);
//                System.out.println("answer = "+answer);
                i++;
                continue;
            }
            if ((zeroCheck(c, minus))) {
                i++;
                continue;
            }
            answer += ((long) Math.pow(numeralSystem, i - 1) * (c - minus));
//            System.out.println("answer = "+answer);

            i++;

        }
        return answer;
    }

    public static String toNumeral(int value, int numeralSystem) {
        int quotient = value;
        int remainder = 0;
        Stack<Character> answer = new Stack<>();
        if (!numeralSystemCheck(numeralSystem)) {
            throw new IllegalArgumentException("올바르지 않은 값이 들어왔습니다");
        }
        while (quotient != 0) {
            remainder = quotient % numeralSystem;
            quotient = quotient / numeralSystem;
//            System.out.println(quotient + " " + remainder);
            answer.add(intToHexa(remainder));
//            if(quotient==0)
//            {
//                remainder = quotient % numeralSystem;
//                answer.add(intToHexa(remainder));
//                break;
//            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!answer.isEmpty()) {
            stringBuilder.append(answer.pop());
        }
        return stringBuilder.toString();
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
        if (numeralSystem == 2) return binaryCheck(value);
        else if (numeralSystem == 8) return octalCheck(value);
        else if (numeralSystem == 16) return hexadecimalCheck(value);
        return false;
    }

    public static boolean numeralSystemCheck(int numeralSystem) {
        System.out.println(numeralSystem);
        if ((numeralSystem == 2 || numeralSystem == 8 || numeralSystem == 16))
            return true;
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

    private static boolean zeroCheck(int c, int minus) {
        if (c - minus == 0) return true;
        return false;
    }

    public static char intToHexa(int num) {
        if (num < 10)
            return (char) (num + '0');
        return (char) (num - 10 + 'A');
    }
}
