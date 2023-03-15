package com.jmc.group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Button one = new Button("One");
        Button two = new Button("Two");
        one.setLayoutX(60);
        one.setLayoutY(40);
        two.layoutXProperty().bind(one.layoutXProperty().add(one.widthProperty().add(20)));
        two.layoutYProperty().bind(one.layoutYProperty());
        group.setEffect(new DropShadow());
        group.setRotate(20);
        group.getChildren().addAll(one,two);
        Scene scene = new Scene(group, 550,500);
        stage.setTitle("Group Layout");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}
