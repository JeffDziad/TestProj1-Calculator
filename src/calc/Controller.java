package calc;

import com.sun.javafx.image.IntPixelGetter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private TextArea myScreen;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;

    private List<String> entries = new ArrayList<>();

    private double solution = 0;

    public void one(ActionEvent e) {
        toEntryScreen("1");
    }

    public void two(ActionEvent e) {
        toEntryScreen("2");
    }

    public void three(ActionEvent e) {
        toEntryScreen("3");
    }

    public  void four (ActionEvent e) {
        toEntryScreen("4");
    }

    public void five(ActionEvent e) {
        toEntryScreen("5");
    }

    public void six(ActionEvent e) {
        toEntryScreen("6");
    }

    public void seven(ActionEvent e) {
        toEntryScreen("7");
    }

    public void eight(ActionEvent e) {
        toEntryScreen("8");
    }

    public void nine(ActionEvent e) {
        toEntryScreen("9");
    }

    public void zero(ActionEvent e) {
        toEntryScreen("0");
    }

    public void plus(ActionEvent actionEvent) {
        toEntryScreen("+");
    }

    public void minus(ActionEvent actionEvent) {
        toEntryScreen("-");
    }

    public void divide(ActionEvent actionEvent) {
        toEntryScreen("/");
    }

    public void multiply(ActionEvent actionEvent) {
        toEntryScreen("*");
    }

    public void point(ActionEvent actionEvent) {
        toEntryScreen(".");
    }

    public void rParenth(ActionEvent actionEvent) {
        toEntryScreen(")");
    }

    public void lParenth(ActionEvent actionEvent) {
        toEntryScreen("(");
    }

    public void toEntryScreen(String entry) {
        entries.add(entry);
        myScreen.setText("");
        StringBuilder output = new StringBuilder();
        for(String i: entries) {
            output.append(i);
        }
        myScreen.setText(String.valueOf(output));
    }

    public void equals(ActionEvent actionEvent) {
        double op1, op2;
        for(String entry: entries) {
            try {
                op1 = Integer.parseInt(entry);
                //Below code - IS number;
            }catch (Exception)
        }
    }

}
