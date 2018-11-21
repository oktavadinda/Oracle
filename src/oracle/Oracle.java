/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Oracle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object  
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@172.23.9.185:1521:orcl", "MHS175314107", "MHS175314107");

            //step3 create the statement object  
            Statement stmt = con.createStatement();

            //step4 execute query  
            ResultSet rs = stmt.executeQuery("select E.first_name, E.last_name from MHS175314107.employees E");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }

            //step5 close the connection object  
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
