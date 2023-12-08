package com.example.mesapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void buttonCall() {

        try {
            HelloApplication helloApplication = new HelloApplication();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Call.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            //css
            Stage currentStage = helloApplication.getStages();
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}