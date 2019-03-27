package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	Dizionario d=new Dizionario();
	String ParolaAliena;
	String ParolaTradotta;
	
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	if(btnTranslate.isArmed()&&txtWord.getText().trim().length()!=0) {
    		
             ParolaAliena=null;
             ParolaTradotta=null;
             txtResult.clear();
             String s=txtWord.getText().toLowerCase();
             txtWord.clear();
            
    	
    		StringTokenizer st=new StringTokenizer(s," ");
    	    if(st.hasMoreTokens()==true) {
    	        ParolaAliena=st.nextToken().trim();
    	    }
    	    if(st.hasMoreTokens()==true) {
    	        ParolaTradotta=st.nextToken().trim();
    	    }
    	    
    		if(ParolaAliena!=null&&ParolaTradotta==null) {
    			
    			String t=d.cercaParola(ParolaAliena);
    			txtResult.appendText(t);
    		}
    		else if(ParolaAliena!=null&&ParolaTradotta!=null){
    			Parola p=new Parola(ParolaAliena,ParolaTradotta);
    			d.aggiungiParola(p.getParolaAliena(), p);
    		}
    	
    	}
		
    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	if(btnReset.isArmed())
          txtResult.clear();
          d.cancella();
    }
    
}
