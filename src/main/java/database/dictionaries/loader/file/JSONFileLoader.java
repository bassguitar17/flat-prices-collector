package database.dictionaries.loader.file;

import database.DatabaseConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JSONFileLoader implements FileLoader {

    @Override
    public List<String> getDataFromFile(String fileName) {
        List<String> dataInList = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try(Reader reader = new FileReader(fileName)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get(DatabaseConstants.JSON_FILE_PROPERTY_ARRAY);
            for (Object o : array) {
                dataInList.add((String) o);
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return dataInList;
    }
}
