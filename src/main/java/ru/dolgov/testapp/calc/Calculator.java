package ru.dolgov.testapp.calc;

import java.io.*;

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

    public static String commandParser(String command) {
        String[] commandArray = command.split(" ");
        int[] inputNumbers = new int[commandArray.length - 1];
        try {
            for (int i = 0; i < commandArray.length - 1; i++) {
                inputNumbers[i] = Integer.parseInt(commandArray[i + 1]);
            }
            if (commandArray[0].equals("add")) {
                return "Ответ: " + add(inputNumbers);
            } else if (commandArray[0].equals("mul")) {
                return "Ответ: " + mul(inputNumbers);
            } else if (commandArray[0].equals("mulAndAdd")) {
                return "Ответ: " + mulAndAdd(inputNumbers);
            } else {
                return "Введена неправильная команда";
            }
        } catch (NumberFormatException e) {
            return "После команды нужно вводить числа";
        }
    }

    private static String readFile(String fileName) {
        int symbol;
        StringBuffer sb = new StringBuffer();
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
            do {
                symbol = bis.read();
                sb.append((char)symbol);
            }while(symbol != -1);
            bis.close();
        }
        catch(IOException e){
            System.out.println("Ошибка при чтении файла");
        }
        return sb.toString();
    }

    private static void writeFile(String fileName, String result){
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName));
            bos.write(result.getBytes());
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printHelp() {
        System.out.println("Чтобы сложить все числа введите команду add <числа через пробел>");
        System.out.println("Чтобы умножить все числа введите команду mul <числа через пробел>");
        System.out.println("Чтобы умножить первые два числа и прибавить к ним третье введите команду mulAndAdd <числа через пробел>");
    }

}
