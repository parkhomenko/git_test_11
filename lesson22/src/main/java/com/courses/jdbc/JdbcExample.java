package com.courses.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcExample {
    public static void main(String[] args) {
        JdbcExample jdbcExample = new JdbcExample();

        try {
            Properties properties = jdbcExample.loadProperties();

            Connection connection = DriverManager
                    .getConnection(properties.getProperty("url"),
                            properties.getProperty("username"),
                            properties.getProperty("password"));

            System.out.println("Connected");

            //jdbcExample.printStudents(connection);
            //jdbcExample.addStudent(connection);
            //jdbcExample.transactionExample(connection);
            jdbcExample.batchExample(connection);

        } catch (SQLException | IOException e) {
            System.out.println("connection refused");
        }
    }

    private Properties loadProperties() throws IOException {
        InputStream stream = this.getClass().getResourceAsStream("db.properties");

        Properties properties = new Properties();
        properties.load(stream);
        return properties;
    }

    public void printStudents(Connection connection) throws SQLException {
        String sql = "select * from students";

        Statement statement = connection.createStatement();
        statement.executeQuery(sql);

        ResultSet resultSet = statement.getResultSet();
        StringBuilder builder = new StringBuilder();
        while (resultSet.next()) {
            String fname = resultSet.getString("fname");
            String lname = resultSet.getString("lname");
            int age = Integer.valueOf(resultSet.getString("age"));

            builder.append(fname + ", " + lname + ", " + age + "\n");
        }

        System.out.println(builder.toString());
    }

    public void addStudent(Connection connection) throws SQLException {
        String sql = "insert into students(fname, lname, age) values(?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Sam");
        preparedStatement.setString(2, "Waine");
        preparedStatement.setInt(3, 35);

        preparedStatement.execute();
    }

    public void transactionExample(Connection connection) throws SQLException {
        String sql1 = "insert into students(fname, lname, age) values('John', 'Wick', 38)";
        String sql2 = "insert into students(fname, lname, age) values('Kate', 'Johnson', 25)";

        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();

        try {
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            connection.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void batchExample(Connection connection) throws SQLException {
        String sql = "insert into students(fname, lname, age) values(?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        connection.setAutoCommit(false);

        for (int i = 0; i < 10; i++) {
            preparedStatement.setString(1, "John");
            preparedStatement.setString(2, "Doe");
            preparedStatement.setInt(3, i + 30);
            preparedStatement.addBatch();
        }

        preparedStatement.executeBatch();

        connection.setAutoCommit(true);
    }
}
