package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {

    @FXML
    Button btn_salir;
    @FXML
    Button btn_enviar;
    @FXML
    RadioButton sexo_f;
    @FXML
    RadioButton sexo_h;
    @FXML
    DatePicker nacimiento;
    @FXML
    TextField nombre;
    @FXML
    Button btn_limpiar;

public void salir(ActionEvent actionEvent){
    Platform.exit();
}

    public void limpiar(ActionEvent actionEvent) {

        sexo_h.setSelected(false);
        sexo_f.setSelected(false);
        sexo_h.setSelected(false);
        nombre.setText("");
        nacimiento.setValue(null);
    }

    public void enviar(ActionEvent actionEvent) throws IOException {
        String nom = nombre.getText();
        Boolean hom = sexo_h.isSelected();
        Boolean muj = sexo_f.isSelected();
        String sex = "N/A";
        if (hom == true)
            sex = "hombre";
        if (muj == true)
            sex = "mujer";
        LocalDate nac = nacimiento.getValue();
        Stage stage = (Stage) btn_enviar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        OutputController contoller = fxmlLoader.<OutputController>getController();
        contoller.setResultado("La persona llamada " + nom +"nacida el " + nac + ", es un(a) "+sex );
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
