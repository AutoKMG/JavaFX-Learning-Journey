package com.jmc.borderpane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override

    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();

        // Left Nodes
        ListView<String> FruitList = new ListView<>();
        ObservableList<String> items = FXCollections.observableArrayList();
        items.add("Apple");
        items.add("Strawberry");
        items.add("Guava");
        FruitList.setItems(items);

        // Top Nodes
        Label topLabel = new Label("Fruits tracker application");
        topLabel.setPadding(new Insets(15,0,15,15));

        // Right Nodes
        Label rightLabel = new Label("Total number of fruits: " + FruitList.getItems().size());
        rightLabel.setRotate(0);
        rightLabel.setPadding(new Insets(0,30,0,0));

        // Bottom Nodes
        Label bottomLabel = new Label("Recently Added Fruit: " + FruitList.getItems().get(items.size() - 1));
        bottomLabel.setPadding(new Insets(15,0,15,15));

        // Center Nodes
        TextField textField = new TextField();
        Button addButton = new Button("Add Fruit");
        HBox centerContainer = new HBox(textField,addButton);
        addButton.setOnMouseClicked(mouseEvent -> {
            items.add(textField.getText());
            rightLabel.setText("Total number of fruits: " + FruitList.getItems().size());
            bottomLabel.setText("Recently Added Fruit: " + FruitList.getItems().get(items.size() - 1));
            textField.clear();
        });

        borderPane.setLeft(FruitList);
        borderPane.setTop(topLabel);
        borderPane.setRight(rightLabel);
        borderPane.setBottom(bottomLabel);
        borderPane.setCenter(centerContainer);

        Scene scene = new Scene(borderPane, 900,600);
        stage.setScene(scene);
        stage.setTitle("BorderPane Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
