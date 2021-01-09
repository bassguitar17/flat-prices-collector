package starters;

import database.DatabaseConfig;
import database.dictionaries.adder.DictionariesDataAdder;
import database.dictionaries.loader.DictionariesDataLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ApplyingDictionariesDataStarter {
    public static void main(String[] args) {
        Connection myConn = getConnection();
        System.out.println("Connection bonded");

        DictionariesDataLoader ddLoader = new DictionariesDataLoader();
        Map<String, List<String>> data = ddLoader.loadData();
        System.out.println("Data loaded");

        DictionariesDataAdder ddAdder = new DictionariesDataAdder(myConn);
        ddAdder.add(data);
        System.out.println("Data added");

        try {
            myConn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Connection closed");
    }

    private static Connection getConnection() {
        Connection myConn = null;
        try {
            myConn = DriverManager.getConnection(DatabaseConfig.JDBC_URL, DatabaseConfig.JDBC_ACCOUNT, DatabaseConfig.JDBC_PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myConn;
    }
}
