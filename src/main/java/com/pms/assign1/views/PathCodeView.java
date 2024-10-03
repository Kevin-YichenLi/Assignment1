package com.pms.assign1.views;

import com.pms.assign1.controllers.PathCodeController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PathCodeView extends VBox {
    // counter for the number of button "More" being clicked
    int count;

    // two first images to be displayed
    Image code1 = new Image(this.getClass().getResource("/images/code1.png").toExternalForm());
    Image code2 = new Image(this.getClass().getResource("/images/code2.png").toExternalForm());
    ImageView imageView1 = new ImageView(code1);
    ImageView imageView2 = new ImageView(code2);
    PathCodeController pathCodeController = new PathCodeController(this);
    Stage primaryStage;
    HBox imageContainer;

    public PathCodeView(Stage primaryStage) {
        this.primaryStage = primaryStage;
        count = 0;

        imageContainer = new HBox(20, imageView1, imageView2);
        imageContainer.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(1000, createMoreButton(), createBackButton());

        this.setSpacing(50);
        this.getChildren().addAll(imageContainer, buttons);
    }

    private Button createMoreButton() {
        Button more = new Button("More");

        more.setPrefSize(100, 50);
        more.setOnAction(event -> {
            count++; // Increment the counter
            pathCodeController.onMoreClicked(this);
        });

        return more;
    }
    private Button createBackButton() {
        Button back = new Button("Back");

        back.setPrefSize(100, 50);
        back.setOnAction(event -> pathCodeController.onBackClicked(primaryStage));

        return back;
    }

    public void setImage(ImageView imageView1, ImageView imageView2) {
        imageContainer.getChildren().clear();
        imageContainer.getChildren().addAll(imageView1, imageView2);
    }

    public int getCount() {
        return count;
    }
}
