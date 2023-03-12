package com.jmc.tilepane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        TilePane firstPane = createTilePane(Pos.CENTER_LEFT);
        TilePane secondPane = createTilePane(Pos.CENTER_RIGHT);
        HBox root = new HBox(10,firstPane,secondPane);
        Scene scene = new Scene(root,550,500);
        stage.setScene(scene);
        stage.setTitle("Tile Pane Layout");
        stage.show();
    }

    public TilePane createTilePane(Pos tileAlignment){
        TilePane pane = new TilePane(10,10);
        pane.setPrefColumns(3);
        pane.setTileAlignment(tileAlignment);
        Button[] buttons = new Button[]{
                new Button("Tiles"),
                new Button("are"),
                new Button("aligned"),
                new Button("at"),
                new Button(tileAlignment.toString())
        };
        pane.getChildren().addAll(buttons);
        return pane;
    }

    public static void main(String[] args) {
        launch();
    }
}
