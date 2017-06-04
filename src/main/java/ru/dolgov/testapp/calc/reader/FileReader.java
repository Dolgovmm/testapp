package ru.dolgov.testapp.calc.reader;

import ru.dolgov.testapp.calc.reader.AbstractReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author M. Dolgov
 *         04.06.2017.
 */
public class FileReader extends AbstractReader {
    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() {
        int symbol;
        StringBuilder sb = new StringBuilder();
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
            do {
                symbol = bis.read();
                if (symbol != -1) {
                    sb.append((char) symbol);
                }
            }while(symbol != -1);
            bis.close();
        }
        catch(IOException e){
            System.out.println("Ошибка при чтении файла");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
