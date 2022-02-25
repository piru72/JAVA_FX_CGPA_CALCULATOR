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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author parve
 */
public class MainController implements Initializable, courseInfo {
    
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
    private MenuItem semester1;
    /*
    String course1_1_1 = "HUM1107";
    String course2_1_1 = "HUM1108";
    String course3_1_1 = "MATH1115";
    String course4_1_1 = "PHY1115";
    String course5_1_1 = "PHY1116";
    String course6_1_1 = "CHEM1115";
    String course7_1_1 = "CSE1101";
    String course8_1_1 = "CSE1102";
    String course9_1_1 = "CSE1108";

    String credit1_1_1 = "3.0";
    String credit2_1_1 = "1.5";
    String credit3_1_1 = "3.0";
    String credit4_1_1 = "3.0";
    String credit5_1_1 = ".75";
    String credit6_1_1 = "3.0";
    String credit7_1_1 = "3.0";
    String credit8_1_1 = "1.5";
    String credit9_1_1 = "1.5";
     */
    @FXML
    private Button resetButton;
    @FXML
    private TextField quality10;
    @FXML
    private MenuButton grade1;
    @FXML
    private MenuButton grade2;
    @FXML
    private MenuButton grade3;
    @FXML
    private MenuButton grade4;
    @FXML
    private MenuButton grade5;
    @FXML
    private MenuButton grade6;
    @FXML
    private MenuButton grade7;
    @FXML
    private MenuButton grade8;
    @FXML
    private MenuButton grade9;
    @FXML
    private MenuButton grade10;
    @FXML
    private TextField quality1;
    @FXML
    private TextField quality2;
    @FXML
    private TextField quality3;
    @FXML
    private TextField quality4;
    @FXML
    private TextField quality5;
    @FXML
    private TextField quality6;
    @FXML
    private TextField quality7;
    @FXML
    private TextField quality8;
    @FXML
    private TextField quality9;
    @FXML
    private Button calculateButton;
    @FXML
    private TextField cgpaField;

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
        course9.setVisible(true);
        course10.setVisible(true);
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
        credit9.setVisible(true);
        credit10.setVisible(true);
        credit9.setText("");
        credit10.setText("");

        grade1.setText("");
        grade2.setText("");
        grade3.setText("");
        grade4.setText("");
        grade5.setText("");
        grade6.setText("");
        grade7.setText("");
        grade8.setText("");
        grade9.setVisible(true);
        grade10.setVisible(true);
        grade9.setText("");
        grade10.setText("");

        quality1.setText("");
        quality2.setText("");
        quality3.setText("");
        quality4.setText("");
        quality5.setText("");
        quality6.setText("");
        quality7.setText("");
        quality8.setText("");
        quality9.setVisible(true);
        quality10.setVisible(true);
        quality9.setText("");
        quality10.setText("");

        
        
        currentCgpa.setText("");
        currentCredit.setText("");

        cgpaField.setText("");
        
        
        
    }
    
    @FXML
    void semester1Action(ActionEvent event) {
        
        course1.setText(course1_1_1);
        course2.setText(course2_1_1);
        course3.setText(course3_1_1);
        course4.setText(course4_1_1);
        course5.setText(course5_1_1);
        course6.setText(course6_1_1);
        course7.setText(course7_1_1);
        course8.setText(course8_1_1);
        course9.setText(course9_1_1);
        
        course10.setVisible(false);
        
        credit1.setText(credit1_1_1);
        credit2.setText(credit2_1_1);
        credit3.setText(credit3_1_1);
        credit4.setText(credit4_1_1);
        credit5.setText(credit5_1_1);
        credit6.setText(credit6_1_1);
        credit7.setText(credit7_1_1);
        credit8.setText(credit8_1_1);
        credit9.setText(credit9_1_1);
        credit10.setVisible(false);
        
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void grade1_1Action(ActionEvent event) {
        grade1.setText("4");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
        
    }
    
    @FXML
    private void grade1_2Action(ActionEvent event) {
        grade1.setText("3.75");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_3Action(ActionEvent event) {
        grade1.setText("3.50");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_4Action(ActionEvent event) {
        grade1.setText("3.25");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_5Action(ActionEvent event) {
        grade1.setText("3.00");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_6Action(ActionEvent event) {
        grade1.setText("2.75");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_7Action(ActionEvent event) {
        grade1.setText("2.50");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_8Action(ActionEvent event) {
        grade1.setText("2.25");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_9Action(ActionEvent event) {
        grade1.setText("2.00");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade1_10Action(ActionEvent event) {
        grade1.setText("0.00");
        quality1.setText(Double.toString(Double.parseDouble(grade1.getText()) * Double.parseDouble(credit1.getText())));
    }
    
    @FXML
    private void grade2_1Action(ActionEvent event) {
        grade2.setText("4");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_2Action(ActionEvent event) {
        grade2.setText("3.75");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_3Action(ActionEvent event) {
        grade2.setText("3.50");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_4Action(ActionEvent event) {
        grade2.setText("3.25");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_5Action(ActionEvent event) {
        grade2.setText("3.00");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_6Action(ActionEvent event) {
        grade2.setText("2.75");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_7Action(ActionEvent event) {
        grade2.setText("2.50");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_8Action(ActionEvent event) {
        grade2.setText("2.25");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_9Action(ActionEvent event) {
        grade2.setText("2.00");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade2_10Action(ActionEvent event) {
        grade2.setText("0.00");
        quality2.setText(Double.toString(Double.parseDouble(grade2.getText()) * Double.parseDouble(credit2.getText())));
    }
    
    @FXML
    private void grade3_1Action(ActionEvent event) {
        grade3.setText("4");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_2Action(ActionEvent event) {
        grade3.setText("3.75");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_3Action(ActionEvent event) {
        grade3.setText("3.50");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_4Action(ActionEvent event) {
        grade3.setText("3.25");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_5Action(ActionEvent event) {
        grade3.setText("3.00");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_6Action(ActionEvent event) {
        grade3.setText("2.75");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_7Action(ActionEvent event) {
        grade3.setText("2.50");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_8Action(ActionEvent event) {
        grade3.setText("2.25");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_9Action(ActionEvent event) {
        grade3.setText("2.00");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade3_10Action(ActionEvent event) {
        grade3.setText("0.00");
        quality3.setText(Double.toString(Double.parseDouble(grade3.getText()) * Double.parseDouble(credit3.getText())));
    }
    
    @FXML
    private void grade4_1Action(ActionEvent event) {
        grade4.setText("4");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_2Action(ActionEvent event) {
        grade4.setText("3.75");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_3Action(ActionEvent event) {
        grade4.setText("3.50");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_4Action(ActionEvent event) {
        grade4.setText("3.25");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_5Action(ActionEvent event) {
        grade4.setText("3.00");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_6Action(ActionEvent event) {
        grade4.setText("2.75");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_7Action(ActionEvent event) {
        grade4.setText("2.50");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_8Action(ActionEvent event) {
        grade4.setText("2.25");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_9Action(ActionEvent event) {
        grade4.setText("2.00");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade4_10Action(ActionEvent event) {
        grade4.setText("0.00");
        quality4.setText(Double.toString(Double.parseDouble(grade4.getText()) * Double.parseDouble(credit4.getText())));
    }
    
    @FXML
    private void grade5_1Action(ActionEvent event) {
        grade5.setText("4");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_2Action(ActionEvent event) {
        grade5.setText("3.75");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_3Action(ActionEvent event) {
        grade5.setText("3.50");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_4Action(ActionEvent event) {
        grade5.setText("3.25");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_5Action(ActionEvent event) {
        grade5.setText("3.00");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_6Action(ActionEvent event) {
        grade5.setText("2.75");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_7Action(ActionEvent event) {
        grade5.setText("2.50");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_8Action(ActionEvent event) {
        grade5.setText("2.25");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_9Action(ActionEvent event) {
        grade5.setText("2.00");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade5_10Action(ActionEvent event) {
        grade5.setText("0.00");
        quality5.setText(Double.toString(Double.parseDouble(grade5.getText()) * Double.parseDouble(credit5.getText())));
    }
    
    @FXML
    private void grade6_1Action(ActionEvent event) {
        grade6.setText("4");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_2Action(ActionEvent event) {
        grade6.setText("3.75");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_3Action(ActionEvent event) {
        grade6.setText("3.50");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_4Action(ActionEvent event) {
        grade6.setText("3.25");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_5Action(ActionEvent event) {
        grade6.setText("3.00");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_6Action(ActionEvent event) {
        grade6.setText("2.75");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_7Action(ActionEvent event) {
        grade6.setText("2.50");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_8Action(ActionEvent event) {
        grade6.setText("2.25");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_9Action(ActionEvent event) {
        grade6.setText("2.00");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade6_10Action(ActionEvent event) {
        grade6.setText("0.00");
        quality6.setText(Double.toString(Double.parseDouble(grade6.getText()) * Double.parseDouble(credit6.getText())));
    }
    
    @FXML
    private void grade7_1Action(ActionEvent event) {
        grade7.setText("4");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_2Action(ActionEvent event) {
        grade7.setText("3.75");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_3Action(ActionEvent event) {
        grade7.setText("3.50");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_4Action(ActionEvent event) {
        grade7.setText("3.25");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_5Action(ActionEvent event) {
        grade7.setText("3.00");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_6Action(ActionEvent event) {
        grade7.setText("2.75");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_7Action(ActionEvent event) {
        grade7.setText("2.50");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_8Action(ActionEvent event) {
        grade7.setText("2.25");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_9Action(ActionEvent event) {
        grade7.setText("2.00");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade7_10Action(ActionEvent event) {
        grade7.setText("0.00");
        quality7.setText(Double.toString(Double.parseDouble(grade7.getText()) * Double.parseDouble(credit7.getText())));
    }
    
    @FXML
    private void grade8_1Action(ActionEvent event) {
        grade8.setText("4");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_2Action(ActionEvent event) {
        grade8.setText("3.75");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_3Action(ActionEvent event) {
        grade8.setText("3.50");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_4Action(ActionEvent event) {
        grade8.setText("3.25");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_5Action(ActionEvent event) {
        grade8.setText("3.00");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_6Action(ActionEvent event) {
        grade8.setText("2.75");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_7Action(ActionEvent event) {
        grade8.setText("2.50");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_8Action(ActionEvent event) {
        grade8.setText("2.25");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_9Action(ActionEvent event) {
        grade8.setText("2.00");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade8_10Action(ActionEvent event) {
        grade8.setText("0.00");
        quality8.setText(Double.toString(Double.parseDouble(grade8.getText()) * Double.parseDouble(credit8.getText())));
    }
    
    @FXML
    private void grade9_1Action(ActionEvent event) {
        grade9.setText("4");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_2Action(ActionEvent event) {
        grade9.setText("3.75");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_3Action(ActionEvent event) {
        grade9.setText("3.50");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_4Action(ActionEvent event) {
        grade9.setText("3.25");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_5Action(ActionEvent event) {
        grade9.setText("3.00");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_6Action(ActionEvent event) {
        grade9.setText("2.75");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_7Action(ActionEvent event) {
        grade9.setText("2.50");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_8Action(ActionEvent event) {
        grade9.setText("2.25");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_9Action(ActionEvent event) {
        grade9.setText("2.00");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade9_10Action(ActionEvent event) {
        grade9.setText("0.01");
        quality9.setText(Double.toString(Double.parseDouble(grade9.getText()) * Double.parseDouble(credit9.getText())));
    }
    
    @FXML
    private void grade10_1Action(ActionEvent event) {
        grade10.setText("4");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_2Action(ActionEvent event) {
        grade10.setText("3.75");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_3Action(ActionEvent event) {
        grade10.setText("3.50");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_4Action(ActionEvent event) {
        grade10.setText("3.25");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_5Action(ActionEvent event) {
        grade10.setText("3.00");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_6Action(ActionEvent event) {
        grade10.setText("2.75");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_7Action(ActionEvent event) {
        grade10.setText("2.50");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_8Action(ActionEvent event) {
        grade10.setText("2.25");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_9Action(ActionEvent event) {
        grade10.setText("2.00");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void grade10_10Action(ActionEvent event) {
        grade10.setText("0.00");
        quality10.setText(Double.toString(Double.parseDouble(grade10.getText()) * Double.parseDouble(credit10.getText())));
    }
    
    @FXML
    private void semester2Action(ActionEvent event) {
        
        course1.setText(course1_1_2);
        course2.setText(course2_1_2);
        course3.setText(course3_1_2);
        course4.setText(course4_1_2);
        course5.setText(course5_1_2);
        course6.setText(course6_1_2);
        course7.setText(course7_1_2);
        course8.setText(course8_1_2);
        course9.setText(course9_1_2);
        course10.setVisible(false);
        credit1.setText(credit1_1_2);
        credit2.setText(credit2_1_2);
        credit3.setText(credit3_1_2);
        credit4.setText(credit4_1_2);
        credit5.setText(credit5_1_2);
        credit6.setText(credit6_1_2);
        credit7.setText(credit7_1_2);
        credit8.setText(credit8_1_2);
        credit9.setText(credit9_1_2);
        credit10.setVisible(false);
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void semester3Action(ActionEvent event) {
        course1.setText(course1_2_1);
        course2.setText(course2_2_1);
        course3.setText(course3_2_1);
        course4.setText(course4_2_1);
        course5.setText(course5_2_1);
        course6.setText(course6_2_1);
        course7.setText(course7_2_1);
        course8.setText(course8_2_1);
        course9.setText(course9_2_1);
        
        course10.setVisible(false);
        credit1.setText(credit1_2_1);
        credit2.setText(credit2_2_1);
        credit3.setText(credit3_2_1);
        credit4.setText(credit4_2_1);
        credit5.setText(credit5_2_1);
        credit6.setText(credit6_2_1);
        credit7.setText(credit7_2_1);
        credit8.setText(credit8_2_1);
        credit9.setText(credit9_2_1);
        credit10.setVisible(false);
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void semester4Action(ActionEvent event) {
        course1.setText(course1_2_2);
        course2.setText(course2_2_2);
        course3.setText(course3_2_2);
        course4.setText(course4_2_2);
        course5.setText(course5_2_2);
        course6.setText(course6_2_2);
        course7.setText(course7_2_2);
        course8.setText(course8_2_2);
        course9.setText(course9_2_2);
        course10.setVisible(false);
        
        credit1.setText(credit1_2_2);
        credit2.setText(credit2_2_2);
        credit3.setText(credit3_2_2);
        credit4.setText(credit4_2_2);
        credit5.setText(credit5_2_2);
        credit6.setText(credit6_2_2);
        credit7.setText(credit7_2_2);
        credit8.setText(credit8_2_2);
        credit9.setText(credit9_2_2);
        credit10.setVisible(false);
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void semester5Action(ActionEvent event) {
        course1.setText(course1_3_1);
        course2.setText(course2_3_1);
        course3.setText(course3_3_1);
        course4.setText(course4_3_1);
        course5.setText(course5_3_1);
        course6.setText(course6_3_1);
        course7.setText(course7_3_1);
        course8.setText(course8_3_1);
        course9.setText(course9_3_1);
        
        course10.setVisible(false);
        credit1.setText(credit1_3_1);
        credit2.setText(credit2_3_1);
        credit3.setText(credit3_3_1);
        credit4.setText(credit4_3_1);
        credit5.setText(credit5_3_1);
        credit6.setText(credit6_3_1);
        credit7.setText(credit7_3_1);
        credit8.setText(credit8_3_1);
        credit9.setText(credit9_3_1);
        credit10.setVisible(false);
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void semester6Action(ActionEvent event) {
        course1.setText(course1_3_2);
        course2.setText(course2_3_2);
        course3.setText(course3_3_2);
        course4.setText(course4_3_2);
        course5.setText(course5_3_2);
        course6.setText(course6_3_2);
        course7.setText(course7_3_2);
        course8.setText(course8_3_2);
        course9.setText(course9_3_2);
        course10.setVisible(false);
        
        credit1.setText(credit1_3_2);
        credit2.setText(credit2_3_2);
        credit3.setText(credit3_3_2);
        credit4.setText(credit4_3_2);
        credit5.setText(credit5_3_2);
        credit6.setText(credit6_3_2);
        credit7.setText(credit7_3_2);
        credit8.setText(credit8_3_2);
        credit9.setText(credit9_3_2);
        credit10.setVisible(false);
        grade10.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void semester7Action(ActionEvent event) {
        course1.setText(course1_4_1);
        course2.setText(course2_4_1);
        course3.setText(course3_4_1);
        course4.setText(course4_4_1);
        course5.setText(course5_4_1);
        course6.setText(course6_4_1);
        course7.setText(course7_4_1);
        course8.setText(course8_4_1);
        course9.setVisible(true);
        course9.setText(course9_4_1);
        course10.setVisible(true);
        course10.setText(course10_4_1);
        
        course10.setVisible(false);
        credit1.setText(credit1_4_1);
        credit2.setText(credit2_4_1);
        credit3.setText(credit3_4_1);
        credit4.setText(credit4_4_1);
        credit5.setText(credit5_4_1);
        credit6.setText(credit6_4_1);
        credit7.setText(credit7_4_1);
        credit8.setText(credit8_4_1);
        credit9.setVisible(true);
        credit9.setText(credit9_4_1);
        credit10.setVisible(true);
        credit10.setText(credit10_4_1);
        
        grade9.setVisible(true);
        quality9.setVisible(true);
        
        grade10.setVisible(true);
        quality10.setVisible(true);

        course9.setVisible(true);
        course10.setVisible(true);
    }
    
    @FXML
    private void semester8Action(ActionEvent event) {
        course1.setText(course1_4_2);
        course2.setText(course2_4_2);
        course3.setText(course3_4_2);
        course4.setText(course4_4_2);
        course5.setText(course5_4_2);
        course6.setText(course6_4_2);
        course7.setText(course7_4_2);
        course8.setText(course8_4_2);
        
        course9.setVisible(false);
        course10.setVisible(false);
        credit1.setText(credit1_4_2);
        credit2.setText(credit2_4_2);
        credit3.setText(credit3_4_2);
        credit4.setText(credit4_4_2);
        credit5.setText(credit5_4_2);
        credit6.setText(credit6_4_2);
        credit7.setText(credit7_4_2);
        credit8.setText(credit8_4_2);
        credit9.setVisible(false);
        credit10.setVisible(false);
        grade9.setVisible(false);
        grade10.setVisible(false);
        quality9.setVisible(false);
        quality10.setVisible(false);
    }
    
    @FXML
    private void calculateAction(ActionEvent event) {
        double totalQuality;
        double totalCredit;
        
        try {
            totalQuality = Double.parseDouble(quality1.getText()) + Double.parseDouble(quality2.getText()) + Double.parseDouble(quality3.getText()) + Double.parseDouble(quality4.getText()) + Double.parseDouble(quality5.getText()) + Double.parseDouble(quality6.getText()) + Double.parseDouble(quality7.getText()) + Double.parseDouble(quality8.getText());
            
            if (course9.isVisible()) {
                totalQuality = totalQuality + Double.parseDouble(quality9.getText());
            }
            if (course10.isVisible()) {
                totalQuality = totalQuality + Double.parseDouble(quality10.getText());
            }
            
            totalCredit = Double.parseDouble(credit1.getText()) + Double.parseDouble(credit2.getText()) + Double.parseDouble(credit3.getText()) + Double.parseDouble(credit4.getText()) + Double.parseDouble(credit5.getText()) + Double.parseDouble(credit6.getText()) + Double.parseDouble(credit7.getText()) + Double.parseDouble(credit8.getText());
            
            if (course9.isVisible()) {
                totalCredit = totalCredit + Double.parseDouble(credit9.getText());
            }
            if (course10.isVisible()) {
                totalCredit = totalCredit + Double.parseDouble(credit10.getText());
            }

            cgpaField.setText(Double.toString(totalQuality/totalCredit));
            
        } catch (Exception e) {
            System.out.println("Error");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Give input in all the courses");
            alert.setContentText("Please provide grades for all the courses");
             alert.showAndWait();
        }
        
    }

    public void setVisibilityOff()
    {
        //course1.setVisible(false);
        // course2.setVisible(false);
        // course3.setVisible(false);
        // course4.setVisible(false);
        // course5.setVisible(false);
        // course6.setVisible(false);
        // course7.setVisible(false);
        // course8.setVisible(false);
        // course9.setVisible(false);
        // course10.setVisible(false);
        
        // credit1.setVisible(false);
        // credit2.setVisible(false);
        // credit3.setVisible(false);
        // credit4.setVisible(false);
        // credit5.setVisible(false);
        // credit6.setVisible(false);
        // credit7.setVisible(false);
        // credit8.setVisible(false);
        // credit9.setVisible(false);
        // credit10.setVisible(false);
        
        // quality1.setVisible(false);
        // quality2.setVisible(false);
        // quality3.setVisible(false);
        // quality4.setVisible(false);
        // quality5.setVisible(false);
        // quality6.setVisible(false);
        // quality7.setVisible(false);
        // quality8.setVisible(false);
        // quality9.setVisible(false);
        // quality10.setVisible(false);

        // grade1.setVisible(false);
        // grade2.setVisible(false);
        // grade3.setVisible(false);
        // grade4.setVisible(false);
        // grade5.setVisible(false);
        // grade6.setVisible(false);
        // grade7.setVisible(false);
        // grade8.setVisible(false);
        // grade9.setVisible(false);
        // grade10.setVisible(false);
        System.out.println("setVisibilityOff");
       
    }

    public void setVisibilityOn()
    {
        course1.setVisible(true);
        course2.setVisible(true);
        course3.setVisible(true);
        course4.setVisible(true);
        course5.setVisible(true);
        course6.setVisible(true);
        course7.setVisible(true);
        course8.setVisible(true);
        course9.setVisible(true);
        course10.setVisible(true);
        
        credit1.setVisible(true);
        credit2.setVisible(true);
        credit3.setVisible(true);
        credit4.setVisible(true);
        credit5.setVisible(true);
        credit6.setVisible(true);
        credit7.setVisible(true);
        credit8.setVisible(true);
        credit9.setVisible(true);
        credit10.setVisible(true);
        
        quality1.setVisible(true);
        quality2.setVisible(true);
        quality3.setVisible(true);
        quality4.setVisible(true);
        quality5.setVisible(true);
        quality6.setVisible(true);
        quality7.setVisible(true);
        quality8.setVisible(true);
        quality9.setVisible(true);
        quality10.setVisible(true);

        grade1.setVisible(true);
        grade2.setVisible(true);
        grade3.setVisible(true);
        grade4.setVisible(true);
        grade5.setVisible(true);
        grade6.setVisible(true);
        grade7.setVisible(true);
        grade8.setVisible(true);
        grade9.setVisible(true);
        grade10.setVisible(true);
    }
    
}
