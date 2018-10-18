package DesignPatterns.Proxy;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileContentProvider {

    public static List<String> readLines() {
        List<String> lines = new ArrayList<>();
        LineIterator fileContents = null;
        try {
            fileContents = FileUtils.lineIterator(new File("src\\main\\resources\\Produkty.txt"), "UTF-8");
        } catch (IOException e) {
            return lines;
        }
        while (fileContents.hasNext()) {
            lines.add(fileContents.nextLine());
        }
        return lines;
    }

}
