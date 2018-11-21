/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyOracle {

    private String ipAddress;
    private String port;
    private String sid;
    private String userName;
    private String password;

    public MyOracle() {

    }

    public MyOracle(String ipAddress, String port, String sid, String userName, String password) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.sid = sid;
        this.userName = userName;
        this.password = password;
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            //step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String connString = "jdbc:oracle:thin:@" + ipAddress + ":" + port + ":" + sid + ", " + userName + ", " + password + "";
            //step2 create  the connection object
            con = DriverManager.getConnection(connString);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyOracle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
