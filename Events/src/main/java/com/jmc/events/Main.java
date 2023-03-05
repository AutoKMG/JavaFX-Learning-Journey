package com.jmc.events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Label label = new Label("Click the button!");
        Label label1 = new Label("Current mouse position X: Y: ");
        Label label2 = new Label("Current pressed key: ");
        Button button = new Button("Change the text");
        button.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> label.setText("Thank you for clicking me!")); // label changes only by clicking
        // button.setOnAction(actionEvent -> label.setText("Thank you for clicking me!")); // label changes by clicking the button or hitting enter
        root.getChildren().addAll(label,button,label1,label2);
        // root.addEventFilter(MouseEvent.MOUSE_CLICKED, Event::consume); // cancelling the mouse clicking
        Scene scene = new Scene(root,550,500);
        scene.setOnMouseMoved(mouseEvent -> {
            label1.setText(String.format("Current mouse position X: %.0f Y: %.0f",mouseEvent.getX(),mouseEvent.getY()));
        });
        scene.setOnKeyPressed(keyEvent -> label2.setText(String.format("Current pressed key %s",keyEvent.getText())));
        stage.setTitle("Events");
        stage.setOnShowing(windowEvent -> System.out.println("Stage is being shown"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
