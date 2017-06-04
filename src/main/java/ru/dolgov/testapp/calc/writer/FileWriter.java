package ru.dolgov.testapp.calc.writer;

import java.io.*;

/**
 * @author M. Dolgov
 *         04.06.2017.
 */
public class FileWriter extends AbstractWriter {
    private String fileName;

    public FileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String result) {
        try {
            OutputStream writer = new FileOutputStream(fileName);
            writer.write(result.getBytes("UTF-8"));
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
