package sample;

/**
 * Create by: maciejziolkowski on 21 gru 2017
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jssc.SerialPortException;
import sample.Controller.Controller;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI/GUI.fxml"));
        primaryStage.setTitle("Serial Communication");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) throws SerialPortException {
        launch(args);
    }
}
