/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditi
 */
package hotel.management.system;
import java.sql.*;
public class conn {
     Connection c;
    Statement s;
     public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hms","root","password");
            s = c.createStatement();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
