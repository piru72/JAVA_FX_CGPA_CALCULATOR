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
    }

    @FXML
    private void grade1_2Action(ActionEvent event) {
        grade1.setText("3.75");
    }

    @FXML
    private void grade1_3Action(ActionEvent event) {
        grade1.setText("3.50");
    }

    @FXML
    private void grade1_4Action(ActionEvent event) {
        grade1.setText("3.25");
    }

    @FXML
    private void grade1_5Action(ActionEvent event) {
        grade1.setText("3.00");
    }

    @FXML
    private void grade1_6Action(ActionEvent event) {
        grade1.setText("2.75");
    }

    @FXML
    private void grade1_7Action(ActionEvent event) {
        grade1.setText("2.50");
    }

    @FXML
    private void grade1_8Action(ActionEvent event) {
        grade1.setText("2.25");
    }

    @FXML
    private void grade1_9Action(ActionEvent event) {
        grade1.setText("2.00");
    }

    @FXML
    private void grade1_10Action(ActionEvent event) {
        grade1.setText("0.00");
    }

    @FXML
    private void grade2_1Action(ActionEvent event) {
        grade2.setText("4");
    }

    @FXML
    private void grade2_2Action(ActionEvent event) {
        grade2.setText("3.75");
    }

    @FXML
    private void grade2_3Action(ActionEvent event) {
        grade2.setText("3.50");
    }

    @FXML
    private void grade2_4Action(ActionEvent event) {
        grade2.setText("3.25");
    }

    @FXML
    private void grade2_5Action(ActionEvent event) {
        grade2.setText("3.00");
    }

    @FXML
    private void grade2_6Action(ActionEvent event) {
        grade2.setText("2.75");
    }

    @FXML
    private void grade2_7Action(ActionEvent event) {
        grade2.setText("2.50");
    }

    @FXML
    private void grade2_8Action(ActionEvent event) {
        grade2.setText("2.25");
    }

    @FXML
    private void grade2_9Action(ActionEvent event) {
        grade2.setText("2.00");
    }

    @FXML
    private void grade2_10Action(ActionEvent event) {
        grade2.setText("0.00");
    }

    @FXML
    private void grade3_1Action(ActionEvent event) {
        grade3.setText("4");
    }

    @FXML
    private void grade3_2Action(ActionEvent event) {
        grade3.setText("3.75");
    }

    @FXML
    private void grade3_3Action(ActionEvent event) {
        grade3.setText("3.50");
    }

    @FXML
    private void grade3_4Action(ActionEvent event) {
        grade3.setText("3.25");
    }

    @FXML
    private void grade3_5Action(ActionEvent event) {
        grade3.setText("3.00");
    }

    @FXML
    private void grade3_6Action(ActionEvent event) {
        grade3.setText("2.75");
    }

    @FXML
    private void grade3_7Action(ActionEvent event) {
        grade3.setText("2.50");
    }

    @FXML
    private void grade3_8Action(ActionEvent event) {
        grade3.setText("2.25");
    }

    @FXML
    private void grade3_9Action(ActionEvent event) {
        grade3.setText("2.00");
    }

    @FXML
    private void grade3_10Action(ActionEvent event) {
        grade3.setText("0.00");
    }

    @FXML
    private void grade4_1Action(ActionEvent event) {
        grade4.setText("4");
    }

    @FXML
    private void grade4_2Action(ActionEvent event) {
        grade4.setText("3.75");
    }

    @FXML
    private void grade4_3Action(ActionEvent event) {
        grade4.setText("3.50");
    }

    @FXML
    private void grade4_4Action(ActionEvent event) {
        grade4.setText("3.25");
    }

    @FXML
    private void grade4_5Action(ActionEvent event) {
        grade4.setText("3.00");
    }

    @FXML
    private void grade4_6Action(ActionEvent event) {
        grade4.setText("2.75");
    }

    @FXML
    private void grade4_7Action(ActionEvent event) {
        grade4.setText("2.50");
    }

    @FXML
    private void grade4_8Action(ActionEvent event) {
        grade4.setText("2.25");
    }

    @FXML
    private void grade4_9Action(ActionEvent event) {
        grade4.setText("2.00");
    }

    @FXML
    private void grade4_10Action(ActionEvent event) {
        grade4.setText("0.00");
    }

    @FXML
    private void grade5_1Action(ActionEvent event) {
        grade5.setText("4");
    }

    @FXML
    private void grade5_2Action(ActionEvent event) {
        grade5.setText("3.75");
    }

    @FXML
    private void grade5_3Action(ActionEvent event) {
        grade5.setText("3.50");
    }

    @FXML
    private void grade5_4Action(ActionEvent event) {
        grade5.setText("3.25");
    }

    @FXML
    private void grade5_5Action(ActionEvent event) {
        grade5.setText("3.00");
    }

    @FXML
    private void grade5_6Action(ActionEvent event) {
        grade5.setText("2.75");
    }

    @FXML
    private void grade5_7Action(ActionEvent event) {
        grade5.setText("2.50");
    }

    @FXML
    private void grade5_8Action(ActionEvent event) {
        grade5.setText("2.25");
    }

    @FXML
    private void grade5_9Action(ActionEvent event) {
        grade5.setText("2.00");
    }

    @FXML
    private void grade5_10Action(ActionEvent event) {
        grade5.setText("0.00");
    }

    @FXML
    private void grade6_1Action(ActionEvent event) {
        grade6.setText("4");
    }

    @FXML
    private void grade6_2Action(ActionEvent event) {
        grade6.setText("3.75");
    }

    @FXML
    private void grade6_3Action(ActionEvent event) {
        grade6.setText("3.50");
    }

    @FXML
    private void grade6_4Action(ActionEvent event) {
        grade6.setText("3.25");
    }

    @FXML
    private void grade6_5Action(ActionEvent event) {
        grade6.setText("3.00");
    }

    @FXML
    private void grade6_6Action(ActionEvent event) {
        grade6.setText("2.75");
    }

    @FXML
    private void grade6_7Action(ActionEvent event) {
        grade6.setText("2.50");
    }

    @FXML
    private void grade6_8Action(ActionEvent event) {
        grade6.setText("2.25");
    }

    @FXML
    private void grade6_9Action(ActionEvent event) {
        grade6.setText("2.00");
    }

    @FXML
    private void grade6_10Action(ActionEvent event) {
        grade6.setText("0.00");
    }

    @FXML
    private void grade7_1Action(ActionEvent event) {
        grade7.setText("4");
    }

    @FXML
    private void grade7_2Action(ActionEvent event) {
        grade7.setText("3.75");
    }

    @FXML
    private void grade7_3Action(ActionEvent event) {
        grade7.setText("3.50");
    }

    @FXML
    private void grade7_4Action(ActionEvent event) {
        grade7.setText("3.25");
    }

    @FXML
    private void grade7_5Action(ActionEvent event) {
        grade7.setText("3.00");
    }

    @FXML
    private void grade7_6Action(ActionEvent event) {
        grade7.setText("2.75");
    }

    @FXML
    private void grade7_7Action(ActionEvent event) {
        grade7.setText("2.50");
    }

    @FXML
    private void grade7_8Action(ActionEvent event) {
        grade7.setText("2.25");
    }

    @FXML
    private void grade7_9Action(ActionEvent event) {
        grade7.setText("2.00");
    }

    @FXML
    private void grade7_10Action(ActionEvent event) {
        grade7.setText("0.00");
    }

    @FXML
    private void grade8_1Action(ActionEvent event) {
        grade8.setText("4");
    }

    @FXML
    private void grade8_2Action(ActionEvent event) {
        grade8.setText("3.75");
    }

    @FXML
    private void grade8_3Action(ActionEvent event) {
        grade8.setText("3.50");
    }

    @FXML
    private void grade8_4Action(ActionEvent event) {
        grade8.setText("3.25");
    }

    @FXML
    private void grade8_5Action(ActionEvent event) {
        grade8.setText("3.00");
    }

    @FXML
    private void grade8_6Action(ActionEvent event) {
        grade8.setText("2.75");
    }

    @FXML
    private void grade8_7Action(ActionEvent event) {
        grade8.setText("2.50");
    }

    @FXML
    private void grade8_8Action(ActionEvent event) {
        grade8.setText("2.25");
    }

    @FXML
    private void grade8_9Action(ActionEvent event) {
        grade8.setText("2.00");
    }

    @FXML
    private void grade8_10Action(ActionEvent event) {
        grade8.setText("0.00");
    }

    @FXML
    private void grade9_1Action(ActionEvent event) {
        grade9.setText("4");
    }

    @FXML
    private void grade9_2Action(ActionEvent event) {
        grade9.setText("3.75");
    }

    @FXML
    private void grade9_3Action(ActionEvent event) {
        grade9.setText("3.50");
    }

    @FXML
    private void grade9_4Action(ActionEvent event) {
        grade9.setText("3.25");
    }

    @FXML
    private void grade9_5Action(ActionEvent event) {
        grade9.setText("3.00");
    }

    @FXML
    private void grade9_6Action(ActionEvent event) {
        grade9.setText("2.75");
    }

    @FXML
    private void grade9_7Action(ActionEvent event) {
        grade9.setText("2.50");
    }

    @FXML
    private void grade9_8Action(ActionEvent event) {
        grade9.setText("2.25");
    }

    @FXML
    private void grade9_9Action(ActionEvent event) {
        grade9.setText("2.00");
    }

    @FXML
    private void grade9_10Action(ActionEvent event) {
        grade9.setText("0.00");
    }

    @FXML
    private void grade10_1Action(ActionEvent event) {
        grade10.setText("4");
    }

    @FXML
    private void grade10_2Action(ActionEvent event) {
        grade10.setText("3.75");
    }

    @FXML
    private void grade10_3Action(ActionEvent event) {
        grade10.setText("3.50");
    }

    @FXML
    private void grade10_4Action(ActionEvent event) {
        grade10.setText("3.25");
    }

    @FXML
    private void grade10_5Action(ActionEvent event) {
        grade10.setText("3.00");
    }

    @FXML
    private void grade10_6Action(ActionEvent event) {
        grade10.setText("2.75");
    }

    @FXML
    private void grade10_7Action(ActionEvent event) {
        grade10.setText("2.50");
    }

    @FXML
    private void grade10_8Action(ActionEvent event) {
        grade10.setText("2.25");
    }

    @FXML
    private void grade10_9Action(ActionEvent event) {
        grade10.setText("2.00");
    }

    @FXML
    private void grade10_10Action(ActionEvent event) {
        grade10.setText("0.00");
    }

    @FXML
    private void semester2Action(ActionEvent event) {
    }

    @FXML
    private void semester3Action(ActionEvent event) {
    }

    @FXML
    private void semester4Action(ActionEvent event) {
    }

    @FXML
    private void semester5Action(ActionEvent event) {
    }

    @FXML
    private void semester6Action(ActionEvent event) {
    }

    @FXML
    private void semester7Action(ActionEvent event) {
    }

    @FXML
    private void semester8Action(ActionEvent event) {
    }

    @FXML
    private void calculateAction(ActionEvent event) {
    }

}
