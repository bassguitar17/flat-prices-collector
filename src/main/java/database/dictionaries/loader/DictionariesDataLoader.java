package database.dictionaries.loader;

import database.DatabaseConstants;
import database.dictionaries.Dictionary;
import database.dictionaries.loader.file.FileLoader;
import database.dictionaries.loader.file.FileLoaderFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionariesDataLoader {

    public Map<String, List<String>> loadData(){
        Map<String, List<String>> data = new HashMap<>();
        for(Dictionary dict : Dictionary.values()){
            data.put(dict.getTableName(), getDataFromSpecificFile(dict));
        }
        return data;
    }

    public List<String> getDataFromSpecificFile(Dictionary dictionary){
        FileLoaderFactory fileLoaderFactory = new FileLoaderFactory();
        FileLoader fileLoader = fileLoaderFactory.getFileLoader(dictionary.getFileExtension());
        return fileLoader.getDataFromFile(
                DatabaseConstants.RELATIVE_PATH +
                        dictionary.getFileName() +
                        DatabaseConstants.DOT +
                        dictionary.getFileExtension().getExtension());
    }

}
