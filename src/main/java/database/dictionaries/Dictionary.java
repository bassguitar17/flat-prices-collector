package database.dictionaries;

import database.dictionaries.loader.file.FileType;

public enum Dictionary {
    CITY("city",  FileType.TXT, "name_city"),
    VOIVODESHIP("voivodeship", FileType.JSON, "name_voivodeship"),
    DISTRICT("district", FileType.XML, "name_district");
    //kolejne niżej

    private final String fileName;
    private final FileType fileExtension;
    private final String tableName;

    Dictionary(String fileName, FileType fileExtension, String tableName) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.tableName = tableName;
    }

    public String getFileName() {
        return fileName;
    }

    public FileType getFileExtension() {
        return fileExtension;
    }

    public String getTableName() {
        return tableName;
    }
}
