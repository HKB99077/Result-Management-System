/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class ConnectionProviderCode {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem","root","Lenovo@1234");
            return con;
    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
            return null;
        }
    }
    public static void main(String args[]){
       ConnectionProviderCode con = new ConnectionProviderCode();
       Connection c = con.getcon();
    }
    }

    

