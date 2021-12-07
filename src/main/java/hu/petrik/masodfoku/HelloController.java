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
        double dA = Double.parseDouble(a.getText());
        double dB = Double.parseDouble(b.getText());
        double dC = Double.parseDouble(c.getText());
        double diszkriminans = (dB * dB) - (4 * dA * dC);
        if(diszkriminans < 0){
            eredmeny.setText("Nem oldható meg a\nvalós számok halmazán");
        }
        else {
            double x1 = ((-1 * dB) + Math.sqrt(diszkriminans)) / (2 * dA);
            double x2 = ((-1 * dB) - Math.sqrt(diszkriminans)) / (2 * dA);
            if(x1 == x2){
                eredmeny.setText(String.format("x1 = x2 = %.3f", x1));
            }
            else{
                eredmeny.setText(String.format("x1 = %.3f\nx2 = %.3f", x1, x2));
            }
        }
    }
}