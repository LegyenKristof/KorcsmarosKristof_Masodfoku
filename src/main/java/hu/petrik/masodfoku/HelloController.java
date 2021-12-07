package hu.petrik.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    public TextField a;
    @FXML
    public TextField b;
    @FXML
    public TextField c;
    @FXML
    public Label eredmeny;

    @FXML
    public void szamol(MouseEvent mouseEvent) {
        if(a.getText() != "" && b.getText() != "" && c.getText() != ""){
            try{
                Double.parseDouble(a.getText());
                Double.parseDouble(b.getText());
                Double.parseDouble(c.getText());
                kiszamol();
            }
            catch (Exception e){
                eredmeny.setText("A mezőkbe valós\nszámokat kell megadnia");
            }
        }
        else{
            eredmeny.setText("Minden mező\nkitöltése kötelező");
        }
    }

    private void kiszamol(){

    }
}