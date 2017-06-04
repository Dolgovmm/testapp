package ru.dolgov.testapp.calc.writer;

import ru.dolgov.testapp.calc.writer.AbstractWriter;

/**
 * @author M. Dolgov
 *         04.06.2017.
 */
public class ConsoleWriter extends AbstractWriter {
    @Override
    public void write(String result) {
        System.out.println(result);
    }
}
