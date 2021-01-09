package database.dictionaries.loader.file;

public class FileLoaderFactory {

    public FileLoader getFileLoader(FileType fileType){
        if(fileType==null){
            return null;//napewno potrzebne???
        }
        switch (fileType){
            case TXT: return new TXTFileLoader();
            case XML: return new XMLFileLoader();
            case JSON: return new JSONFileLoader();
            //
            default: return null;
        }
    }
}
