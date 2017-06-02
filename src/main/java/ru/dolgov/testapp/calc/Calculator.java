package ru.dolgov.testapp.calc;

import java.io.File;

/**
 * @author M. Dolgov
 *         2.06.2017.
 */
public class Calculator {

    private static int add(int[] inputNumbers) {
        if (inputNumbers.length < 2) {
            throw new ArithmeticException("Неверные входные параметры");
        }
        int result = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            result += inputNumbers[i];
        }
        return result;
    }

    private static int mul(int[] inputNumbers) {
        if (inputNumbers.length < 2) {
            throw new ArithmeticException("Неверные входные параметры");
        }
        int result = 1;
        for (int i = 0; i < inputNumbers.length; i++) {
            result *= inputNumbers[i];
        }
        return result;
    }

    private static int mulAndAdd(int[] inputNumbers) throws ArithmeticException {
        if (inputNumbers.length != 3) {
            throw new ArithmeticException("Неверные входные параметры");
        }
        return inputNumbers[0] * inputNumbers[1] + inputNumbers[2];
    }

    public static void commandParser(String command) {
        String[] commandArray = command.split(" ");
        int[] inputNumbers = new int[commandArray.length - 1];
        try {
            for (int i = 0; i < commandArray.length - 1; i++) {
                inputNumbers[i] = Integer.parseInt(commandArray[i + 1]);
            }
            if (commandArray[0].equals("add")) {
                System.out.println("Ответ: " + add(inputNumbers));
            } else if (commandArray[0].equals("mul")) {
                System.out.println("Ответ: " + mul(inputNumbers));
            } else if (commandArray[0].equals("mulAndAdd")) {
                System.out.println("Ответ: " + mulAndAdd(inputNumbers));
            } else {
                System.out.println("Введена неправильная команда");
            }
        } catch (NumberFormatException e) {
            System.out.println("После команды нужно вводить числа");
        }
    }

    public static void readFile(String fileName) {
        
    }

    public static void printHelp() {
        System.out.println("Чтобы сложить все числа введите команду add <числа через пробел>");
        System.out.println("Чтобы умножить все числа введите команду mul <числа через пробел>");
        System.out.println("Чтобы умножить первые два числа и прибавить к ним третье введите команду mulAndAdd <числа через пробел>");
    }

}
