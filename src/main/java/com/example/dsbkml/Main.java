package com.example.dsbkml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml")); // Correct path
            StackPane root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Payroll Management System");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}