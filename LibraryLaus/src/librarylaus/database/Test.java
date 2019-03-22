/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus.database;

import java.sql.SQLException;

/**
 *
 * @author gaelmmg
 */
public class Test {
    public static void main(String[] args) throws SQLException{
        ConnexionDB conn = ConnexionDB.getInstance();
        
        System.out.println("connxion etablie");
    }
}
