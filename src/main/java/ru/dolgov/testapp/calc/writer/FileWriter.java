package ru.dolgov.testapp.calc.writer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
}
