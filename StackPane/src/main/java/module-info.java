module com.jmc.stackpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.stackpane to javafx.fxml;
    exports com.jmc.stackpane;
}