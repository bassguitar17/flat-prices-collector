package database.dictionaries.adder;

import database.DatabaseConstants;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class DictionariesDataAdder {
    private final Connection myConn;
    private int increment = 1;

    public DictionariesDataAdder(Connection myConn) {
        this.myConn = myConn;
    }

    public boolean add(Map<String, List<String>> data) {
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            addOneDictionary(entry.getKey(), (List<String>) entry.getValue());
        }
        return false;
    }

    private void addOneDictionary(String tableName, List<String> data) {
        CallableStatement myStmt = null;

        try {
            myStmt = myConn.prepareCall(DatabaseConstants.PROCEDURE_CALL_START +
                    DatabaseConstants.PROCEDURE_ADD_DICTIONARY_DATA +
                    DatabaseConstants.DASH +
                    tableName +
                    DatabaseConstants.PROCEDURE_CALL_END_ONE_ARGUMENT);

            for (String value : data) {
                addOneValue(myStmt, value);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                myStmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private void addOneValue(CallableStatement myStmt, String value) throws SQLException {
        //myStmt.setInt(1, increment);
        myStmt.setString(1, value);
        var res = myStmt.executeUpdate();//spróbować też z samym execute()
        System.out.println(res);
        increment++;
    }
}
