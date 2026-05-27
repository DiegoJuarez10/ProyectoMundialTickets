/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

 
public class CreateConnection {
    static Properties config = new Properties();
    String hostname = null;
    String port = null;
    String database = null;
    String username = null;
    String password = null;
   
    
    public CreateConnection (){
 
        try {
        System.out.println(
            getClass().getResource("db_config.properties")
        );
            InputStream in =
                    getClass().getResourceAsStream("db_config.properties");

            config.load(in);

            hostname = config.getProperty("hostname");
            port = config.getProperty("port");
            database = config.getProperty("database");
            username = config.getProperty("username");
            password = config.getProperty("password");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {

        String jdbcUrl =
                "jdbc:postgresql://"
                + hostname
                + ":"
                + port
                + "/"
                + database
                + "?sslmode=require";

        Connection conn =
                DriverManager.getConnection(
                        jdbcUrl,
                        username,
                        password
                );

        System.out.println("Conexion establecida");

        return conn;
    }
    
    
}
