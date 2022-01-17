import javafx.fxml.FXML;

import java.util.ResourceBundle;
    import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
    public class Arbuzik {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private ImageView Image;

        @FXML
        private TextField SCORE;

        @FXML
        private Button BAN;

        @FXML
        private TextField LOGIN;

        @FXML
        private TextField passwordElement;

        @FXML
        private TextField loginElement;

        @FXML
        void BAN(ActionEvent event) {

        }

        @FXML
        void LOGIN(ActionEvent event) {

        }

        @FXML
        void SCORE(ActionEvent event) {

        }

        @FXML
        void onLogin(ActionEvent event) {
            System.out.println("Логин: "+ loginElement.getText());
            System.out.println("Пароль: "+ passwordElement.getText());

        }

        @FXML
        void initialize() {
            assert Image != null : "fx:id=\"Image\" was not injected: check your FXML file 'Arbuzik.fxml'.";
            assert SCORE != null : "fx:id=\"SCORE\" was not injected: check your FXML file 'Arbuzik.fxml'.";
            assert BAN != null : "fx:id=\"BAN\" was not injected: check your FXML file 'Arbuzik.fxml'.";
            assert LOGIN != null : "fx:id=\"LOGIN\" was not injected: check your FXML file 'Arbuzik.fxml'.";

        }
    }


