package com.jmc.anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        AnchorPane root = new AnchorPane();
        Button button = new Button("Top Left");
        Button button1 = new Button("Bottom Right");

        AnchorPane.setTopAnchor(button, 15.0);
        AnchorPane.setLeftAnchor(button, 15.0);

        AnchorPane.setBottomAnchor(button1, 15.0);
        AnchorPane.setRightAnchor(button1,15.0);

        root.getChildren().addAll(button, button1);

        Scene scene = new Scene(root, 750,500);
        stage.setScene(scene);
        stage.setTitle("Anchor Pane Layout Example");
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
