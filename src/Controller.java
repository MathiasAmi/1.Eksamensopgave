import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {

    @FXML
    private TextField textField;




    public void readMediaFolder(ActionEvent actionEvent) {
        Main.readMediaFolder(Main.MEDIA_MAPPE);

        textField.setText("hej");


    }
}
