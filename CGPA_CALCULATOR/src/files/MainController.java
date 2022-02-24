/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author parve
 */
public class MainController implements Initializable {

    @FXML
    private TextField course1;
    @FXML
    private TextField course2;
    @FXML
    private TextField course3;
    @FXML
    private TextField course4;
    @FXML
    private TextField course5;
    @FXML
    private TextField course6;
    @FXML
    private TextField course7;
    @FXML
    private TextField course8;
    @FXML
    private TextField course9;
    @FXML
    private TextField course10;
    @FXML
    private TextField credit1;
    @FXML
    private TextField credit2;
    @FXML
    private TextField credit3;
    @FXML
    private TextField credit4;
    @FXML
    private TextField credit5;
    @FXML
    private TextField credit6;
    @FXML
    private TextField credit7;
    @FXML
    private TextField credit8;
    @FXML
    private TextField credit9;
    @FXML
    private TextField credit10;
    @FXML
    private TextField currentCgpa;

    @FXML
    private TextField currentCredit;
    @FXML
    private Button resetButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void resetAction(ActionEvent event) {
        course1.setText("Course 1");
        course2.setText("Course 2");
        course3.setText("Course 3");
        course4.setText("Course 4");
        course5.setText("Course 5");
        course6.setText("Course 6");
        course7.setText("Course 7");
        course8.setText("Course 8");
        course9.setText("Course 9");
        course10.setText("Course 10");

        credit1.setText("");
        credit2.setText("");
        credit3.setText("");
        credit4.setText("");
        credit5.setText("");
        credit6.setText("");
        credit7.setText("");
        credit8.setText("");
        credit9.setText("");
        credit10.setText("");
        
        currentCgpa.setText("");
        currentCredit.setText("");
    }

}
