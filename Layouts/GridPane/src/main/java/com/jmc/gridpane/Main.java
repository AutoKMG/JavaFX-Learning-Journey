package com.jmc.gridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        VBox vBox = new VBox();
        vBox.setSpacing(30);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10,10,10,10));
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Label label = new Label("First Name");
        TextField textField = new TextField();
        Button button = new Button("Comment");
        TextArea textArea = new TextArea();
        textArea.setPromptText("Enter your comment here");
        gridPane.addRow(0, label,textField,button);
        gridPane.add(textArea, 0, 1, GridPane.REMAINING, 1);

        GridPane gridPane1 = new GridPane();
        for(int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                Button b = new Button(col + "|" + row);
                gridPane1.add(b,col,row);
            }
        }
        ColumnConstraints cc1 = new ColumnConstraints(100);
        cc1.setHalignment(HPos.LEFT);
        ColumnConstraints cc2 = new ColumnConstraints(200);
        cc2.setHalignment(HPos.CENTER);
        ColumnConstraints cc3 = new ColumnConstraints(200);
        cc3.setHalignment(HPos.RIGHT);

        RowConstraints rc1 = new RowConstraints(50);
        rc1.setValignment(VPos.TOP);
        RowConstraints rc2 = new RowConstraints(70);
        rc2.setValignment(VPos.CENTER);
        RowConstraints rc3 = new RowConstraints(60);
        rc3.setValignment(VPos.BOTTOM);

        gridPane1.getColumnConstraints().addAll(cc1,cc2,cc3);
        gridPane1.getRowConstraints().addAll(rc1,rc2,rc3);

        vBox.getChildren().addAll(gridPane,gridPane1);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("Practice GridPane");
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
