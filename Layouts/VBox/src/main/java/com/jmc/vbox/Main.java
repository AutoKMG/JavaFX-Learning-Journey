package com.jmc.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.setFillWidth(true);
        TextArea textArea = new TextArea();
        VBox.setMargin(textArea, new Insets(0,20,0,20));
        vBox.getChildren().add(textArea);
        Scene scene = new Scene(vBox,600,550);
        stage.setScene(scene);
        stage.setTitle("HBox Layout Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
