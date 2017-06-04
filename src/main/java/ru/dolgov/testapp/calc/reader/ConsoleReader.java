package ru.dolgov.testapp.calc.reader;

import ru.dolgov.testapp.calc.reader.AbstractReader;

import java.util.Scanner;

/**
 * @author M. Dolgov
 *         04.06.2017.
 */
public class ConsoleReader extends AbstractReader {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду, числа и нажмите Enter");
        String command = scanner.nextLine();
        return command;
    }
}
