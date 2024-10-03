package com.pms.assign1.controllers;

import com.pms.assign1.views.MainView;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShearController {
    private Stage primaryStage;

    public ShearController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void  onViewCodePressed(Stage primaryStage) {
        Pane pane = new Pane();

        Image image = new Image (getClass().getResource("/images/code.png").toString());
        ImageView imageView = new ImageView(image);

        pane.getChildren().add(imageView);

        Scene codeScene = new Scene(pane, 570 ,650);

        primaryStage.setScene(codeScene);
    }

    public void onBackPressed(Stage primaryStage) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle("Warning!");


        Label msg = new Label("Do you want to proceed?");


        VBox dialogContent = new VBox(10, msg);


        dialog.getDialogPane().setContent(dialogContent);


        ButtonType okButton = new ButtonType("OK");
        ButtonType cancelButton = new ButtonType("Cancel");
        dialog.getDialogPane().getButtonTypes().addAll(okButton, cancelButton);


        dialog.showAndWait().ifPresent(result -> {
            if (result == okButton) {
                Scene scene = new Scene(new MainView(primaryStage), 500, 500);

                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
    }
}
