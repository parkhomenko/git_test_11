package com.courses.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
}
