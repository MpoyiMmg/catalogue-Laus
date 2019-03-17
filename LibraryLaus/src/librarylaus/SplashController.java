/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author gaelmmg
 */
public class SplashController implements Initializable{
    
    @FXML
    private ImageView imViewScreen;
    @FXML 
    private ProgressBar progressbar;
    @FXML
    private Label lblPourc;
    @FXML
    private Label lblLoad;
    
    private LibraryLaus lib;
    private Thread th;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        try {
            this.progress_bar();
        } catch (InterruptedException ex) {
            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
    public void initialise_instance() {
        
        this.imViewScreen = new ImageView();
        this.th           = new Thread();
        
    }
    
    public void progress_bar() throws InterruptedException {
        
        this.initialise_instance();
        int i = 0;
        
        while(i < 100){
            
            this.progressbar.setProgress(i);
            this.lblPourc.setText(i+"%"); 
            Thread.sleep(2000);

            i++;
        }
    }
}
