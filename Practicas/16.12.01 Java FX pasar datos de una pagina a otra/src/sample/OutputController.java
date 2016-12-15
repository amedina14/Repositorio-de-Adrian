package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class OutputController {

    @FXML   Button btn_volver;
    @FXML   TextArea resultado;
    @FXML   Button btn_salir2;

    public void volver(ActionEvent actionEvent) {

    }

    public void setResultado(String r) {
        resultado.setText(r);

    }


    public void limpiar(javafx.event.ActionEvent actionEvent) {
        
    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}
