/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Van-Giang
 */
public class ViewModel {

   private Connection cnn = null;
    private final String CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE = "myapp";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String UTF8_URL = "?useUnicode=true&characterEncoding=utf-8";
    public static ViewModel instance;

    public static ViewModel getInstance() {
        if (null == instance) {
            instance = new ViewModel();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (null == cnn || cnn.isClosed()) {
                cnn = DriverManager.getConnection(CONNECTION_URL + DATABASE + UTF8_URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cnn;
    }

    public void closeConnection() {
        try {
            if (cnn != null && !cnn.isClosed()) {
                cnn.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
 
}
