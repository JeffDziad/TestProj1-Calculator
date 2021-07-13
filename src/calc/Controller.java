package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea myScreen;
    private String entries = "";

    public void one(ActionEvent e) {
        entries += "1";
        myScreen.setText(entries);
    }

    public void two(ActionEvent e) {
        entries += "2";
        myScreen.setText(entries);
    }

    public void three(ActionEvent e) {
        entries += "3";
        myScreen.setText(entries);
    }


    public  void four (ActionEvent e) {
        entries += "4";
        myScreen.setText(entries);
    }

    public void five(ActionEvent e) {
        entries += "5";
        myScreen.setText(entries);
    }

    public void six(ActionEvent e) {
        entries += "6";
        myScreen.setText(entries);
    }

    public void seven(ActionEvent e) {
        entries += "7";
        myScreen.setText(entries);
    }

    public void eight(ActionEvent e) {
        entries += "8";
        myScreen.setText(entries);
    }

    public void nine(ActionEvent e) {
        entries += "9";
        myScreen.setText(entries);
    }

    public void zero(ActionEvent e) {
        entries += "0";
        myScreen.setText(entries);
    }

}
