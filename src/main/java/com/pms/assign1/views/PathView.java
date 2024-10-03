package com.pms.assign1.views;

import com.pms.assign1.controllers.PathController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class PathView extends VBox {
    PathController pathController = new PathController();
    Stage primaryStage;
    public PathView(Stage primaryStage) {
        this.primaryStage = primaryStage;

        HBox buttons = new HBox(300, viewCode(), backToMain());
        buttons.setAlignment(Pos.BASELINE_CENTER);

        this.setSpacing(100);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(createShape(), buttons);
    }

    private Shape createShape() {
        Path shape = new Path(
                new MoveTo(200, 100),
                new VLineTo(200),
                new CubicCurveTo(250, 250, 300, 150, 350, 200),
                new VLineTo(100),
                new HLineTo(200)
        );

        shape.setFill(Color.TRANSPARENT);
        shape.setStroke(Color.BLACK);

        return shape;
    }

    private Button viewCode() {
        Button button = new Button("View Code");
        button.setPrefSize(100, 50);

        button.setOnAction(event -> pathController.onViewCodeButtonClicked(primaryStage));
        return button;
    }

    private Button backToMain() {
        Button button = new Button("Back");
        button.setPrefSize(100, 50);

        button.setOnAction(event -> pathController.onBackButtonClicked(primaryStage));
        return button;
    }
}
