/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/* @author gaelmmg */

public class Launch extends Application {
    
    public  Stage stage = null;
    
//    ============================================================================>
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("view/Splah.fxml"));
        Scene scene = new Scene(root);
        
        stage.initStyle(StageStyle.UNDECORATED);
        
        this.stage = stage;
        this.stage.setScene(scene);
        this.stage.show();
    }
    
//    ============================================================================>
    public Stage getStage(){return this.stage;}

//    ============================================================================>
    public static void main(String[] args) { launch(args); }
//    ============================================================================>
    
}
