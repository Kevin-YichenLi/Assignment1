package com.pms.assign1.controllers;

import com.pms.assign1.views.PathCodeView;
import com.pms.assign1.views.PathView;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PathCodeController {
    // The rest images of code
    Image code3 = new Image(this.getClass().getResource("/images/code3.png").toExternalForm());
    Image code4 = new Image(this.getClass().getResource("/images/code4.png").toExternalForm());
    Image code5 = new Image(this.getClass().getResource("/images/code5.png").toExternalForm());
    Image code6 = new Image(this.getClass().getResource("/images/code6.png").toExternalForm());
    Image code7 = new Image(this.getClass().getResource("/images/code7.png").toExternalForm());

    ImageView imageView3 = new ImageView(code3);
    ImageView imageView4 = new ImageView(code4);
    ImageView imageView5 = new ImageView(code5);
    ImageView imageView6 = new ImageView(code6);
    ImageView imageView7 = new ImageView(code7);

    PathCodeView pathCodeView;

    public PathCodeController(PathCodeView pathCodeView) {
        this.pathCodeView = pathCodeView;
    }

    public void onBackClicked(Stage primaryStage) {
        PathView pathView = new PathView(primaryStage);
        Scene newScene = new Scene(pathView, 500, 500);
        primaryStage.setScene(newScene);
        primaryStage.centerOnScreen();
    }

    public void onMoreClicked(PathCodeView pathCodeView) {
        if (pathCodeView.getCount() == 1) {
            pathCodeView.setImage(imageView3, new ImageView());
        }

        if (pathCodeView.getCount() == 2) {
            pathCodeView.setImage(imageView4, imageView5);
        }

        if (pathCodeView.getCount() == 3) {
            pathCodeView.setImage(imageView6, imageView7);
        }
    }
}
