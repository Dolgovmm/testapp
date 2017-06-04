package ru.dolgov.testapp.main;

import ru.dolgov.testapp.calc.Calculator;

/**
 * @author M. Dolgov
 *         02.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        if (!args[0].isEmpty() && !args[1].isEmpty()) {
            Calculator calculator = new Calculator(args[0], args[1]);
            calculator.calculate();
        } else {
            Calculator.printHelp();
        }
    }
}
