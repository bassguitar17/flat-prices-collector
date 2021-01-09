package database.dictionaries.loader.file;

import database.DatabaseConstants;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLFileLoader implements FileLoader{

    private List<String> dataInList = new ArrayList<>();


    @Override
    public List<String> getDataFromFile(String filename) {
        try {
            File file = new File(filename);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            UserHandler userHandler = new UserHandler();
            parser.parse(file, userHandler);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }

        return dataInList;
    }

    private class UserHandler extends DefaultHandler {
        private boolean value = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(qName.equalsIgnoreCase(DatabaseConstants.XML_FILE_PROPERTY_VALUE)){
                value=true;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if(value){
                dataInList.add(new String(ch, start, length));
                value = false;
            }
        }
    }
}
