package com.javaprops.props;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Employee employee = new Employee("Khaled",2000);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Label label = new Label("Khaled's salary right now is "+employee.getSalary());
        Button button = new Button("Double Khaled's salary now!");
        button.setOnAction(e ->{
            int salary = employee.getSalary();
            employee.setSalary(salary*2);
        });
        employee.getSalaryProperty().addListener(e->label.setText("Khaled's salary right now is "+employee.getSalary()));
        root.getChildren().addAll(label,button);
        Scene scene = new Scene(root, 550,500);
        stage.setTitle("Khaled's Salary");
        stage.setScene(scene);
        stage.show();
    }
}
