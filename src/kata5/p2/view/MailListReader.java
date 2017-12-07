/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5.p2.view;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.util.ArrayList;
import kata5.p2.model.Mail;
 
/**
 *
 * @author Ithiel
 */

 public class MailListReader {
    public static ArrayList<Mail> read() throws ClassNotFoundException, SQLException{
        ArrayList<Mail> mailList = new ArrayList<>();
         Class.forName("org.sqlite.JDBC");
         Connection connection = DriverManager.getConnection("jdbc:sqlite:KATA5.db");
        
         Statement st = connection.createStatement();
                 
         String query = "SELECT * FROM MAIL";
         ResultSet rs = st.executeQuery(query);
         
         while(rs.next()){
             String mail = rs.getString("mail");
             if(!mail.contains("@")){
                 continue;             
             }
         }
         return mailList;
     }
 
 }