package com.kmgfirstfx.firstapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage){
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Let me introduce myself!");
        button.setOnAction(e -> text.setText("My name is Khaled Saleh\nthis is my first JavaFX application"));
        Scene scene = new Scene(root, 300,300);
        root.getChildren().addAll(text,button);
        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();
    }
}