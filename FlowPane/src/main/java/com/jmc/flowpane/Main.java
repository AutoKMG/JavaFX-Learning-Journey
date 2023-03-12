package com.jmc.flowpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        FlowPane flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.setHgap(20);
        flowPane.setVgap(15);
        flowPane.setColumnHalignment(HPos.RIGHT);
        Button button = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        TextArea textArea = new TextArea();
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        flowPane.getChildren().addAll(button,button2,button3,textArea, button4,button5,button6);
        Scene scene = new Scene(flowPane, 600,550);
        stage.setScene(scene);
        stage.setTitle("FlowPane Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
