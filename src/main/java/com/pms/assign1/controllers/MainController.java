package com.pms.assign1.controllers;

import com.pms.assign1.views.PathView;
import com.pms.assign1.views.ShearView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    public void onButtonPathPressed(Stage primaryStage) {
        PathView pathView = new PathView(primaryStage);
        Scene newScene = new Scene(pathView, 500, 500);
        primaryStage.setScene(newScene);
        primaryStage.centerOnScreen();
    }

    public void onButtonShearPressed(Stage primaryStage) {
        ShearView shearView = new ShearView(primaryStage);
        Scene newScene = new Scene(shearView, 500, 500);
        primaryStage.setScene(newScene);
        primaryStage.centerOnScreen();
    }
}
