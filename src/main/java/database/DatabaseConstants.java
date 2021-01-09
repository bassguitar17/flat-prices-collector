package database;

public class DatabaseConstants {

    //FILES
    public static final String DOT = ".";
    public static final String TXT_NEW_LINE = "\\r\\n";
    public static final String RELATIVE_PATH = "src/main/resources/";
    public static final String CityDictionary = "city.txt";
    public static final String VoivodeshipDictionary = "voivodeship.json";
    //TODO to wyżej do innej serii stałych

    //PROCEDURE
    public static final String DICTIONARY_COLUMN_NAME = "name";
    public static final String PROCEDURE_CALL_START = "{call ";
    public static final String PROCEDURE_CALL_END_TWO_ARGUMENTS = "(?, ?)}";
    public static final String PROCEDURE_CALL_END_ONE_ARGUMENT = "(?)}";
    public static final String PROCEDURE_ADD_DICTIONARY_DATA = "add_dictionary_data";


    //TABLE NAMES
    public static final String DASH = "_";
    public static final String NAME_CITY = "name_city";
    public static final String NAME_VOIVODESHIP = "name_voivodeship";
    public static final String NAME_DISTRICT = "name_district";
    public static final String TYPE_CONSTRUCTION = "type_construction";

    public static final String JSON_FILE_PROPERTY_ARRAY = "array";
    public static final String XML_FILE_PROPERTY_VALUE = "value";



}
