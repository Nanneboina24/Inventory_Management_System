/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gajic
 */
public class DataConnect {
    public static Connection getConnect() throws SQLException
    {
        String url = "jdbc:sqlite:billingDB.db";
            Connection con = DriverManager.getConnection(url);
            return con;
    }
    
}
