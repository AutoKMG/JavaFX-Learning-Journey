package com.jmc.hbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setFillHeight(false);
        TextArea textArea = new TextArea();
        Label label = new Label("Hello World!");
        HBox.setHgrow(textArea, Priority.ALWAYS);
        HBox.setMargin(textArea, new Insets(0,20,0,10));
        hBox.getChildren().addAll(label, textArea);
        Scene scene = new Scene(hBox,750,500);
        stage.setScene(scene);
        stage.setTitle("HBox");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
