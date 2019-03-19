/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus.test;

import java.sql.SQLException;
import librarylaus.database.ConnexionDB;

/**
 *
 * @author gaelmmg
 */
public class Test {
    
    public static void main(String[] args) throws SQLException{
        ConnexionDB conn = ConnexionDB.getInstance();
        conn.getConnexion();
        
//        System.out.println("connexion reussie");
    }
}
