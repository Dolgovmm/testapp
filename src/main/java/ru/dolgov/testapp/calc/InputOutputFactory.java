package ru.dolgov.testapp.calc;

import ru.dolgov.testapp.calc.reader.AbstractReader;
import ru.dolgov.testapp.calc.reader.ConsoleReader;
import ru.dolgov.testapp.calc.reader.FileReader;
import ru.dolgov.testapp.calc.writer.AbstractWriter;
import ru.dolgov.testapp.calc.writer.ConsoleWriter;
import ru.dolgov.testapp.calc.writer.FileWriter;

/**
 * @author M. Dolgov
 *         04.06.2017.
 */
public class InputOutputFactory {

    public static AbstractReader gerReader(String input) {
        if (input.equals("-")) {
            return new ConsoleReader();
        } else {
            return new FileReader(input);
        }
    }

    public static AbstractWriter getWriter(String output) {
        if (output.equals("-")) {
            return new ConsoleWriter();
        } else {
            return new FileWriter(output);
        }
    }
}
