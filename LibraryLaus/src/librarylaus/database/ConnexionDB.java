/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author gaelmmg
 */

// creation de la classe Singleton pour la connexion a 
//                la base des donnees


public class ConnexionDB {
    
    private Connection connect;
    private String url;
    private String user;
    private String pwd;
    
    
    private ConnexionDB() throws SQLException{
       
        this.initialise();
        
        this.connect = DriverManager.getConnection(this.url, this.user, this.pwd);
        
    }
    
    private void initialise(){
        
        this.url = "jdbc:mysql://localhost:/Laus";
        this.user = "root";
        this.pwd = "";
    }
    
    public ConnexionDB getInstance() throws SQLException{ return new ConnexionDB(); }
    
    public Connection getConnexion() throws SQLException{ return this.connect; }
    
}
