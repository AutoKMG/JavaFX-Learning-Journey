package com.jmc.textflow;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        TextFlow textFlow = new TextFlow();
        Text heading = new Text("My motive");
        Text paragraph = new Text("\n1% improvement in yourself a day, and in 100 days, boom, you will be 100% improved." +
                "\nThe point is that most of the people always want an instant award for their effort." +
                "\nSo, not so many has the mentality of investing in something to harvest it later."+
                "\nI really understand because most of Gen Z suffer from very low attention span."+
                "\nI am thanking TikTok and short videos mostly for that."+
                "\nLadies and gentlemen, my dear peers, always remember that easy come go."+
                "\nComfort is not perceived by comfort.");
        heading.setFill(Color.CORNFLOWERBLUE);
        textFlow.setTextAlignment(TextAlignment.LEFT);
        textFlow.setLineSpacing(1.5);
        textFlow.setPrefWidth(400);
        textFlow.setPadding(new Insets(20,20,20,20));
        textFlow.getChildren().addAll(heading,paragraph);
        Scene scene = new Scene(textFlow, 600,400);
        stage.setScene(scene);
        stage.setTitle("TextFlow Layout");
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
