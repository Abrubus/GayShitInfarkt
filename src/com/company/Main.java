package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) { launch();}


    @Override
    public void start (Stage stage) throws Exception {

Class.forName("org.postgresql.Driver");



        Button button = new Button("АРБУЗИК");
        button.setLayoutX(20);
        button.setLayoutY(20);
        TextField textField = new TextField("asd");
        Group group = new Group(button,textField);

        Parent root = FXMLLoader.load(getClass().getResource("/Arbuzik.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("ХОЧУ АРБУЗИК");

        stage.show();
    }

}
