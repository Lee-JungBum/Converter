package org.nhnacademy.homework;

import java.util.Scanner;
import org.nhnacademy.homework.Converter.Converter;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("형 변환 시킬 모드를 입력하세요.\n 1: 2,8,16 -> 10 \n 2: 10 -> 2,8,16 \n 3: 2 -> 8 \n 4: 2 -> 16 \n 5: 8 -> 2 \n 6: 8 -> 16 \n 7: 16 -> 2 \n 8: 16 -> 8 ");
        Scanner scanner = new Scanner(System.in);
        int mode = scanner.nextInt();
        System.out.println("값을 입력해주세요.");
        String value = scanner.next();
        switch (mode)
        {
            case 1:
                System.out.println("원하는 하신 진수를 입력해 주새요. (2,8,16) ");
                int numeralSystem = scanner.nextInt();
                System.out.println(Converter.toDecimal(value,numeralSystem));
                break;
            case 2:
                System.out.println("결과로 원하시는 진수를 입력해 주새요. (2,8,16) ");
                numeralSystem = scanner.nextInt();
                System.out.println(Converter.toNumeral(Integer.parseInt(value),numeralSystem));
                break;
            case 3:
                System.out.println(Converter.binaryToOctal(value));
                break;
            case 4:
                System.out.println(Converter.binaryToHexadecimal(value));
                break;
            case 5:
                System.out.println(Converter.octalToBinary(value));
                break;
            case 6:
                System.out.println(Converter.octalToHexadecimal(value));
                break;
            case 7:
                System.out.println(Converter.hexadecimalToBinary(value));
                break;
            case 8:
                System.out.println(Converter.hexadecimalToOctal(value));
                break;
        }
    }
}
