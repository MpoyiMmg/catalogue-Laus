/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import librarylaus.infoConnect.Infos;

/**
 * @author gaelmmg
 */

// creation de la classe Singleton pour la connexion a 
//                la base des donnees


public class ConnexionDB {
    
    private static Connection connect = null;
    private static ConnexionDB conDb = null;
    
    private Infos info;
    
    
    private ConnexionDB() throws SQLException{
        this.initialise();
    }
    
    private void initialise(){
        
        String url = "jdbc:mysql://localhost:/Laus";
        String user = "root";
        String pwd = "";
        
        this.info = new Infos();
        
        this.info.setUrl(url);
        this.info.setUser(user);
        this.info.setPwd(pwd);
    }
    
    public static ConnexionDB getInstance() throws SQLException { 
        
        if(ConnexionDB.conDb == null){ ConnexionDB.conDb = new ConnexionDB(); }
        return ConnexionDB.conDb; 
    }
    
    public Connection getConnexion() throws SQLException{ 
        
        if(ConnexionDB.connect == null){ ConnexionDB.connect = DriverManager.getConnection(this.info.getUrl(), 
                                                                                           this.info.getUser(),
                                                                                           this.info.getPwd()); }
        System.out.println("connexion reussie");
        return this.connect; }
    
}
