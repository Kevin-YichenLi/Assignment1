package com.pms.assign1;

import com.pms.assign1.views.MainView;
import com.pms.assign1.views.PathView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.util.Locale;

public class MainApp extends Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new MainView(primaryStage), 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
