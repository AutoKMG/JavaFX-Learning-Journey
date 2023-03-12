package com.jmc.stackpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        StackPane stackPane = new StackPane();
        Rectangle rectangle = new Rectangle(400,150);
        rectangle.setFill(Color.DARKGREEN);
        Label label = new Label("Rectangle");
        label.setTextFill(Color.WHITE);
        stackPane.setAlignment(Pos.BASELINE_CENTER);
        stackPane.getChildren().addAll(rectangle,label);
        Scene scene = new Scene(stackPane,600,300);
        stage.setScene(scene);
        stage.setTitle("StackPane Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
