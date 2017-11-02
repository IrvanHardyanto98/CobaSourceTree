/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author: Irvan Hardyanto
 * NPM: 2016730070
 * tanggal: 8 September 2017
 */

public class FXMLDocumentController implements Initializable {
    ObservableList<String> operatorList = FXCollections.observableArrayList("+","-","*","/");
    @FXML
    private ComboBox operatorComboBox;
    
    @FXML
    private TextField num1TextField,num2TextField,resultTextField;
    
    @FXML
    private Button computeButton;
    
    @FXML
    private Label equalsLabel;
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //jangan pake choice box, error mulu
        operatorComboBox.setValue("+");
        operatorComboBox.setItems(operatorList);
        
        
    }    
    
    private void onComputeButtonClicked(ActionEvent event){
        
    }
}
