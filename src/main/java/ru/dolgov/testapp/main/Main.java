package ru.dolgov.testapp.main;

import ru.dolgov.testapp.calc.Calculator;

import java.util.Scanner;

/**
 * @author M. Dolgov
 *         02.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator.printHelp();

        System.out.println("Введите команду, числа и нажмите Enter");

        String command = scanner.nextLine();

        Calculator.commandParser(command);

    }
}
