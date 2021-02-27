package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField txtFld;
    @FXML
    public TextArea txtArea;

    public void onClickBtnOk(ActionEvent actionEvent) {
        txtArea.appendText(txtFld.getText() + "\n");
        txtFld.requestFocus();
        txtFld.clear();
    }

    public void enterPress(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            txtArea.appendText(txtFld.getText() + "\n");
            txtFld.requestFocus();
            txtFld.clear();
            }
        }
    }