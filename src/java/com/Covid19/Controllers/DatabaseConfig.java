/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Covid19.Controllers;

import java.sql.*;  
import com.Covid19.Models.UserAuthendication;

class DatabaseConfig{  

    public UserAuthendication method(String userName){
        
          
    UserAuthendication UA = new UserAuthendication();
    
    UA.setUname(userName);
    
    
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/covid19","root","abcd");  
 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select pass from LOGIN where uname='"+userName+"'");  
while(rs.next())  
{
    UA.setPass(rs.getString("pass"));
}
con.close();  
}catch(Exception e){ System.out.println(e);}  

        return UA;
    }  
    
    }
  