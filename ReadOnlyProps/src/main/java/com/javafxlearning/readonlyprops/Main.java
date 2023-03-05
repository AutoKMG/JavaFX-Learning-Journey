package com.javafxlearning.readonlyprops;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.LightBase;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Constant constant = new Constant(100);
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());
        Label label = new Label(String.format("%d",constant.getReadOnlyNumber().get()));
        TextField textField = new TextField();
        textField.setMaxWidth(200);
        Button button = new Button("Bind label to this field, Only Numbers!");
        button.setOnAction(actionEvent -> label.textProperty().bind(textField.textProperty()));
        ObservableList<String> list = FXCollections.observableArrayList("One","Two","Three");
        ListView<String> items = new ListView<>();
        items.setItems(list);
        TextField textField1 = new TextField();
        textField1.setMaxWidth(200);
        Button button1 = new Button("Add to the list");
        button1.setOnAction(actionEvent -> {
            if(!textField1.textProperty().get().isEmpty()){
                list.add(textField1.getText());
            }
        });
        root.getChildren().addAll(label,textField,button,items,textField1,button1);
        Scene scene = new Scene(root, 550,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
