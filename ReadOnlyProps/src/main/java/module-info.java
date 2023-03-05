module com.javafxlearning.readonlyprops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxlearning.readonlyprops to javafx.fxml;
    exports com.javafxlearning.readonlyprops;
}