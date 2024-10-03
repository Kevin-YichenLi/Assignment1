package com.pms.assign1.controllers;

import com.pms.assign1.views.MainView;
import com.pms.assign1.views.PathCodeView;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class PathController {
    public void onViewCodeButtonClicked(Stage primaryStage) {
        PathCodeView pathCodeView = new PathCodeView(primaryStage);
        Scene newScene = new Scene(pathCodeView, 1700, 900);
        primaryStage.setScene(newScene);
        primaryStage.centerOnScreen();
    }

    public void onBackButtonClicked(Stage primaryStage) {
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Confirmation");
        confirmationAlert.setContentText("Do you really want to go back to main scene?");

        Optional<ButtonType> result = confirmationAlert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            MainView mainView = new MainView(primaryStage);
            Scene newScene = new Scene(mainView, 500, 500);
            primaryStage.setScene(newScene);
            primaryStage.centerOnScreen();
        }
    }
}
