package com.pms.assign1.views;

import com.pms.assign1.controllers.MainController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainView extends HBox {

    public MainView(Stage primaryStage) {
        MainController mainController = new MainController();
        this.setSpacing(20);
        Button buttonPath = new Button("View Path Shape");
        Button buttonShear = new Button("View Shear Shape");

        buttonPath.setPrefSize(200, 20);
        buttonShear.setPrefSize(200, 20);

        buttonPath.setOnAction(event -> mainController.onButtonPathPressed(primaryStage));
        buttonShear.setOnAction(event -> mainController.onButtonShearPressed(primaryStage));

        this.getChildren().addAll(buttonPath, buttonShear);

        this.setAlignment(Pos.CENTER);
    }
}
