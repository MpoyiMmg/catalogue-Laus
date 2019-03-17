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
    private Image image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        for(int i=0; i<=100; i++){
            try {
                progressbar.setProgress(i);
                this.lblPourc.setText(i+"%");
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          
    }
    
    public void initialise_instance() {
        
        this.imViewScreen = new ImageView();
        this.lblPourc = new Label();
        this.progressbar = new ProgressBar();
        
    }
    
    public void progress_bar() {
        
        this.initialise_instance();
        int i = 0;
        
        while(i<=100){
          
            this.progressbar.setProgress(i);
            this.lblPourc.setText(i+"%");
            
            i++;
        }
    }
    
}
