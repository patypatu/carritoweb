/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author docencia
 */
public class Conexion {
    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());
    Connection con;
    
    public Connection getConnection() {
        try {
            Properties props = new Properties();
            InputStream in = getClass().getResourceAsStream("/config/db.properties");
            props.load(in);
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.p   ass");
            String url = props.getProperty("db.url");
            Class.forName("com.mysql.jdbc.Driver"); //NOSONAR
            con = (Connection) DriverManager.getConnection(url, user, pass);
        } catch(Exception e) {
            LOGGER.severe("Error al conectar la base de datos"+e);
        }
        return con;
    }
}
