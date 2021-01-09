package database.dictionaries.loader.file;

import database.DatabaseConstants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TXTFileLoader implements FileLoader{


    @Override
    public List<String> getDataFromFile(String fileName) {
        String data = null;
        List<String> dataInList = new ArrayList<>();
        try {
            data = Files.readString(Path.of(fileName));
            dataInList = putIntoList(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataInList;
    }

    private List<String> putIntoList(String data) {
        String[] dataSplit = data.split(DatabaseConstants.TXT_NEW_LINE);
        return Arrays.asList(dataSplit);
    }
}
