package database.dictionaries.loader.file;

public enum FileType {
    JSON("json"),
    TXT("txt"),
    XML("xml");

    private final String extension;

    FileType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
