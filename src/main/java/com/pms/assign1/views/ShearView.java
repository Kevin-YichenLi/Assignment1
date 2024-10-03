package com.pms.assign1.views;

import com.pms.assign1.controllers.ShearController;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

public class ShearView extends Pane {
    public ShearView(Stage primaryStage ){

        ShearController controller = new ShearController(primaryStage);

        Rectangle rectangle = new Rectangle (150,100,200,100);
        Rectangle rectangle2 = new Rectangle (150,100,200,100);

        rectangle.setFill(Color.LIGHTGRAY);
        rectangle.setStroke(Color.BLACK);

        rectangle2.setFill(Color.TRANSPARENT);
        rectangle2.setStroke(Color.BLACK);

        Shear shear = new Shear(0.5,0.5,150,100);

        rectangle2.getTransforms().add(shear);

        this.getChildren().add(rectangle);
        this.getChildren().add(rectangle2);

        Button viewCode = new Button ("View Code");
        Button back = new Button ("Back");

        viewCode.setPrefSize(200, 20);
        back.setPrefSize(200, 20);

        viewCode.setLayoutX(10);
        viewCode.setLayoutY(400);

        back.setLayoutX(290);
        back.setLayoutY(400);

        viewCode.setOnAction(e -> controller.onViewCodePressed(primaryStage));
        back.setOnAction(e -> controller.onBackPressed(primaryStage));

        this.getChildren().addAll(viewCode, back);
    }
}
