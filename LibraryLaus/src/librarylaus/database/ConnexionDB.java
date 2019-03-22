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
    
            
    private String url      = "jdbc:mysql://localhost/Laus";
    private String user     = "root";
    private String password = "";
    
    private ConnexionDB(){
    }
    
}
