package ru.dolgov.testapp.calc;

import ru.dolgov.testapp.calc.reader.AbstractReader;
import ru.dolgov.testapp.calc.writer.AbstractWriter;
import ru.dolgov.testapp.operation.Operation;

/**
 * @author M. Dolgov
 *         2.06.2017.
 */
public class Calculator {
    private AbstractReader reader;
    private AbstractWriter writer;
    private Operation operation;

    public Calculator(String input, String output) {
        reader = ReaderWriterFactory.gerReader(input);
        writer = ReaderWriterFactory.getWriter(output);
    }

    private String commandParser(String command) {
        String[] commandArray = command.split(" ");
        int[] inputNumbers = new int[commandArray.length - 1];
        try {
            for (int i = 0; i < commandArray.length - 1; i++) {
                inputNumbers[i] = Integer.parseInt(commandArray[i + 1]);
            }
            operation = OperationsFactory.getOperation(commandArray[0]);
            return "Ответ: " + operation.calculate(inputNumbers);
        } catch (NumberFormatException e) {
            return "После команды нужно вводить числа";
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }

    public void calculate() {
        String command;
        String result;

        command = reader.read();
        result = commandParser(command);
        writer.write(result);
    }

    public static void printHelp() {
        System.out.println("Формат команды testapp - - для ввода данных с консоли и вывода на консоль");
        System.out.println("Формат команды testapp <имя входного файла> <имя выходного файла> для раоты с файлами");
        System.out.println("Чтобы сложить все числа введите команду add <числа через пробел>");
        System.out.println("Чтобы умножить все числа введите команду mul <числа через пробел>");
        System.out.println("Чтобы умножить первые два числа и прибавить к ним третье введите команду mulAndAdd <числа через пробел>");
    }

}
