package by.epam.module3.lecture4.jdbc;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siarhei_Chyhir on 11/24/2015.
 */
public class DerbyDB {
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static ResultSetMetaData metaData;

    public static void createDBConnection(String JDBCConnectionString) throws SQLException {
        DriverManager.registerDriver(new EmbeddedDriver());
        connection = DriverManager.getConnection(JDBCConnectionString);
    }

    public static void createTableWithDataIfNotExists() {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE candies (ID int generated always as identity " +
                    "(start with 1, increment by 1)" +
                    ", name varchar(255) not null" +
                    ", weight int not null" +
                    ", type varchar(255) not null" +
                    ", custom_data varchar(255))");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Shottogen', 200, 'Chocolate', 'Brut')");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Ideal', 100, 'Chocolate', 'Milk')");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Korovka', 25, 'Caramel', 'Jam')");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Shottogen', 200, 'Chocolate', 'Brut')");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Korovka', 25, 'Caramel', 'Jam')");
            statement.addBatch("Insert into candies (name, weight, type, custom_data) values ('Kuznechik', 20, 'Caramel', 'Halva')");
            statement.addBatch("Insert into candies (name, weight, type) values ('Shottogen', 20, 'Candy')");
            statement.executeBatch();
        } catch (SQLException e) {
//            e.printStackTrace();
        }
    }

    public static List<String> getDataFromTable(){
        try {
            statement.getConnection();
            resultSet = statement.executeQuery("select * from candies");
            metaData = resultSet.getMetaData();
            List<String> rowData = new ArrayList<String>();
            while (resultSet.next()){
                String values = "";
                for (int i = 2, columnCount = metaData.getColumnCount(); i <= columnCount; i++) {
                    values = values + " " + resultSet.getString(i);
                }
                rowData.add(values);
            }
            return rowData;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }





}
