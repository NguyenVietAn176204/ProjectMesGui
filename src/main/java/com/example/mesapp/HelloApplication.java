package com.example.mesapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stages;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stages = stage;
        stage.show();
    }
    public Stage getStages() {
        return this.stages;
    }

    public static void main(String[] args) {
        launch();
    }
}