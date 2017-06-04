package ru.dolgov.testapp.main;

import ru.dolgov.testapp.calc.Calculator;

import java.util.Scanner;

/**
 * @author M. Dolgov
 *         02.06.2017.
 */
public class Main {
    public static void main(String[] args) {
//        String result = "";
//
//        if (!args[0].isEmpty() && args[0].equals("-")) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Введите команду, числа и нажмите Enter");
//
//            String command = scanner.nextLine();
//
//            result = Calculator.commandParser(command);
//        }
//
//        if (!args[0].isEmpty() && !args[0].equals("-")) {
//            result = Calculator.commandParser(Calculator.readFromFile(args[0]));
//        }
//
//        if (!args[1].isEmpty() && args[1].equals("-")) {
//            System.out.println(result);
//        }
//
//        if (!args[1].isEmpty() && !args[1].equals("-")) {
//            Calculator.writeToFile(args[1], result);
//        }
//
//        if (args[0].isEmpty() || args[1].isEmpty()) {
//            Calculator.printHelp();
//        }
        if (!args[0].isEmpty() && !args[1].isEmpty()) {
            Calculator calculator = new Calculator(args[0], args[1]);
            calculator.calculate();
        } else {
            Calculator.printHelp();
        }
    }
}
