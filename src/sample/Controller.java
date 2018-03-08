package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML
    public Label disPlay;
    public Button btn_Explosive;
    public ImageView exPloded;

    @FXML
    public void pressButton(ActionEvent event) {
        btn_Explosive.setVisible(false);
        exPloded.setVisible(true);
        disPlay.setText("BOOOM!");
    }
}
